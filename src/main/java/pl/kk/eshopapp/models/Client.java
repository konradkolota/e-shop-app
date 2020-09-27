package pl.kk.eshopapp.models;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private Long nip;
    private String mail;

    @OneToOne
    private Address deliveryAddress;
    @OneToOne
    private Address userAddress;


}

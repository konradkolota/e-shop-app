package pl.kk.eshopapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "klienci")
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "imie")
    private String firstName;
    @Column(name = "nazwisko")
    private String lastName;
    private Long nip;
    private String mail;

    @OneToOne
    private Address deliveryAddress;
    @OneToOne
    private Address userAddress;


}

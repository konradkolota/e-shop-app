package pl.kk.eshopapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nazwa")
    private String name;

}

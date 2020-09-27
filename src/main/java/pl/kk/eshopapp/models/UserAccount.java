package pl.kk.eshopapp.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "icon_url")
    private String imageUrl;
    @Column(name = "communication")
    private String communicationPrefs;

    @OneToMany
    private List<Role> roles;
    @OneToOne
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCommunicationPrefs() {
        return communicationPrefs;
    }

    public void setCommunicationPrefs(String communicationPrefs) {
        this.communicationPrefs = communicationPrefs;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

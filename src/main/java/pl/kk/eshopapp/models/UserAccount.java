package pl.kk.eshopapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "konta_uzytkownikow")
public class UserAccount {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "haslo", nullable = false)
    private String password;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "url_ikony")
    private String imageUrl;
    @Column(name = "kanal_komunikacji")
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

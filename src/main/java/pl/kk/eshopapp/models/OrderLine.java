package pl.kk.eshopapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "linia_zamowien")
public class OrderLine {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "ilosc_produktu")
    private Integer productQuantity;
    @Column(name = "cena", precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany
    @JoinColumn(name = "id_linii")
    private List<Product> products;

}

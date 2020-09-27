package pl.kk.eshopapp.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity")
    private Integer productQuantity;
    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany
    @JoinColumn(name = "line_id")
    private List<Product> products;

}

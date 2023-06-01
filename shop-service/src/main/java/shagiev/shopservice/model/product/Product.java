package shagiev.shopservice.model.product;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "products")
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    public ProductCategory category;

}

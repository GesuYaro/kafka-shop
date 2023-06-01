package shagiev.shopservice.model.product;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    @Column(name = "name")
    public String name;

}

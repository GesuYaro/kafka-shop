package shagiev.shopservice.model.receipt;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import shagiev.shopservice.model.customer.Customer;
import shagiev.shopservice.model.product.Product;
import shagiev.shopservice.model.shop.Shop;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "receipts")
@NoArgsConstructor
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    @Column(name = "date")
    public LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    public Customer customer;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    public Shop shop;

    @ElementCollection
    @MapKeyJoinColumn(name = "product_id")
    public Map<Product, Integer> productsMap;
}

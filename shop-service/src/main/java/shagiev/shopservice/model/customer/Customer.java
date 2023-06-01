package shagiev.shopservice.model.customer;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "customers")
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    @Column(name = "firstname")
    public String firstname;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    public Gender gender;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "email")
    public String email;
}

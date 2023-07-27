package com.javaEcomerce.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @Column(name = "id_customer", columnDefinition = "INT", nullable = false)
    private Integer idCustomer;

    @Column(nullable = false, columnDefinition = "VARCHAR(60)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String address;

    @Column( nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "phone_number", columnDefinition = "VARCHAR(50)" )
    private String phoneNumber;

    @Column(name = "password", columnDefinition = "VARCHAR(50)" )
    private String password;
}

package com.makival.shop.domain.bean;

import com.makival.shop.domain.enumeration.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Kiryl Karatkevich
 * @since February 12, 2019
 */
@Entity
@Table(name = "PRODUCTS")
@SecondaryTable(
        name = "PRODUCT_PRICE",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "product_id", referencedColumnName = "id"))
@SecondaryTable(
        name = "PRODUCT_QUANTITY",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "product_id", referencedColumnName = "id"))
public class Product extends Bean {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ProductType type;
    @Column(name = "description")
    private String description;
    @Column(table = "PRODUCT_QUANTITY", name = "quantity")
    private int quantity;
    @Column(table = "PRODUCT_PRICE", name = "price")
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Objects.equals(name, product.name) &&
                type == product.type &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, type, description, quantity, price);
    }
}

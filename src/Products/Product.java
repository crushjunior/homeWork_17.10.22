package Products;

import java.util.*;

public class Product {
    private final String name;
    private Double price;
    private Double weight;


    public Product(String name, Double price, Double weight) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }

       setPrice(price);
        setWeight(weight);

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        if (price <= 0 || price == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight <= 0 || weight == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product products = (Product) o;
        return Objects.equals(name, products.name) && Objects.equals(price, products.price) && Objects.equals(weight, products.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return  name +
                ", цена: " + price +
                ", вес: " + weight ;
    }
}

package Products;

import java.util.*;

public class ProductSet {
    private Set<Product> productSet;

    public ProductSet() {
       productSet = new HashSet<>();
    }

    public void addProduct(Product product) throws RuntimeException {
        try {
            if (!productSet.contains(product)) {
                productSet.add(product);
            } else {
                throw new RuntimeException(product.getName() + " уже в списке");
            }
        } catch (RuntimeException e)  {
            System.out.println(e.getMessage());
        }

    }

    public void removeProduct(Product product) {
        if (productSet.contains(product)) {
            productSet.remove(product);
        } else {
            throw new IllegalArgumentException(product.getName() + " уже нет в списке");
        }
    }

    public Double sumPriceProduct(){
        double sum = 0;
        for (Product product : productSet) {
            sum += (product.getPrice() * product.getWeight());
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSet that = (ProductSet) o;
        return Objects.equals(productSet, that.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet);
    }

    @Override
    public String toString() {
        return "ProductSet{" +
                "productSet=" + productSet +
                '}';
    }
}

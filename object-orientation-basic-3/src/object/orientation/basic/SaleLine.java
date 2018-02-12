package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine {

    private final Product product;
    private final Integer quantity;

    private SaleLine(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public static SaleLine getSaleLineService(Product product) {
        return new SaleLine(product, 1);
    }

    public static SaleLine getSaleLineProduct(Product product, Integer quantity) {
        return new SaleLine(product, quantity);
    }

    public Double getLineTotal() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

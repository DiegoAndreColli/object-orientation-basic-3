package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine {

    private final Product produto;
    private final Integer quantity;

    private SaleLine(Product product, Integer quantity) {
        this.produto = product;
        this.quantity = quantity;
    }

    public static SaleLine getSaleLineService(Product product) {
        return new SaleLine(product, 1);
    }

    public static SaleLine getSaleLineProduct(Product product, Integer quantity) {
        return new SaleLine(product, quantity);
    }

    public Double getLineTotal() {
        return produto.getPrice() * quantity;
    }

    public Product getProduto() {
        return produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

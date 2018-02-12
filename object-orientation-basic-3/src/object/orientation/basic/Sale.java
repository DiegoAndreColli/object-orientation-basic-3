package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class Sale {

    private Customer customer;
    private List<SaleLine> lines;
    private Double total;
    private Double discount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<SaleLine> getLines() {
        return lines;
    }

    public void setLines(List<SaleLine> lines) {
        this.lines = lines;
    }

    public void calcTotal() {
        total = 0d;
        for (SaleLine line : lines) {
            total += line.getLineTotal();
        }
    }

    public Double getTotal() {
        return total;
    }

    public void  calcDiscounts() {
        discount = 0d;
        if(customer != null && customer.getAge() > 70)
            discount = total * 0.1;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getValueToPay(){
        return total - discount;
    }

}
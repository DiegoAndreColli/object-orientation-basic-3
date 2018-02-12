package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class Sale {

    private Customer customer;
    private List<SaleLine> lines;    

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

    public Double getTotal() {
        Double total = 0d;
        for (SaleLine line : lines) {
            total += line.getLineTotal();
        }
        
        if(customer != null && customer.getAge() > 70)
            total = (total * 0.9);
        
        return total;
    }

}

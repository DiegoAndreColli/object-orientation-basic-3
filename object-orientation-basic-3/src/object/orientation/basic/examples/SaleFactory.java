package object.orientation.basic.examples;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.Customer;
import object.orientation.basic.Product;
import object.orientation.basic.Sale;
import object.orientation.basic.SaleLine;

/**
 *
 * @author User
 */
public class SaleFactory {

    public static Sale getSale() {
        Sale sale = new Sale();
        sale.setCustomer(getCustomer());
        sale.setLines(getItens());        
        return sale;
    }

    private static Customer getCustomer() {
        return new Customer("123456789", "Willian Oak", 60 );        
    }

    private static List<SaleLine> getItens() {
        List<SaleLine> list = new ArrayList<>();
        list.add(SaleLine.getSaleLineProduct(new Product("Bread", 0.20), 10));
        list.add(SaleLine.getSaleLineProduct(new Product("Lampada", 2.20), 7));
        list.add(SaleLine.getSaleLineProduct(new Product("Lamp", 8000d), 1));
        list.add(SaleLine.getSaleLineProduct(new Product("Toothpaste", 5d), 3));
        return list;
    }


}

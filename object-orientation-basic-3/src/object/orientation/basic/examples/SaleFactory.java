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

    public static Sale getRegularSale() {
        Sale sale = new Sale();
        sale.setCustomer(new Customer("123456789", "Willian Oak", 60 ));
        sale.setLines(getItens());        
        return sale;
    }

    public static Sale getAncientSale() {
        Sale sale = new Sale();
        sale.setCustomer(new Customer("987654321", "Thomaz Franz", 90 ));
        sale.setLines(getItens());        
        return sale;
    }
    
    private static List<SaleLine> getItens() {
        List<SaleLine> list = new ArrayList<>();
        list.add(new SaleLine(new Product("Bread", 0.20), 10));
        list.add(new SaleLine(new Product("Lampada", 2.20), 7));
        list.add(new SaleLine(new Product("Lamp", 8000d), 1));
        list.add(new SaleLine(new Product("Toothpaste", 5d), 3));
        return list;
    }

}

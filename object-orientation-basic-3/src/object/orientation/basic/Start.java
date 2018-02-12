package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Sale> list = new ArrayList<>();
        Sale sale = SaleFactory.getSaleNFE();
        list.add(sale);
        InvoiceModule.send(list);
    }

}

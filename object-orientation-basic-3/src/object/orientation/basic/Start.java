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

        Sale sale1 = SaleFactory.getSaleNFEXML();
        Sale sale2 = SaleFactory.getSaleNFCEXML();
        Sale sale3 = SaleFactory.getSaleNFSEXML();

        list.add(sale1);
        list.add(sale2);
        list.add(sale3);

        FiscalService.send(list);
    }

}

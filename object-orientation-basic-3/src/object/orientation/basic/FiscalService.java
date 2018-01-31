package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class FiscalService {

    public static void send(List<Sale> list) {
        for (Sale sale : list) {
            send(sale);
        }
    }

    public static void send(Sale sale) {
        print(sale);
    }

    private static void print(Sale sale) {
        System.out.println(sale.getNfXml());
    }

}

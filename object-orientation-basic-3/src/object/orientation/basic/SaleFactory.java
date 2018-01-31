package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SaleFactory {

    public static Sale getSaleNFEXML() {
        Sale sale = new Sale();
        sale.setCustomer(getCustomer());
        sale.setLines(getItens());
        sale.setNf(new NFEXML());
        return sale;
    }

    public static Sale getSaleNFCEXML() {
        Sale sale = new Sale();
        sale.setLines(getItens());
        sale.setNf(new NFCEXML());
        return sale;
    }

    public static Sale getSaleNFSEXML() {
        Sale sale = new Sale();
        sale.setCustomer(getCustomer());
        sale.setLines(getServices());
        sale.setNf(new NFSEXML());
        return sale;
    }

    private static Customer getCustomer() {
        Customer cliente = new Customer();
        cliente.setName("Willian Oak");
        cliente.setId("123456789");
        return cliente;
    }

    private static List<SaleLine> getItens() {
        List<SaleLine> list = new ArrayList<>();
        list.add(SaleLine.getSaleLineProduct(new Product("Pãozinho", 0.20), 10));
        list.add(SaleLine.getSaleLineProduct(new Product("Lampada", 2.20), 7));
        list.add(SaleLine.getSaleLineProduct(new Product("Bicicleta", 8000d), 1));
        list.add(SaleLine.getSaleLineProduct(new Product("Pasta de Dente", 5d), 3));
        return list;
    }

    private static List<SaleLine> getServices() {
        List<SaleLine> list = new ArrayList<>();
        list.add(SaleLine.getSaleLineService(new Product("Formatação computador", 50d)));
        list.add(SaleLine.getSaleLineService(new Product("Limpeza do banheiro", 150d)));
        return list;
    }

}

package object.orientation.basic;

import object.orientation.basic.examples.SaleFactory;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sale sale = SaleFactory.getSale();
        
        CashRegister.sell(sale);
    }

}

package object.orientation.basic;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class CashRegister {
    
    public static void sell(Sale sale){
        
        String welcome = String.format("%35s", " Welcome ");
        String headers = String.format("%-40s", "Product")
                .concat(String.format("%-15s", "Price"))
                .concat(String.format("%-15s", "Quantity"))
                .concat(String.format("%15s", "Total"));
        
        
        

        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder lines = new StringBuilder();
        for (SaleLine line : sale.getLines()) {
            String show = String.format("%-40s", line.getProduct().getName())
               .concat(String.format("%-15s", df.format(line.getProduct().getPrice())))
               .concat(String.format("%-15s", line.getQuantity()))
               .concat(String.format("%15s", df.format(line.getLineTotal())))
               .concat("\n");
            
            lines.append(show);            
        }
        
        String total = String.format("%-70s", "Total: ").concat(String.format("%15s", df.format(sale.getTotal())));
        String totalWithDiscounts = String.format("%-70s", "Final Total: ").concat(String.format("%15s", df.format(sale.getTotal())));
        
        System.out.println(welcome);
        System.out.println(headers);
        System.out.println();
        System.out.println(lines);
        System.out.println();
        System.out.println(total);
        System.out.println(totalWithDiscounts);
        
        sale.getTotal();        
    }
    
    
}

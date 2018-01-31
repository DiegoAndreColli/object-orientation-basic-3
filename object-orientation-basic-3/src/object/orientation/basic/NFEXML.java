package object.orientation.basic;

/**
 *
 * @author User
 */
public class NFEXML extends NFXMLProducts {

    @Override
    String getXMLHeader(Sale sale) {
        StringBuilder xml = new StringBuilder("\n\t<header>");
        xml.append("\n\t\t<operation>").append("NFE").append("</operation>");        
        xml.append("\n\t\t<customer>");
            xml.append("\n\t\t\t<id>").append(sale.getCustomer().getId()).append("</id>");
            xml.append("\n\t\t\t<name>").append(sale.getCustomer().getName()).append("</name>");
        xml.append("\n\t\t</customer>");
        xml.append("\n\t</header>");
        return xml.toString();
    }


}

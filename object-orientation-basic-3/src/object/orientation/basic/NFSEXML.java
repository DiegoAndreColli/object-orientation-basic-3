package object.orientation.basic;

/**
 *
 * @author User
 */
public class NFSEXML implements NFXML {

    @Override
    public String toXml(Sale sale) {
        StringBuilder xml = new StringBuilder("<xml version=\"1.0\" >");
        xml.append(getXMLHeader(sale));
        xml.append(getXMLBody(sale));
        xml.append("\n</xml>");
        return xml.toString();
    }

    private String getXMLHeader(Sale sale) {
        StringBuilder xml = new StringBuilder("\n\t<header>");
        xml.append("\n\t\t<operation>").append("NFSE").append("</operation>");
        xml.append("\n\t\t<customer>");
            xml.append("\n\t\t\t<id>").append(sale.getCustomer().getId()).append("</id>");
            xml.append("\n\t\t\t<name>").append(sale.getCustomer().getName()).append("</name>");
        xml.append("\n\t\t</customer>");
        xml.append("\n\t</header>");
        return xml.toString();
    }

    private String getXMLBody(Sale sale) {
        StringBuilder xml = new StringBuilder("\n\t<services>");
        for (SaleLine linha : sale.getLines()) {
            xml.append("\n\t\t<service>");
            xml.append("\n\t\t\t<name>").append(linha.getProduto().getName()).append("</name>");
            xml.append("\n\t\t\t<price>").append(linha.getProduto().getPrice()).append("</price>"); 
            xml.append("\n\t\t</service>");
        }
        xml.append("\n\t</services>");
        return xml.toString();
    }
}

package object.orientation.basic;

/**
 *
 * @author User
 */
public abstract class NFXMLProducts implements NFXML{
    
    abstract String getXMLHeader(Sale sale);
    
    @Override
    public String toXml(Sale sale){
        
        StringBuilder xml = new StringBuilder("<xml version=\"1.0\" >");
        xml.append(getXMLHeader(sale));
        xml.append(getXMLBody(sale));
        xml.append("\n</xml>");
        return xml.toString();
    }
    
    private String getXMLBody(Sale sale){
        StringBuilder xml = new StringBuilder("\n\t<items>");
        for (SaleLine linha : sale.getLines()) {
            xml.append("\n\t\t<item>");
            xml.append("\n\t\t\t<name>").append(linha.getProduto().getName()).append("</name>");
            xml.append("\n\t\t\t<price>").append(linha.getProduto().getPrice()).append("</price>");
            xml.append("\n\t\t\t<quantity>").append(linha.getQuantity()).append("</quantity>");
            xml.append("\n\t\t\t<total>").append(linha.getLineTotal()).append("</total>");
            xml.append("\n\t\t</item>");
        }
        xml.append("\n\t</items>");
        return xml.toString();
    }
    
}

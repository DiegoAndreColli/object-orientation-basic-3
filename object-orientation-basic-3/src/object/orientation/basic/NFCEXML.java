package object.orientation.basic;

/**
 *
 * @author User
 */
public class NFCEXML extends NFXMLProducts {

    @Override
    String getXMLHeader(Sale sale) {
        StringBuilder xml = new StringBuilder("\n\t<header>");
            xml.append("\n\t\t<operation>").append("NFCE").append("</operation>");
        xml.append("\n\t</header>");
        return xml.toString();
    }

}

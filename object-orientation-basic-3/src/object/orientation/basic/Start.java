package object.orientation.basic;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee intern = new Intern("Joel");
        Employee manager = new Manager("William Soros Gates");
        Employee analyst = new SystemsAnalyst("Diego Colli");

        intern.receivePayment(100.0);
        analyst.receivePayment(1000.0);
        manager.receivePayment(4000.0);

        System.out.println(intern.getName() + " " + intern.getSalary());
        System.out.println(analyst.getName() + " " + analyst.getSalary());
        System.out.println(manager.getName() + " " + manager.getSalary());

    }

}

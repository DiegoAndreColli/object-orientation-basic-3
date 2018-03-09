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
        BonusControl control = new BonusControl();

        Manager employee1 = new Manager();
        employee1.setSalary(5000.0);
        control.register(employee1);

        Employee employee2 = new Manager();
        employee2.setSalary(1000.0);
        control.register(employee2);

        System.out.println(control.getTotal());
        
//        Employee intern = new Intern("Joel");
//        Employee manager = new Manager("William Soros Gates");
//        Employee analyst = new SystemsAnalyst("Diego Colli");

//        intern.receivePayment(100.0);
//        analyst.receivePayment(1000.0);
//        manager.receivePayment(4000.0);
//
//        intern.sumTotalRemuneration();
//        analyst.sumTotalRemuneration();
//        manager.sumTotalRemuneration();
//
//        show(intern);
//        show(analyst);
//        show(manager);
    }

    public static void show(Employee employee) {

//        String reportLine = String.format("%-40s", employee.getName())
//                .concat(String.format("%15s", employee.getRemuneration()));

//        System.out.println(reportLine);

    }

}

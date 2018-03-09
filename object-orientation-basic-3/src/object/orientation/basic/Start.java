package object.orientation.basic;

/**
 *
 * @author User
 */
public class Start {
    
    private static final BonusControl CONTROL = new BonusControl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                

        Secretary secretary = new Secretary();
        secretary.setName("Monica Lebinsk");
        secretary.setSalary(3000.0);
        CONTROL.register(secretary);
        
        Engineer engineer = new Engineer();
        engineer.setName("Diego Colli");
        engineer.setSalary(4000.0);
        CONTROL.register(engineer);
        
        Employee manager = new Manager();
        manager.setName("Felipe Belo");
        manager.setSalary(5000.0);
        CONTROL.register(manager);

        Employee director = new Director();
        director.setName("Bill Soros");
        director.setSalary(6000.0);
        CONTROL.register(director);
        
        Employee president = new President();
        president.setName("Sidarta Gautama");
        president.setSalary(10000.0);
        CONTROL.register(president);

        show();
    }

    public static void show() {

        StringBuilder report = new StringBuilder();
        for (Employee employee : CONTROL.getEmployees()) {
            report.append(String.format("%-40s", employee.getName())
                .concat(String.format("%15s", employee.getSalary()))
            .concat("\n"));            
        }
        
        System.out.print(report);
        System.out.print(String.format("%-40s", "Bonus total:"));
        System.out.print(String.format("%15s", CONTROL.getTotal()));

    }

}

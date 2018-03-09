
package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
class BonusControl {
    
    List<Employee> employees = new ArrayList();
    private double total = 0;
    
    public void register(Employee employee) {
        this.employees.add(employee);
    }

    public double getTotal() {
        for (Employee employee : employees) {
            total += employee.getBonus();
        }
        return total;
    }

    public List<Employee> getEmployees() {
        return employees;
    }    
    
}
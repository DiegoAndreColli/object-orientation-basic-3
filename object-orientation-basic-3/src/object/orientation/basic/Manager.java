package object.orientation.basic;

/**
 *
 * @author User
 */
public class Manager extends Employee {

    public Manager(String name) {        
        super("Mr. "+name);
    }

    @Override
    public Double getBonus() {
        return this.salary * 0.3;
    }

}

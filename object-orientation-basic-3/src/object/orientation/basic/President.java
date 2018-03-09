package object.orientation.basic;

/**
 *
 * @author User
 */
public class President extends Employee {

    @Override
    public Double getBonus() {
        return this.salary * 0.25;
    }

}

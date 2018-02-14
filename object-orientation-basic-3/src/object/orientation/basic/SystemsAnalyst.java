package object.orientation.basic;

/**
 *
 * @author User
 */
public class SystemsAnalyst extends Employee {

    public SystemsAnalyst(String name) {
        super(name);
        this.name = this.name.substring(0, this.name.indexOf(' '));
    }

    @Override
    public Double getBonus() {
        return this.salary * 0.1;
    }

}


package object.orientation.basic;

/**
 *
 * @author User
 */
class BonusControl {

    private double total = 0;

    public void register(Employee employee) {
        this.total += employee.getBonus();
    }

    public double getTotal() {
        return this.total;
    }
}
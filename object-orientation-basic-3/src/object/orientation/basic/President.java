package object.orientation.basic;

/**
 *
 * @author User
 */
public class President extends Employee {
    
    @Override
    public void setName(String name) {
        super.setName("Mr/Ms "+name); 
    }

    @Override
    public Double getBonus() {
        return 10000.00;
    }

}

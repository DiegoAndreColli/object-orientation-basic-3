package object.orientation.basic;

/**
 *
 * @author User
 */
public class Director extends Manager {

    //this is how you can invoke the superclass constructor
    public Director() {
        super();//needs to be the first command
        this.setCreditCard("1234 1234 1234 1234");
   }
    
    @Override
    public Double getBonus() {
        return super.getBonus() + 2000;
    }

}

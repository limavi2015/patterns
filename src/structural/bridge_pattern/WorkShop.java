package structural.bridge_pattern;

 /* bridge between types of vehicles and concrete workshops (implementors)
 to perform manufacturing work with the work() method.
 */
public abstract class WorkShop {

    public abstract void work(Vehicle vehicle);

}
package structural.bridge_pattern;

public class Bike extends Vehicle {

    @Override
    public void manufacture() {
        System.out.println("Manufactoring Bike...");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 5;
    }

}
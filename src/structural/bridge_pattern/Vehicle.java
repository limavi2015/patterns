package structural.bridge_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected List<WorkShop> workshops = new ArrayList<>();

    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int minWorkTime();

}
import java.util.HashSet;
import java.util.Set;

public class WashingMachine {
    private int water;
    private int capacity;
    Set<Washable> loadedObjects;

    public WashingMachine() {
        this.loadedObjects = new HashSet<Washable>();
    }

    public void load(Washable object) {
        loadedObjects.add(object);
    }

    public Set<Washable> wash() {
        loadedObjects.forEach(object -> object.onWash());
        Set<Washable> result = new HashSet<>();
        loadedObjects.forEach(object -> result.add(object));
        loadedObjects.clear();
        return result;
    }

    /**
     * @return int return the water
     */
    public int getWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(int water) {
        this.water = water;
    }

    /**
     * @return int return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
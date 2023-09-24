import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();

        LinkedList<Washable> washables = new LinkedList<Washable>();

        washables.add(new Shirt("black"));
        washables.add(new Shirt("yellow"));
        washables.add(new Pants("cotton"));

        System.out.println("Objects to wash:");
        washables.forEach(object -> System.out.println(object.toString()));

        washables.forEach(object -> machine.load(object));

        Set<Washable> washedObjects = machine.wash();

        System.out.println("Objects washed: ");
        System.out.println(washedObjects.toString());

        System.out.println("Objects to wash again:");
        washedObjects.stream().filter(object -> object.shouldBeWashed())
                .forEach(object -> System.out.println(object.toString()));
    }
}
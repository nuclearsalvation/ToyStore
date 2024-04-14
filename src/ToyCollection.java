import java.util.Collection;
import java.util.Random;
import java.util.ArrayList;

public class ToyCollection {
    private Collection<Toy> toyCollection = new ArrayList<>();
    private static Random random = new Random();
    public Collection<Toy> getCollection(){
        return toyCollection;
    }
    public void putToy(Toy toy){
        toyCollection.add(toy);
    }
    public void removeToy(Toy toy){
        toyCollection.remove(toy);
    }
    public Toy getToy(){
        Object[] toyArray = toyCollection.toArray();
        Toy gotToy = (Toy) toyArray[random.nextInt(toyArray.length)];
        toyCollection.remove(gotToy);
        return gotToy;
    }

}

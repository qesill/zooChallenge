import java.util.ArrayList;
import java.util.Iterator;

public class Zoo <T extends Animal> {
    private ArrayList<T> animals;
    public Zoo() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal(T animal){
        this.animals.add(animal);
    }

    public void printAllAnimals(){
        Iterator<T> iterator = animals.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next().toString();
            System.out.println(str);
        }
    }

}

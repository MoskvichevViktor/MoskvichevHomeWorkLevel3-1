package j3hw1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void fillBox(Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

    public float getWeightBox() {
        if(!fruits.isEmpty()){
            return fruits.size()*fruits.get(0).getWeight();
        } else return 0.0f;
    }

    public boolean compare(Box<?> box) {
        return this.getWeightBox() == box.getWeightBox();
    }
}
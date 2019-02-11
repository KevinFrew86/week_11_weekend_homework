import java.util.ArrayList;

public class Passenger {
        private String name;
        private ArrayList<Bag> bags;

    public Passenger(String name){
        this.name = name;
        this.bags = new ArrayList<Bag>();
    }

    public String getName() {
        return this.name;
    }


    public int bagCount() {
        return this.bags.size();
    }

    public void addBag(Bag bag) {
        this.bags.add(bag);
    }

    public Bag removeBag() {
        return this.bags.remove(0);
    }
}

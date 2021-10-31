class Fish{
    int weight;
}
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void eat(int n){
        fish.weight = fish.weight + n;
    }
}
public class FishandLake {
    public static void main(String[] args) {
        Fish niqiu = new Fish();
        System.out.println("泥鳅的重量" + niqiu.weight);
        Lake lake1 = new Lake();
        lake1.setFish(niqiu);
        lake1.eat(30);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1中泥鳅的重量" + lake1.fish.weight);
        Lake lake2 = new Lake();
        lake2.setFish(niqiu);
        lake2.eat(100);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1泥鳅的重量" + lake1.fish.weight);
        System.out.println("lake2中泥鳅的重量" + lake2.fish.weight);
        Lake lake3 = new Lake();
        lake3.setFish(niqiu);
        lake3.eat(170);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1泥鳅的重量" + lake1.fish.weight);
        System.out.println("lake2中泥鳅的重量" + lake2.fish.weight);
        System.out.println("lake3中泥鳅的重量" + lake3.fish.weight);
    }

}

import java.util.*;

public class main {

    public static void main(String[] args) {

        List<HotDrink> newList = new LinkedList<>();

        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine(newList);

        HotDrink coffee = new HotDrink("Americano", 30.0, 300, 70);
        HotDrink blackTea = new HotDrink("Earl grey", 35.0, 500, 85);

        newList.add(coffee);
        newList.add(blackTea);

        System.out.println(machine1.getProduct("Americano", 300, 70));
        System.out.println(machine1.getProduct("Earl grey", 500, 85));
    }
}
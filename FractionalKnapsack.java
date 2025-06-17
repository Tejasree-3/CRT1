import java.util.Arrays;
import java.util.Comparator;
class FractionalKnapsack {
    int value;
    int weight;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}
class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double ratioA = (double) a.value / a.weight;
        double ratioB = (double) b.value / b.weight;
        return Double.compare(ratioB, ratioA); 
    }
}
public class FractionalKnapsack {
    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items, new ItemComparator());
        double totalValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += (double) item.value / item.weight * remainingCapacity;
                break;
            }
        }
        return totalValue;
    }


    public static void main(String[] args) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };
        int capacity = 50;
        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value: " + maxValue);
    }
}
import java.util.*;

public class program {

    public static void removeOddNumbers(ArrayList<Integer> array) {
        for (Iterator<Integer> iterator = array.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
               iterator.remove();
            }
        }
    }

    public static void fillList(ArrayList<Integer> array, int amount) {
        for (int i = 0; i < amount; ++i) {
            array.add((int)(Math.random() * 25 + 1));
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        fillList(array, 10);
        System.out.println(array);
        System.out.println();
        removeOddNumbers(array);
        System.out.println(array);
    }
}
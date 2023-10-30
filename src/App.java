import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> mixedNumbers = new ArrayList<Integer>();

        mixedNumbers.add(1);
        mixedNumbers.add(2);
        mixedNumbers.add(3);
        mixedNumbers.add(4);

        Collections.sort(mixedNumbers);

        System.out.println("Sorted arrayList :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            System.out.println(mixedNumbers.get(i));
        }

        System.out.println("\nSquare root of each number :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            System.out.println(Math.sqrt(mixedNumbers.get(i)));
        }

        System.out.println("\nEven numbers :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            if (mixedNumbers.get(i) % 2 == 0) {
                System.out.println(mixedNumbers.get(i));
            }
        }

        System.out.println("\nUsing Stream :\n");

        //Making the same thing using Stream

        System.out.println("Sorted arrayList :");

        mixedNumbers.stream().sorted().forEach((n) -> System.out.println(n));

        System.out.println("\nSquare root of each number :");

        mixedNumbers.stream().sorted().forEach((n) -> System.out.println(Math.sqrt(n)));

        System.out.println("\nEven numbers :");

        mixedNumbers.stream().filter(n->n%2==0).forEach((n) -> System.out.println(n));
    }
}

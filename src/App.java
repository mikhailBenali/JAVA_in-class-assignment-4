import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Double> mixedNumbers = new ArrayList<Double>();

        mixedNumbers.add(1.0);
        mixedNumbers.add(2.0);
        mixedNumbers.add(3.0);
        mixedNumbers.add(4.0);

        System.out.println("\n##############################Without using Stream##############################");

        Collections.sort(mixedNumbers);

        System.out.println("\nSorted arrayList :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            System.out.println(mixedNumbers.get(i));
        }

        System.out.println("\nSquare root of each number :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            mixedNumbers.set(i, Math.sqrt(mixedNumbers.get(i)));
        }

        for (int i = 0; i < mixedNumbers.size(); i++) {
            System.out.println(mixedNumbers.get(i));
        }

        System.out.println("\nEven numbers :");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            if (mixedNumbers.get(i) % 2 != 0) {
                mixedNumbers.remove(i);
                i--;
            }
        }

        System.out.println("\nOur final Array : ");

        for (int i = 0; i < mixedNumbers.size(); i++) {
            System.out.println(mixedNumbers.get(i));
        }

        System.out.println("\n##############################Using Stream##############################");

        //Making the same thing using Stream

        mixedNumbers.removeAll(mixedNumbers);
        mixedNumbers.add(1.0);
        mixedNumbers.add(2.0);
        mixedNumbers.add(3.0);
        mixedNumbers.add(4.0);

        System.out.println("\nSorted arrayList :");

        mixedNumbers.stream().sorted().forEach((n) -> System.out.println(n));

        System.out.println("\nSquare root of each number :");

        mixedNumbers.stream().sorted().map(n->Math.sqrt(n)).forEach((n) -> System.out.println(n));

        System.out.println("\nOur final array :");

        mixedNumbers.stream().sorted().map(n->Math.sqrt(n)).filter(n->n%2==0).forEach((n) -> System.out.println(n));
    }
}

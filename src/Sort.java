import java.util.ArrayList;
import java.util.Collections;

public abstract class Sort {

    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Unsorted ArrayList: " + numbers);

        // shuffle list
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

        // sort list
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // search for position specific int
        int position = Collections.binarySearch(numbers, 4);
        System.out.println("The position of 4 is " + (position + 1));

        // reverse list
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // swap first int with second
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // add numbers to newNumbers
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // fill numbers with 0s
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // copy numbers to newNumbers
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BT1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        int size = random.nextInt(10) + 1;
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("List các số nguyên: " + numbers);

        int maxNumber = Collections.max(numbers);

        System.out.println("Phần tử lớn nhất trong List: " + maxNumber);
    }
}

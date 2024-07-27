import java.util.Arrays;
import java.util.List;

public class BT3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final int[] sum = {0};
        numbers.forEach(number -> sum[0] += number);
        System.out.println("Tổng các phần tử trong danh sách là: " + sum[0]);
    }
}

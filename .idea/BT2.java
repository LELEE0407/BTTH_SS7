import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT2 {
    public static void main(String[] args) {
        String inputString = "Hello, how are you to day?";
        List<String> wordsList = new ArrayList<>(Arrays.asList(inputString.split(" ")));

        System.out.println("Các từ có độ dài lớn hơn 3 ký tự:");
        for (String word : wordsList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}

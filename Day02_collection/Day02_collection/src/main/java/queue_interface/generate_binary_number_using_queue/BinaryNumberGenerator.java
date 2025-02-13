package queue_interface.generate_binary_number_using_queue;
import java.util.ArrayList;
import java.util.List;
public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            result.add(Integer.toBinaryString(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N));
    }
}


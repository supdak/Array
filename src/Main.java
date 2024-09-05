import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int numbers = {1, 2, 3, 4, 5}; Another way to declare Array//
        int[] numbers = new int[5];
        numbers [0] = 5;
        numbers [1] = 2;
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}

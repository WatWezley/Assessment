import java.sql.Array;
import java.util.Arrays;

public class productInArray {

    public static void main(String[] args) {
        int[] number = {1,2,3,4};
        int[]answer = prouctOfArray(number);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] prouctOfArray(int[]number) {

        int[] number2 = new int[number.length];
        for (int x = 0; x < number.length; x++) {
            int product = 1;
            for (int y = 0; y < number.length; y++) {
                int element = number[y];
                product = product * number[y];
            }
            product = product / number[x];
            number2[x] = product;
            product = 1;
        }
        return number2;
    }
}

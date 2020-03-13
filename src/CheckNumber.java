import java.util.Arrays;
import java.util.Scanner;

public class CheckNumber {

    public CheckNumber() {
    }

    public void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość tablicy: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Podaj " + (i+1) + " liczbę.");
            array[i] = scanner.nextInt();
        }
        System.out.println("Podane liczby to: " + Arrays.toString(array));
        System.out.println("Po sortowaniu: " + Arrays.toString(sort(array)));

    }
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        CheckNumber checkNumber = new CheckNumber();
        checkNumber.check();
    }
}

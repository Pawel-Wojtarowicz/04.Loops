import java.util.Scanner;

public class DisplayNumber {

    private int x;

    public DisplayNumber(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        DisplayNumber displayNumber = new DisplayNumber(scanner.nextInt());
        int i = 0;
        for (i = 0; i < displayNumber.getX() + 1; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\nDruga metoda.");
        i = 0;
        while (i < displayNumber.getX() + 1) {
            System.out.print(i +" ");
            i++;
        }
    }

}

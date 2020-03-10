import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactory {

    private int x;

    public ArrayFactory() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int[] oneDimension(int x) {
        return new int[x];
    }
    public int[][] twoDimension(int x) {
        return new int[x][x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayFactory arrayFactory = new ArrayFactory();
        System.out.print("Podaj liczbę: ");
        arrayFactory.setX(scanner.nextInt());
        System.out.println("Tablica jednowymiarowa: " + Arrays.toString(arrayFactory.oneDimension(arrayFactory.getX())));
        System.out.println("Tablica wielowymiarowa: " + Arrays.deepToString(arrayFactory.twoDimension(arrayFactory.getX())));
    }
}

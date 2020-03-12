import java.util.Scanner;

public class Reverse {

    public Reverse() {
    }

    public char[] reverseArray(String string) {
        char[] array = new char[string.length()];
        for (int i = 0; i <string.length(); i++) {
            array[i] = string.charAt(i);
        }
        for(int i = 0; i < array.length / 2; i++)
        {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  temp;
        }
        return array;
    }
    public String reverseString (String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
    public String convertToBinarySystem (int number) {
        return Integer.toBinaryString(number);
    }
    public String convertToBinarySystem2(int number) {
        String string = "";
        while (number > 0) {
            string = ((number % 2) == 0 ? "0" : "1" ) + string;
            number = number/2;
        }
        return string;
    }

    public static void main(String[] args) {

        //https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
        //loops 4,5,6 exercises

        Reverse reverse = new Reverse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tablice do odwrócenia: ");
        String str = scanner.nextLine();
        System.out.println(reverse.reverseArray(str));
        System.out.println("Podaj String do odwrócenia: ");
        String str1 = scanner.nextLine();
        System.out.println(reverse.reverseString(str1));
        System.out.println("Podaj liczbe do skonwertowania ją na system binarny: ");
        int str2 = scanner.nextInt();
        System.out.println(reverse.convertToBinarySystem2(str2));

    }


}

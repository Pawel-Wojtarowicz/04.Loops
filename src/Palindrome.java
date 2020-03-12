import java.util.Scanner;

public class Palindrome {

    private void checkPalindrome(String input) {
        String a ="";
        for (int i = input.length() -1; i >=0; i--) {
            a = a + input.charAt(i);
        }
        if (input.equalsIgnoreCase(a)) {
            System.out.println("Jest palindromem");
        }
        else {
            System.out.println("Nie jest palindromem");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo by sprawdzić czy jest palindromem: ");
        String input = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(input);
    }

}

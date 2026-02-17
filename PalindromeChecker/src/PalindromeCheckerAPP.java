import java.util.Scanner;

public class PalindromeCheckerAPP {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("The given word is a Palindrome.");
        } else {
            System.out.println("The given word is NOT a Palindrome.");
        }

        sc.close();
    }
}
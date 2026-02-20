import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("IS a palindrome?: True");
        } else {
            System.out.println("IS a palindrome?: False");
        }
        scanner.close();
    }
}

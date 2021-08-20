import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> characters = new LinkedList<>();
        checkPalindrome(scanner, characters);
    }

    private static void checkPalindrome(Scanner scanner, Queue<Character> characters) {
        System.out.print("Nhập vào chuỗi cần kiểm tra : ");
        String inputString = scanner.nextLine();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            characters.add(inputString.toLowerCase().charAt(i));
        }

        String reverseString = "";
        while (!characters.isEmpty()) {
            reverseString = reverseString + characters.remove();
        }

        if (inputString.toLowerCase().equals(reverseString)) {
            System.out.println(inputString + " là chuỗi palindrome.");
        } else {
            System.out.println(inputString + " không phải là chuỗi palindrome.");
        }
        characters.clear();
        System.out.println("-----------------------------");
        checkPalindrome(scanner, characters);
    }
}

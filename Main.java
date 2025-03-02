import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print the string for count word: ");
        String str = scanner.nextLine();
        String[] newStr = str.trim().split("\s+");
        int count = newStr.length;
        System.out.println("Word count: " + count);
    }
}

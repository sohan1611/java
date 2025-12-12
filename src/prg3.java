public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;  // Mention the number here
        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is not a Palindrome");
        }
    }
}

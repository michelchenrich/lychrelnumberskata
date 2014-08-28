public class Lychrel {
    public Lychrel(int limit) {
    }

    public int determineIteration(int n) {
        return 0;
    }

    public boolean isPalindrome(int n) {
        char[] digits = Integer.toString(n).toCharArray();

        return digits[0] == digits[digits.length - 1];
    }
}
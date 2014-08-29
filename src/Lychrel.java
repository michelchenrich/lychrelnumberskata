public class Lychrel {
    public Lychrel(int limit) {
    }

    public int determineIteration(int n) {
        if (isPalindrome(n)) return 0;
        return 1;
    }

    public boolean isPalindrome(int n) {
        char[] digits = Integer.toString(n).toCharArray();

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            if (digits[i] != digits[lastIndex - i])
                return false;

        return true;
    }

    public int reverse(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        char[] reversedDigits = new char[digits.length];

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            reversedDigits[lastIndex - i] = digits[i];

        return Integer.parseInt(new String(reversedDigits));
    }
}
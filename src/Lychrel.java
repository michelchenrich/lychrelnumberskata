import java.math.BigInteger;

public class Lychrel {
    public Lychrel(int limit) {
    }

    public int determineIteration(int n) {
        if (isPalindrome(n)) return 0;
        else return 1 + determineIteration(reverse(BigInteger.valueOf(n)).add(BigInteger.valueOf(n)));
    }

    public int determineIteration(BigInteger n) {
        if (isPalindrome(n)) return 0;
        else return 1 + determineIteration(n.add(reverse(n)));
    }

    public boolean isPalindrome(int n) {
        return isPalindrome(BigInteger.valueOf(n));
    }

    public boolean isPalindrome(BigInteger n) {
        char[] digits = n.toString().toCharArray();

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            if (digits[i] != digits[lastIndex - i])
                return false;

        return true;
    }

    public int reverse(int n) {
        return reverse(BigInteger.valueOf(n)).intValue();
    }

    public BigInteger reverse(BigInteger n) {
        char[] digits = n.toString().toCharArray();
        char[] reversedDigits = new char[digits.length];

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            reversedDigits[lastIndex - i] = digits[i];

        return new BigInteger(new String(reversedDigits));
    }
}
import java.math.BigInteger;

public class Lychrel {
    private final int limit;

    public Lychrel(int limit) {
        this.limit = limit;
    }

    public int determineIteration(long n) {
        return determineIteration(BigInteger.valueOf(n), 0);
    }

    private int determineIteration(BigInteger n, int iteration) {
        if (isPalindrome(n) || iteration == limit) return iteration;
        else return determineIteration(n.add(reverse(n)), iteration + 1);
    }

    private boolean isPalindrome(BigInteger n) {
        char[] digits = n.toString().toCharArray();

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            if (digits[i] != digits[lastIndex - i])
                return false;

        return true;
    }

    private BigInteger reverse(BigInteger n) {
        char[] digits = n.toString().toCharArray();
        char[] reversedDigits = new char[digits.length];

        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++)
            reversedDigits[lastIndex - i] = digits[i];

        return new BigInteger(new String(reversedDigits));
    }
}
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LychrelTest {
    private static final int LIMIT = 1000;
    private Lychrel lychrel;

    @Before
    public void setUp() throws Exception {
        lychrel = new Lychrel(LIMIT);
    }

    @Ignore
    @Test
    public void facts() {
        isPalindromAtIteration(0, 0);
        isPalindromAtIteration(11, 0);
        isPalindromAtIteration(56, 1);
    }

    @Test
    public void palindromes() {
        isPalindrome(0);
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(123454321);
    }

    @Test
    public void notPalindromes() {
        isNotPalindrome(12);
        isNotPalindrome(1231);
    }

    private void isNotPalindrome(int n) {
        assertFalse(lychrel.isPalindrome(n));
    }

    private void isPalindrome(int n) {
        assertTrue(lychrel.isPalindrome(n));
    }

    private void isPalindromAtIteration(int n, int iteration) {
        assertEquals(iteration, lychrel.determineIteration(n));
    }
}
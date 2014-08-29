import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LychrelTest {
    private static final int LIMIT = 1000;
    private Lychrel lychrel;

    @Before
    public void setUp() throws Exception {
        lychrel = new Lychrel(LIMIT);
    }

    @Test
    public void facts() {
        isPalindromAtIteration(0, 0);
        isPalindromAtIteration(11, 0);
        isPalindromAtIteration(56, 1);
        isPalindromAtIteration(57, 2);
        isPalindromAtIteration(59, 3);
        isPalindromAtIteration(89, 24);
        isPalindromAtIteration(10911, 55);
        isPalindromAtIteration(196, LIMIT);
    }

    private void isPalindromAtIteration(int n, int iteration) {
        assertEquals(iteration, lychrel.determineIteration(n));
    }
}
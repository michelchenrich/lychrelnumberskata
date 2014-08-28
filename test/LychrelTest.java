import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LychrelTest {
    private static final int LIMIT = 1000;

    @Test
    public void facts() {
        isPalindromAtIteration(0, 0);
        isPalindromAtIteration(11, 0);
    }

    private void isPalindromAtIteration(int n, int iteration) {
        Lychrel lychrel = new Lychrel(LIMIT);
        assertEquals(iteration, lychrel.determineIteration(n));
    }
}
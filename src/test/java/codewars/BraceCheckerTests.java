package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sanghyun KIM on 2019-02-08.
 */
public class BraceCheckerTests {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid1() {
        assertEquals(false, checker.isValid("[(])"));
    }

    @Test
    public void testInvalid2() {
        assertEquals(false, checker.isValid("(}"));
    }

    @Test
    public void testInvalid3() {
        assertEquals(false, checker.isValid("(})"));
    }

    @Test
    public void testInvalid4() {
        assertEquals(false, checker.isValid(")(}{]["));
    }

}

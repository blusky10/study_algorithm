package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CloseStringsTest {

    @Test
    public void test(){
        CloseStrings closeStrings = new CloseStrings();
        boolean a1 = closeStrings.closeStrings("abc", "bca");
        boolean a2 = closeStrings.closeStrings("a", "aa");
        boolean a3 = closeStrings.closeStrings("cabbba", "abbccc");
        boolean a4 = closeStrings.closeStrings("cabbba", "aabbss");
        boolean a5 = closeStrings.closeStrings("abbzzca", "babzzcz");

        Assert.assertTrue(a1);
        Assert.assertFalse(a2);
        Assert.assertTrue(a3);
        Assert.assertFalse(a4);
        Assert.assertFalse(a5);
    }
}

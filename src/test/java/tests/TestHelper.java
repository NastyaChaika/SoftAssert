package tests;

import helper.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHelper {

    public SoftAssert softAssert;

    @BeforeTest
    public void createSoftAssert () {
        softAssert = new SoftAssert();
    }

    @Test (description = "Test with String")
    @Parameters ({"S1", "S2"})
    public void TestString (String s1, String s2) {
        softAssert.softAssertEquals(s1, s2);
    }

    @Test (priority = 1, description = "Test with Integer")
    @Parameters ({"I1", "I2"})
    public void TestInteger (int i1, int i2) {
        softAssert.softAssertEquals(i1, i2);
    }

    @Test (priority = 2, description = "Test with Integer Arrays")
    public void TestIntegerArray () {
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 3, 3};
        softAssert.softAssertEquals(a1, a2);
    }

    @Test (priority = 3, description = "Test with String Arrays")
    public void TestStringArray () {
        String[] a1 = {"a", "b", "c"};
        String[] a2 = {"a", "b", "c"};
        softAssert.softAssertEquals(a1, a2);
    }

    @Test (priority = 4, description = "Test for SoftAssertTrue with false condition")
    public void TestTrueCondition () {
        boolean condition = 1==2;
        softAssert.softAssertTrue(condition);
    }

    @Test (priority = 5, description = "Test for SoftAssertFalse with false condition")
    public void TestFalseCondition () {
        boolean condition = 1==2;
        softAssert.softAssertFalse(condition);
    }
}
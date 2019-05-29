package helper;

import java.util.Arrays;

public class SoftAssertOutput extends SoftAssertObjects {

    protected void outputIfSuccess () {
        System.out.println("Assertion is successful. Expected: " + getExpected().toString() + ", Found: " + getActual().toString());
    }

    protected void outputIfSuccessArray () {
        System.out.println("Assertion is successful. Expected: " + Arrays.toString(getExpectedArray()) + ", Found: " + Arrays.toString(getActualArray()));
    }

    protected void outputIfSuccessCondition () {
        System.out.println("Assertion is successful. Condition is: " + getCondition().toString());
    }

    protected void outputIfFail () {
        System.out.println("Assertion is not successful. Expected: " + getExpected().toString() + ", Found: " + getActual().toString());
    }

    protected void outputIfFailArray () {
        System.out.println("Assertion is not successful. Expected: " + Arrays.toString(getExpectedArray()) + ", Found: " + Arrays.toString(getActualArray()));
    }

    protected void outputIfFailCondition () {
        System.out.println("Assertion is not successful. Condition is: " + getCondition().toString());
    }
}

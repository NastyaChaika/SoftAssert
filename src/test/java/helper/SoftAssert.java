package helper;

public class SoftAssert<T> extends SoftAssertOutput {

    public void softAssertEquals (T[] actual, T[] expected) {
        setExpected(expected);
        setActual(actual);
        try {
            softAssertEqualsArray();
            outputIfSuccessArray();
        }
        catch (AssertionError e) {
            outputIfFailArray();
        }
    }

    public void softAssertEquals (T actual, T expected) {
        setExpected(expected);
        setActual(actual);
        try {
            softAssertEqualsNotArray();
            outputIfSuccess();
        }
        catch (AssertionError e) {
            outputIfFail();
        }
    }

    public void softAssertTrue (boolean condition) {
        setCondition(condition);
        try {
            super.softAssertTrue();
            outputIfSuccessCondition();
        }
        catch (AssertionError e) {
            outputIfFailCondition();
        }
    }

    public void softAssertFalse (boolean condition) {
        setCondition(condition);
        try {
            super.softAssertFalse();
            outputIfSuccessCondition();
        }
        catch (AssertionError e) {
            outputIfFailCondition();
        }
    }
}

package helper;

import org.testng.Assert;

public class SoftAssertObjects<T> {
    private T actual;
    private T expected;
    private T[] actualArray;
    private T[] expectedArray;
    private Boolean condition;

    public void setActual (T actual) {
        this.actual = actual;
    }

    public void setActual (T[] actual) {
        this.actualArray = actual;
    }

    public void setExpected (T expected) {
        this.expected = expected;
    }

    public void setExpected (T[] expected) {
        this.expectedArray = expected;
    }

    public void setCondition (boolean condition) {
        this.condition = condition;
    }

    public T getActual () {
        return this.actual;
    }

    public T[] getActualArray () {
        return this.actualArray;
    }

    public T getExpected () {
        return this.expected;
    }

    public T[] getExpectedArray () {
        return this.expectedArray;
    }

    public Boolean getCondition () {
        return this.condition;
    }

    protected void softAssertEqualsNotArray () {
        Assert.assertEquals(this.actual, this.expected);
    }

    protected void softAssertEqualsArray () {
        Assert.assertEquals(this.actualArray, this.expectedArray);
    }

    protected void softAssertTrue () {
        Assert.assertTrue(this.condition);
    }

    protected void softAssertFalse () {
        Assert.assertFalse(this.condition);
    }
}

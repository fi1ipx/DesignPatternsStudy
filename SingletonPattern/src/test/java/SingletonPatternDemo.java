import org.junit.Assert;
import org.junit.Test;

public class SingletonPatternDemo {

    @Test
    public void singletonPatternTest() {
        SingleObject object = SingleObject.getInstance();
        Assert.assertEquals("Single message", object.showMessage());
        System.out.println(object.showMessage());
    }
}

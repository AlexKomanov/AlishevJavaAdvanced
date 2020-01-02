import org.junit.Assert;
import org.junit.Test;
import unitTesting.Vector2D;

/**
 * @author Alex Komanov
 */
public class Vector2Test {

    @Test
    public void newVectorZeroLength(){
        //Action
        Vector2D v1 = new Vector2D();

        //Assertion
        Assert.assertEquals(0, v1.length(), 1e-9); // delta 1e-9 => 0.0000000001

    }

    @Test
    public void newVectorZeroX(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorZeroY(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), 1e-9);
    }
}

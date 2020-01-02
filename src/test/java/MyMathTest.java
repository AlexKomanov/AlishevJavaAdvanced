import org.junit.Test;
import unitTesting.MyMath;

/**
 * @author Alex Komanov
 */
public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenaminatorShouldThrowException(){
        MyMath.devide(1, 0);

    }
}

import org.junit.Test;
import unitTesting.NetworkUtils;

/**
 * @author Alex Komanov
 */
public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void TestConnection(){
        NetworkUtils.getConnection();
    }
}

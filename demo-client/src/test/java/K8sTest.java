import org.junit.Test;
import org.noear.solon.test.HttpTestBase;

/**
 * @author noear 2021/6/21 created
 */
public class K8sTest extends HttpTestBase {

    @Test
    public void test() {
        while (true) {
            try {
                http("http://172.168.0.163:31767/").get();
                Thread.sleep(100);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

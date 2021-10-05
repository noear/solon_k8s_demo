package demo;

import org.noear.solon.Solon;
import org.noear.solon.cloud.utils.http.HttpUtils;

/**
 * @author noear 2021/6/18 created
 */
public class DemoApp {
    public static void main(String[] args) {
        Solon.start(DemoApp.class, args)
                .onError(e -> e.printStackTrace())
                .get("/", c -> {
                    String rst = HttpUtils.http("demo-api", "/").get();
                    c.output(rst);
                });

        while (true) {
            try {
                HttpUtils.http("http://localhost:" + Solon.cfg().serverPort() + "/").get();
                System.out.println("预势成功");
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

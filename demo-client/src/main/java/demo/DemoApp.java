package demo;

import org.noear.solon.Solon;
import org.noear.solon.cloud.tool.HttpUtils;

/**
 * @author noear 2021/6/18 created
 */
public class DemoApp {
    public static void main(String[] args) {
        Solon.start(DemoApp.class, args)
                .onError(e -> e.printStackTrace())
                .get("/", c -> {
                    String rst = HttpUtils.http("http://demo-api/").get();
                    c.output(rst);
                });
    }
}

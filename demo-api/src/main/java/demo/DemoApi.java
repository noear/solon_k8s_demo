package demo;

import org.noear.solon.Solon;

/**
 * @author noear 2021/6/18 created
 */
public class DemoApi {
    public static void main(String[] args) {
        Solon.start(DemoApi.class, args)
                .onError(e -> e.printStackTrace())
                .get("/", c -> c.output("hello world!"));
    }
}

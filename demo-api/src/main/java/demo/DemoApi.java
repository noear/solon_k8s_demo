package demo;

import org.noear.solon.Solon;

/**
 * @author noear 2021/6/18 created
 */
public class DemoApi {
    public static void main(String[] args) {
        Solon.start(DemoApi.class, args).get("/", c -> c.output("hello world!"));
    }
}

package demo;

import org.noear.solon.Solon;

/**
 * @author noear 2021/6/18 created
 */
public class DemoApp {
    public static void main(String[] args) {
        Solon.start(DemoApp.class, args).get("/",c->c.output("hello world!"));
    }
}

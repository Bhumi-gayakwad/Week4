package reflections.advanced_level.custom_logging_proxy;

import java.lang.reflect.Proxy;

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(new GreetingImpl())
        );

        greeting.sayHello();
    }
}

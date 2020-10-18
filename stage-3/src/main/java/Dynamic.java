import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic {
    public static void main(String[] args) {
        dynamic();
    }

    private static void dynamic() {
        Singer singer = new Singer("宋建华");
        SingerInterface sin = (SingerInterface)Proxy.newProxyInstance(
                singer.getClass().getClassLoader(),
                singer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(singer, args);
                        return null;
                    }
                }
        );
                sin.sing();
    }
}

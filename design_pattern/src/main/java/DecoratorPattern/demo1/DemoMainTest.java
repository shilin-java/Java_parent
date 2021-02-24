package DecoratorPattern.demo1;

/**
 * Created in       2021/2/23 10:46
 *
 * @Author: Lin.Shi
 * @version: 1.0
 * @Description:
 */
public class DemoMainTest {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}

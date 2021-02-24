package DecoratorPattern.demo1;

//具体构件角色

/**
 * 接口的具体实现类；
 * 这个类也就是接下来，要被包装的对象。（被ConcreteDecorator类包装）
 */
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
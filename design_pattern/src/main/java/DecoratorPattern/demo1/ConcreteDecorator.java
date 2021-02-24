package DecoratorPattern.demo1;

//具体装饰角色

/**
 * 重新包装后的包装类
 */
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 目标方法
     */
    public void operation() {
        super.operation();
        addedFunction();
    }

    /**
     * 被包装的，添加的额外的功能
     */
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
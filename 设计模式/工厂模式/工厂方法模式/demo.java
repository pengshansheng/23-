package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.Operator;
import 设计模式.工厂模式.静态工厂模式.OperatorFactory;

public class demo {
    /**
     优点
     基本与静态工厂模式一致，多的一点优点就是遵循了开放-封闭原则，使得模式的灵活性更强。

     缺点
     与静态工厂模式差不多, 但是增加了类组织的复杂性;

     小结
     虽然根据理论原则, 需要使用工厂方法模式, 但实际上, 常用的还是静态工厂模式.
     * */
    public static void main(String[] args) {
        new demo().add();
    }
    public void testAdd(){
        Operator<Double> operator = new SqrtFactory().createOperator();
        System.out.println(operator.getResult(1.1,1.2,1.4,1.5));
    }

    public void add(){
        Operator<Double> operator = new SqrtFactory().add();
        System.out.println(operator.getResult(1.1,1.2,1.4,1.5));
    }
}

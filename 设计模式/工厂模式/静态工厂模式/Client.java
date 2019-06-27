package 设计模式.工厂模式.静态工厂模式;

import org.junit.Test;

public class Client {
    public static void main(String[] args) {
        new Client().testMultiplicationName();
    }
    @Test
    public void testAdd(){
        Operator<Integer> operator = OperatorFactory.createOperator("+");
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }
    @Test
    public void testMultiplication() {
        Operator<Integer> operator = OperatorFactory.createOperator("*");
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }

    @Test
    public void testAddName(){
        Operator<Integer> operator = OperatorFactory.createAddOper();
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }

    @Test
    public void testMultiplicationName() {
        Operator<Integer> operator = OperatorFactory.createMultiOper();
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }
}

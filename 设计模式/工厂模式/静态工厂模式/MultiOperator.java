package 设计模式.工厂模式.静态工厂模式;

public class MultiOperator implements Operator<Integer>{
    @Override
    public Integer getResult(Integer... args) {
        System.out.println("乘");
        int result =1;
        for (int arg:args) {
            result*=arg;
        }
        return result;
    }
}

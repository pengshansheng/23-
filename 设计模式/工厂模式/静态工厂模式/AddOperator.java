package 设计模式.工厂模式.静态工厂模式;

/**
 * @author admin
 */
public class AddOperator implements Operator<Integer> {
    @Override
    public Integer getResult(Integer... args) {
        System.out.println("加");
       int result =0;
        for (int arg:args) {
            result+=arg;
        }
        return result;
    }
}

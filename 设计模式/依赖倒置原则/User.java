package 设计模式.依赖倒置原则;

public class User {
    public String shoping(Shop shop){
        return shop.sell();
    }

    public static void main(String[] args) {
        User u=new User();
        System.out.println(u.shoping(new Liing()));
        System.out.println(u.shoping(new Huagz()));
    }
}

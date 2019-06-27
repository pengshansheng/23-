package 设计模式.接口隔离原则.impl;

import 设计模式.接口隔离原则.CountModule;
import 设计模式.接口隔离原则.InputModule;
import 设计模式.接口隔离原则.PrintModule;

public class StuScoreList implements CountModule, InputModule, PrintModule {
    public static void main(String[] args) {
        StuScoreList input =StuScoreList.getInputModule();
        CountModule count =StuScoreList.getCountModule();
        PrintModule print =StuScoreList.getPrintModule();
        User.getInputModule().inset();
        input.inset();
        count.countTotalScore();
        print.printStuInfo();
        input.delete();
    }
    /**避免创建实例 new StuScoreList();*/
    private StuScoreList(){}

    public static StuScoreList getInputModule(){
        //返回实例并转型
        return new StuScoreList();
    }

    public static CountModule getCountModule(){
        return (CountModule)new StuScoreList();
    }

    public static PrintModule getPrintModule(){
        return (PrintModule)new StuScoreList();
    }

    @Override
    public void inset() {
        System.out.println("输入模块的insert()方法被调用！");
    }

    @Override
    public void delete()
    {
        System.out.println("输入模块的delete()方法被调用！");
    }
    @Override
    public void modify()
    {
        System.out.println("输入模块的modify()方法被调用！");
    }
    @Override
    public void countTotalScore()
    {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    @Override
    public void countAverage()
    {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    @Override
    public void printStuInfo()
    {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    @Override
    public void queryStuInfo()
    {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
class User implements InputModule{

    public static InputModule getInputModule(){
        return new User();
    }
    @Override
    public void inset() {
        System.out.println("user重写insert");
    }

    @Override
    public void delete() {

    }

    @Override
    public void modify() {

    }
}
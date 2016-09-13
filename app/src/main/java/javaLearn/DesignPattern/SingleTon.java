package javaLearn.DesignPattern;

/**
 * Created by h_kang on 2016/9/7.
 */
public class SingleTon {
    private SingleTon(){}
    private static SingleTon instance;
    public static SingleTon getInstance()
    {
        if(instance==null)
            instance = new SingleTon();
        return instance;
    }
}

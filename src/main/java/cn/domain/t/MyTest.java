package cn.domain.t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class MyTest {


    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

//        //定义Plate<T>    Apple extends Fruit
//        Plate<Fruit> pf = new Plate<>();
//        pf.setData(new Apple());
//
//        // 上界 <? extends T> 不能往里存，只能往外取
//        Plate<? extends Fruit> pff = new Plate<Apple>(new Apple());//可通过构造方法设置
////        pff.setData(new Apple());//无法设置
//
//        //下界 <? super T> 不影响往里存，但往外取只能放在 Object 对象里
//        // super可取可放 无论是Fruit还是其子类Orange 都是可以存到集合类型是Fruit或者更高的父类的集合中
////        Plate<? super Fruit> ps = new Plate<FoodTop>(new Apple());//OK
////        Plate<? super Fruit> ps = new Plate<FoodTop>(new FoodTop());//OK
//        //因为下界规定了元素的最小粒度的下限，实际上是放松了容器元素的类型控制。既然元素是 Fruit 的基类，那往里存粒度比 Fruit 小的都可以。但往外读取元素就费劲了，只有所有类的基类 Object 对象才能装下
//        Plate<? super Fruit> ps = new Plate();
//        ps.setData(new Apple());
//        System.out.println(ps);
//        Object apple = ps.getData();// 用Object取值
//        System.out.println(ps.getData());
//        List<? super Fruit> lf = new ArrayList();
//        lf.add(new Apple());

    }


}

package adapter;

import adapter.IAdapter.MyAdapter;
import adapter.ClassAdapter.PsAdapter;

import java.util.ArrayList;

/**
 * 什么是适配器模式：把一个不匹配的接口改为所需要的另一种接口
 * 适配器模式分为：
 * <p>
 * 1、类适配器模式
 * <p>通过继承A接口，实现B接口的实现类来完成接口之间的转换
 * 2、对象适配器模式
 * <p>
 * 3、接口适配器模式
 * 使用场景：
 */

public class Example {

    public static void main(String[] args) {
//用继承的方式来实现 适配器模式，这个是最简单的
        PsAdapter psAdapter = new PsAdapter();
        System.out.println(psAdapter.ps1Ready() + "  " + psAdapter.ps2Ready());

//接口适配器模式
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        MyAdapter myAdapter = new MyAdapter(dataList);
        for (int position = 0; position < myAdapter.getCount(); position++)
            myAdapter.drawView(myAdapter.getItemType(), position, myAdapter.getCount());

    }
}

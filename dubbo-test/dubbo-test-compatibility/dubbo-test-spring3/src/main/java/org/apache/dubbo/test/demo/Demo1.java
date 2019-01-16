package org.apache.dubbo.test.demo;

/**
 * @author luozhiyun on 2018-12-23.
 */
public class Demo1 {
    public static void main(String[] args)
    {
        SuperClass clz = new SubClass();
        //你觉得这里输出什么?
        System.out.println(clz.name);
    }

}

class SubClass extends SuperClass
{
    public String name = "SubClass";
}

class SuperClass
{
    public String name = "SuperClass";
}

class StaticCode
{
    static
    {
        System.out.println("A");
    }
    public void show()
    {
        System.out.println("Hello World !");
    }
}
class StaticCodeDemo
{
    static
    {
        System.out.println("B");
    }
    public static void main(String[] args)
    {
        new StaticCode().show();
    }
    static
    {
        System.out.println("C");
    }
}
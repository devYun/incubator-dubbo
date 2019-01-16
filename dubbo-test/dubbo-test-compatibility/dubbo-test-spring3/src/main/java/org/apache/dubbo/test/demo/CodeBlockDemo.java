package org.apache.dubbo.test.demo;

/**
 * @author luozhiyun on 2018-12-23.
 */
public class CodeBlockDemo {

    static
    {
        System.out.println("静态代码块");
    }


    CodeBlockDemo()
    {
        System.out.println("构造器");
    }

    {
        System.out.println("初始化代码");
    }

    public void show()
    {
        System.out.println("Hello World !");
    }

    //运行后输出结果?
    public static void main(String[] args)
    {
        {
            int a = 10;
            //10
            System.out.println("局部代码块");
        }

        new CodeBlockDemo();
        new CodeBlockDemo();
        new CodeBlockDemo().show();
    }
}

package com.example.my.mybatispp;

/**
 * @Auther: Administrator
 * @Date: 2020/1/9 20:38
 * @Description:
 */


class Outer
{
    private int index = 10;
    class Inner
    {
        private int index = 20;
        void show()
        {
            int index = 30;
//            System.out.println(this); // the object created from the Inner
//            System.out.println(Outer.this); // the object created from the Outer
            System.out.println(index); // output is 30
            System.out.println(this.index); // output is 20
            System.out.println(Outer.this.index); // output is 10
        }
    }
    void show()
    {
        Inner inner = new Inner();//得到内部类的引用
        inner.show();
    }
}
class Test
{
    public static void main(String[] args)
    {
        Outer.Inner outer = new Outer().new Inner();
        outer.show();
    }
}

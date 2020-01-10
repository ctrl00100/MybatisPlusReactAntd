package com.example.my.mybatispp;

class dd2{

}
abstract class Animal11{
    //姓名
    private String name;
    //年龄
    private int age;
    public Animal11(){}
    public Animal11(String name,int age) {
        this.name = name;
        this.age =age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //定义一个抽象方法
    public abstract void eat();
}


class Dog11 extends Animal11{
    public Dog11(){}
    public Dog11(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃肉");
    }
}


class Cat11 extends Animal11{
    public Cat11() {}
    public Cat11(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
//测试类
class AbstractTest1 {
 public static void main(String[] args) {
//方式一：
        Dog11 d = new Dog11("d",9);

        d.setName("藏獒");
        d.setAge(3);
        System.out.println(d.getName()+"----"+d.getAge());
        d.eat();

        Dog11 d2 = new Dog11("藏獒",3);
        System.out.println(d2.getName()+"-----"+d2.getAge());
        d2.eat();
        System.out.println("-------------");
//方式二：多态
        Animal11 a = new Dog11();
        a.setName("藏獒");
        a.setAge(3);
        System.out.println(d2.getName()+"----"+d2.getAge());
        a.eat();

        Animal11 a2 = new Dog11("藏獒",3);
        System.out.println(a.getName()+"----"+a.getAge());
        a.eat();
        System.out.println("-------------");
//方式一：
        Cat11 c = new Cat11();
        c.setName("汤姆");
        c.setAge(5);
        System.out.println(c.getName()+"----"+c.getAge());
        c.eat();

        Cat11 c2 = new Cat11("汤姆",5);
        System.out.println(c2.getName()+"-----"+c2.getAge());
        c2.eat();
        System.out.println("-------------");
//方式二：多态
        Animal11 aa = new Cat11();
        aa.setName("汤姆");
        aa.setAge(5);
        System.out.println(aa.getName()+"----"+aa.getAge());
        aa.eat();

        Animal11 aa2 = new Cat11("汤姆",5);
        System.out.println(aa2.getName()+"----"+aa2.getAge());
        aa2.eat();
    }
}

package com.example.my.mybatispp;

/**
 * @Auther: Administrator
 * @Date: 2020/1/9 21:46
 * @Description:
 */




    abstract class Animal{
        private String name;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public Animal(){}
        public Animal(String name){
            this.name=name;
        }
        public abstract void enjoy();
    }
    class Cat extends Animal{
        private String eyesColor ;
        public Cat(){}
        public Cat(String name, String eyesColor) {
            super(name);
            this.eyesColor = eyesColor;
        }
        public String getEyesColor(){
            return eyesColor;
        }
        public void setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
        }
        public void enjoy() {
            System.out.println("养了一只名字为:"+getName()+"  瞳孔的颜色为:"+getEyesColor()+"  喜欢被人撸");
        }
    }
    class Dog extends Animal{
        private String furColor ;
        public Dog(){}
        public Dog(String name, String furColor){
            super(name);
            this.furColor = furColor;
        }
        public void setFurColor(String furColor){
            this.furColor = furColor;
        }
        public String getFurColor(){
            return furColor;
        }
        public void enjoy(){
            System.out.print("养了一只名字为:"+getName()+"  舌头的颜色为:"+getFurColor()+"的狗很忠诚");
        }
    }
    class Lady{
        private String name;
        Animal pet;
        public Lady(String name, Animal pet){
            this.name = name;
            this.pet = pet;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public Animal getPet(){
            return pet;
        }
        public void setPet(Animal pet){
            this.pet = pet;
        }
        public void myPetEnjoy(){
            System.out.print(getName());
            pet.enjoy();
        }
    }
    class Zuoye13{
        public static void main(String[] args){
            Animal a=new Cat("喵喵","黄灰色");
            Animal a1 = new Cat();
            Lady ld=new Lady("张女士",a);
            ld.myPetEnjoy() ;
            Animal d = new Dog("旺旺","白色");
            Lady x=new Lady("王女士",d);
            x.myPetEnjoy();
        }
    }


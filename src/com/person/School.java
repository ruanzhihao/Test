package com.person;

public class School {
    String schoolName;
    Person p;
    public static void test(String schoolName,Person p){
        System.out.print(
                "我来"+schoolName+"学校aaa"
        );
        p.Fath();
    }
    /**
     * 在遇到需要同一父类的不同子类，在同一方法下展现其对应的形态
     * 如果不使用父类的引用（如 参数），而采用子类本身的引用就需要编写大量重复代码
     * 多态的好处是在调用方法时不需要考虑具体是哪个对象，
     * 只需要在调用对应的方法时把对应的对象赋给父类的引用就可以了，减少代码冗余
     */
    public static void main(String[] args) {
        test("一小",new Student());
        test("一小",new Teacher());
    }
}

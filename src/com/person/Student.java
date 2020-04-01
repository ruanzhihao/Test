package com.person;

public class Student  extends Person {
    String clazz;
    static  int score;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    public void Fath(){
        System.out.println("是上学的");
    }
    public void Son(){
        System.out.println("Son");
    }
    @Override
    public String toString() {
        return "com.person.Student:姓名"+name+"性别"+sex+"班级"+clazz;
    }



    public static void main(String[] args) {

       Person p=new Student();
       p.Fath();
       p.Mother();
        System.out.println("youobianhua");
       ((Student) p).Son();
       if(p instanceof Student) {
           Student student = (Student) p;
           student.Son();
       }
    }
}

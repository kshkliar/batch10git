package com.collection.class17;

public class AccessModifierDemo1 {
    private String name;
    int age;
    public double height;
     protected String city;




  private void method1(){
        System.out.println(name);
        System.out.println(age);
    }

     void method2(){
        System.out.println(name);
        System.out.println(age);
        method1();
    }

    protected  void method4(){
        System.out.println(name);
        System.out.println(age);
    }
    public void method3(){
      method4();
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
       // System.out.println(name); because main is a static method
   AccessModifierDemo1 accessModifierDemo1=new AccessModifierDemo1();
        System.out.println(accessModifierDemo1.name);
        System.out.println(accessModifierDemo1.age);
        accessModifierDemo1.method1();
        accessModifierDemo1.method4();
    }
}

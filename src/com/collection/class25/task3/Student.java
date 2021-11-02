package com.collection.class25.task3;

public class Student {
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homeworks");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
     void study(){
        System.out.println("Syntax Students must study hard to get job quickly");
    }
    void doHomeWork(){
        System.out.println("Students must do programing homeworks");
    }
  void doResearch(){
      System.out.println("Syntax students must to research on google and watch youtube videos");
  }
}
class CollegeStudent extends Student{
    void doHomeWork(){
        System.out.println("College Students must do homeworks to get good grades");
    }
}

class SchoolStudent extends Student{

}
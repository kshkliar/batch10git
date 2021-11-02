package com.collection.class26.casting;

public class CastingDemo {

    public static void main(String[] args) {
        Object[] objects={"Hi",10,'A'};
       executeAll(objects);



        /*for (Object obj:objects
             ) {
            if(obj instanceof String){
                System.out.println(((String)obj).length());
            }

        }*/

    }
    static void executeAll(Object[] arr){
        if(arr[0] instanceof String){
            System.out.println("Yes it is String");
        }
        if(arr[1] instanceof String){
            System.out.println("No it is not a String");
        }


    }
}

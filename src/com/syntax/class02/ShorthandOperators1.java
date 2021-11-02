package com.syntax.class02;

public class ShorthandOperators1 {

    public static void main(String[] args) {

       int num =20;
       num=num+100;
        System.out.println(num);

        num =num-60;
        System.out.println(num);//60

        int number =100;
        number+=100;// number=number+100

        System.out.println(number);//200


        number-=30;// number=number-30
        System.out.println(number);//170

        number/=10;
        System.out.println(number);//17

        number*=2;
        System.out.println(number);//34


        int num1=3;
        int num2=7;
        int num3=5;
        int num4 =1;
        int add=num1+num2;//10
        int divide=add/num3;//2
        int result= divide-num4;//1
        System.out.println("The result of arithmetic operation is equal to " + result);

int myNumber =5;
int stepOne=myNumber*myNumber;//25
        int stepTwo=stepOne+myNumber; //30
        int stepThree =stepTwo/myNumber;//6
        int stepFour=stepThree+17;//23
        int stepFive=stepFour-myNumber;//18
        int stepSix=stepFive/6;//3
        System.out.println("The magic number is "+ stepSix);


    }
}

package replit;

/*
Create a variable that will hold the count of all instance of the Main class

Create 3 Object of the class and print value of the count variable;
Expected Output:( которая будет считать количество всех экземпляров класса-
 обьектов-как с солдатами
3
 */

public class Task126a {

    static int count;   //как пример считаем колл солдат

    public static void main(String[] args) {


        Task126a s1=new Task126a();
        count++;
        Task126a s2=new Task126a();
        count++;
        Task126a s3=new Task126a();
        count++;
        System.out.println(count);
    }





}

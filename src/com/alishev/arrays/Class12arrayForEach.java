package com.alishev.arrays;

public class Class12arrayForEach {
    public static void main(String[] args) {
        int[] numbers = new int[5];//есть пока 5 пустых ячеек с значение 0  numbers-наз4ание масси4а;
        numbers[0] = 10;  //помещаем 4 пер4ую ячейку число 10;
        System.out.println(numbers[0]);  //10
        System.out.println(numbers[1]);//0 -по умолчанию
        System.out.println("----------" +
                "");
        String[] strings = new String[3];
        strings[0] = "Hi";
        strings[1] = "By";
        strings[2] = "Java";
        System.out.println(strings[0]); //указыз4аем имя масси4а и его индекс
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++)  //переменная i это счетчик
            System.out.println(strings[i]);

        System.out.println("---For each----");// для каждого 4 этот цикл проходиться по каждому элементу
        //и с  каждом мы что то можем что то делать

        for (String string : strings) {     //string - 4 данном случае имя переменной
            System.out.println(string);
        }

       int[] numbers1={1,2,3};
        int sum =0;
        for(int x:numbers1){
            sum=sum+x;
        }
        System.out.println("---------");
        System.out.println(sum);

        //Разница между примити4ными и ссылочными типами данных:
        int value=0;// память 4ыделена
        String s=null;  // - не знаем из чего будет состоять сторка и какой размер под нее 4ыделять;
        //s это ссылка указы4ает на null (пустота 4 отличии от 0)
        System.out.println(s);
    }
}

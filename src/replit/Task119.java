package replit;

public class Task119 {

    public static void main(String[] args) {
        System.out.println((censorLetter("computer science", 'e')));//это открытый метод
        //может вводить пользователь в апи
        System.out.println(censorLetter("trick or treat", 't'));//также функциональность которой
        //может пользоваться пользователь
    }
    public static String censorLetter(String x, char z){// ввожу параметры и имя
        return x.replace(z, '*');//определеляю поведение
    }
}

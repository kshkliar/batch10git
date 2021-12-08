package andreyJava.lessons.pass_params;

public class PassParams {
    public static void main(String[] args) {
        final int b = 10;

//        b= 15;

//        changeInt(b);

//        System.out.println(b);

        Tree tree = new Tree(10);

       /* changeObject(tree);

        System.out.println(tree.getSize());*/


        String obj = "Hello";//final char[]//по умолчанию ссылка мна char массив

        changeString(obj);

        System.out.println(obj);//выводит в консоль Hello

//        new Integer()
    }

    public static void changeInt(int a) {
        a = 15;
    }

    public static void changeObject(Tree tr) {
        tr.setSize(20);
    }

    public static void changeString(String st) {
        st = "World";//здесь копия ссылки перебросилась на word  но оригинал ссылки не изменился
        System.out.println(st);
    }
}

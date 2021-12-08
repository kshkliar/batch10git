package andreyJava.lessons.inner_class;

import andreyJava.lessons.inheritrance.Printable;

public class AnonymousClasss {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {

            }
        };
    }
}

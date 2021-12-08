package andreyJava.lessons.learn_enum;

public class LearnEnum {
    public static void print(String country) {//Ukrene
        //if
    }

    public static void print(Country country) {//Ukrene

    }

    public static void main(String[] args) {
        Country uk = Country.UK;
        Country uk1 = Country.UK;

        print(Country.UKRAINE);

//        System.out.println(uk.getShortName());

        String c = "Ukraine";

        Country country = Country.valueOf(c.toUpperCase());//переводит стинг в enam( или в то что нужно)

        System.out.println(country.ordinal());//позиция обьекта енам в анаме.

        Country[] values = Country.values();//метод возвращающий все обьекты в виде масива.
    }
}

package andreyJava.homeworks.hw12;

/*В главной программе создать 2 фильма с
        режиссерами: «Стивен Спилберг» и «Ежи Гофман», а также мультфильм и вывести информацию о них.*/
public class MovieTester {
    public static void main(String[] args) {

        Movie m1 = new Movie("Terminal", "Spilberg", 2.23, 22);//(возможно было сюда каким
        //то образом добавить в качестве параметра MovieCost, что бы не вызывать отдельно метод?;
        m1.displayinfo();
        m1.movieCosts();

        Movie m2 = new Movie("Vognem ta Mechem", " Hoffman", 1.55, 455);
        m2.displayinfo();
        System.out.println(m2.movieCosts());

        Cartoon c1 = new Cartoon("Chip & Deil", "Gayka", 2.00, 4);
        c1.displayinfo();
        c1.movieCosts();
        c1.showCost();
    }
}


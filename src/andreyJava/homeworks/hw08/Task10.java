package andreyJava.homeworks.hw08;

/*В заданной строке посчитать количество точек и запятых.*/
public class Task10 {
    public static void main(String[] args) {


        String string = "Сount., the number , , of dots and ...commas";
        int dots = 0;
        int commas = 0;

        for (char ch : string.toCharArray()) {
            if (ch == '.') {
                dots++;
            } else {
                if (ch == ',') {
                    commas++;
                }
            }
        }

        System.out.println("dots: " + dots + "  commas: " + commas);
    }

}

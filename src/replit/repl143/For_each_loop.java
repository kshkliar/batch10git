package replit.repl143;

public class For_each_loop {
    public static void main(String[] args) {
        String[] daysOfWeek =
                {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница",
                        "Суббота", "Воскресенье"};


        for (String dayOfWeek : daysOfWeek) //для каждогого dayOfWeek из daysOfWeek сделать:
        {

            System.out.println(dayOfWeek);//напечатать каждый элемент из масссива dayOfWeek
        }
    }
}



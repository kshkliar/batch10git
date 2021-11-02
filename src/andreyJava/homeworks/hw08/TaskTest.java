package andreyJava.homeworks.hw08;

public class TaskTest {

    public int countOddPositionChars(String... arg){
        if(arg == null || arg.length == 0) {
            return 0;
        }

        int result = 0;

        int argSize = arg.length;
        if((argSize / 2) != 0){
            argSize -= 1;
        }
        for (int i = 0; i <= argSize;) {
            result += arg[i].length();
            i += 2;
        }

        return result;
    }
}
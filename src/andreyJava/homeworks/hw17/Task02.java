package andreyJava.homeworks.hw17;
/*/*Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
(ххх) должен быть таким: (095), (097), (073), (067), (099), (063).

Проверить, чтобы 7 - ый номер был в формате "(ххх)ххх-хх-хх".  // это с сканнером наверное пордразумевалось
Если пользователь вводит номер начинающийся на (095) или (099) ххх-хх-хх,
выводить в консоль "Пользователь имеет МТС номер",
на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер".*/

//ис пользовать оператор or*/
//с оператором or
public class Task02 {
    public static void main(String[] args) {

        String str1 = "(095)444-44-22";
      if (str1.matches("((\\(095\\)|\\(099\\))\\d{3}-\\d{2}-\\d{2})")) {// не работает( тут две ошибки одна в конце вторая в
            //  число после 095 не воспринимаеться( после 099 - воспринимается
            System.out.println("Пользователь имеет MTC номер");
        }

        String[] split = str1.split("\\d{3}-\\d{2}-\\d{2}");
        System.out.println(split[0]);
/*        else if (str1.matches(".*")) {
            System.out.println("Пользователь имеет MTC номер");
        } else if (str1.matches(".*")) {

            System.out.println("Пользователь имеет MTC номер");
        } else if (str1.matches(".*")) {
            System.out.println("Пользователь имеет MTC номер");
        } else if (str1.matches(".*")) {
            System.out.println("Пользователь имеет MTC номер");
        } else {
            System.out.println("Пользователь имеет хз какой номер");
        }*/
    }
    }
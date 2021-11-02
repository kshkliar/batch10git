package andreyJava.lessons.objects;

/*Создать класс Банковский счет.
Установить изначально сумму для счета - 200$
Создать метод, который будет отнимать от счета сумму.
Если денег недостаточно, тогда написать в консоль - "Пополните счет".
Счет можно пополнить другим методом.*/
public class BankAccount {

    private int sum;

    public BankAccount() {
        sum = 200;
    }

    public void addMoney(int amount) {
        if (amount < 1) {
            System.out.println("Incorrect amount");
        } else {
            sum += amount;
        }

    }

    public void substructMoney(int amount) {
        if (amount < 1) {
            System.out.println("Incorrect amount");
        } else {
            sum -= amount;
        }
    }

    public void output() {
        System.out.println("Sum: " + sum);
    }

}
class BankAcountTester{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.addMoney(10);
        account1.output();
        account1.substructMoney(20);
        account1.output();
    }
}
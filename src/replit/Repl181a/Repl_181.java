package replit.Repl181a;

class Main {
    public static void main(String[] args) {

        Account account = new Account("7560504000", "Sumair",
                "sumair@syntax.com", 50000.0);
        System.out.println(account.getAcc_no()+" "+account.getName()+""+account.getEmail()
        +" "+ account.getAmount());
        System.out.println(account.getAmount());
    }
}
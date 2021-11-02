package replit.Repl181;

class Main {
    public static void main(String[] args){
        Account account=new Account("7560504000","Sumair","sumair@syntax.com",50000.0);
        System.out.print(account.Get_Acc()+" "+account.Get_Name()+" "+account.Get_EMail()+" "+account.Get_Amount());
    }

}
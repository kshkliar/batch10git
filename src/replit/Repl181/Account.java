package replit.Repl181;

class Account{
    String acc_no;
    String name;
    String email;
    double amount;

    Account(String acc_no,String name,String email,double amount){
        Set_Acc(acc_no);
        Set_Name(name);
        Set_EMail(email);
        set_Amount(amount);
    }
    public void Set_Acc(String acc_no){
        this.acc_no=acc_no;
    }
    public void Set_Name(String name){
        this.name=name;
    }
    public void Set_EMail(String email){
        this.email=email;
    }
    public void set_Amount(Double amount){
        this.amount=amount;
    }
    public String Get_Acc(){
        return this.acc_no;
    }
    public String Get_Name(){
        return this.name;
    }
    public String Get_EMail(){
        return this.email;
    }
    public double Get_Amount(){
        return this.amount;
    }
}
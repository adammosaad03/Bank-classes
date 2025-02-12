public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }
  
  public int getBalance(){
    return this.balance;
  }
    
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
  
  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  public void closeAccount(){
    System.out.println("Account closed, We have withdrew " + this.balance + " from your account!");
    this.name = "";
    this.balance = 0;
    this.id = "";
    this.interestRate = 0.0;
    
  }

}

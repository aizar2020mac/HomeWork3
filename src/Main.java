public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(20500);
        while (true){
            try{
                bankAccount.withDraw(17500);
            }catch(LimitException a){
                try{
                    System.out.println(a.getMessage());
                    bankAccount.withDraw(a.getRemainingAmount());
                }catch (LimitException b){

                }break;
                }
            }
            }
        }


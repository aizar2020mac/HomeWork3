public class LimitException extends Exception{
    public LimitException (String message, double deposite){
        super(message);
    }
    public int getRemainingAmount(){
        return 0;
    }
}

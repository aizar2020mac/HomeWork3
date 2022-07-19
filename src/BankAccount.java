public class BankAccount {
    private double chislo;

    public double getChislo() {
        return chislo;

    }
    public void deposite(double karta){
        chislo += karta;
        System.out.println("Vy popolnili schet" + karta);
    }
    public void withDraw(int schet) throws LimitException{
        if (chislo < schet){
            throw new LimitException("Operatsiya nedostupna potomu schto zaprawivaemaya summa bolwe chem schet" , chislo);
        }else {
            chislo -= schet;
            System.out.println("Vy snyali so scheta" + schet);
        }
    }
}

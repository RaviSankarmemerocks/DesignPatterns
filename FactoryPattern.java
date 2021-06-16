import java.util.Scanner;

interface Bank{
    int getInterestRate();
}
class SBI implements Bank{
    @Override
    public int getInterestRate() {
        System.out.println("Interest Rate at SBI is");

        return 7;
    }
}
class IOB implements Bank{
    @Override
    public int getInterestRate() {
        System.out.println("Interest Rate at IOB is");

        return 9;
    }
}
class CNR implements Bank{
    @Override
    public int getInterestRate() {
        System.out.println("Interest Rate at CNR is");

        return 11;
    }
}
class BankFactory{
    public Bank getFactory(String bank){
        bank=bank.toLowerCase();

        if(bank.equals("sbi")){
            return new SBI();
        }else if(bank.equals("iob")){
            return new IOB();

        }else if(bank.equals("cnr")){
            return new CNR();

        }
            System.out.println("no bank found");

            return null;

    }
}
public class FactoryPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter your bank name(SBI,IOB,CNR)");
        String bank=sc.next();
        BankFactory bf=new BankFactory();
        Bank b=bf.getFactory(bank);
        System.out.println(b.getInterestRate());
    }
}


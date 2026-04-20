final class SBI extends a.b.c.d.RBI{
    public double countSinpleInterest(double p, int years){
        return countSI(p, years);
    }
}


public class abstractionExample1{
    public static void main(String[] args){
        SBI s = new SBI();
        System.out.println(s.countSinpleInterest(1000, 3));
    }
}
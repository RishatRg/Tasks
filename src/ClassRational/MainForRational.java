package ClassRational;

/**
 * Created by RishatRg on 15.10.2017.
 */
public class MainForRational {
    public static void main(String[] args) {
        Rational A1=new Rational(12,11);
        Rational A2=new Rational(15,23);
        Rational A3=new Rational();

        A3.Summ(A1,A2);///A1+A2
        A3.showln();

        A3.substract(A1,A2);//A1-A2
        A3.showln();

        A3.mult(A1,A2);// A1*A2
        A3.showln();

        A3.divide(A1,A2);// A1/A2
        A3.showln();

        A3.getR(A1);// A3=A1
        A3.showln();

        A3.compare(A1,A2);// сравнивает А1 и А2

    }
}

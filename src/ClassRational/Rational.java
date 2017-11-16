package ClassRational;

import static java.lang.Math.abs;

/**
 * Created by RishatRg on 15.10.2017.
 */


public class Rational {

    int num;
    int den;

    Rational() {
        num = 0;
        den = 1;
    }
    void set(int num,int den){
        this.num=num;
        this.den=den;
    }
    Rational(int num, int den) {
        if (den <= 0)
        {
            System.out.println("Знаменатель меньше нуля!");
            System.exit(0);
        }
        this.num = num;
        this.den = den;
    }

    int gcd()
    {
        int n = abs(num), d = den;
        while (n != d) {
            if (n > d) n = n - d;
            else d = d - n;
        }
        return d;
    }

    void reduce() {
        int div = gcd();
        num = num / div;
        den = den / div;
    }

   Rational Summ(Rational x,Rational y)
    {

        num = x.num*y.den + x.den*y.num;
        den = x.den*y.den;
        reduce();
        return this;
    }

    Rational  substract(Rational x,Rational y)
   {

        num = x.num*y.den - x.den*y.num;
        den = x.den*y.den;
        reduce();
        return this;
    }

    Rational mult(Rational x,Rational y)
    {
        num = x.num*y.num;
        den = x.den*y.den;
        reduce();
        return this;
    }
    void showln()
    {
        System.out.println(num+"/"+den+" ");
    }
    void show() { System.out.print(num+"/"+den);}

    Rational divide(Rational x,Rational y)
    {
        //Rational temp =new Rational();
        if (y.num==0)
        {
            System.out.println("division by 0");
            return this;
        }

        num = x.num*y.den;
        den = x.den*y.num;
        reduce();
        return this;
    }


    Rational getR(Rational x)
    {
        num=x.num;
        den=x.den;
        return this;
    }
    void compare(Rational o1, Rational o2) {
        int num1,num2;
        num1=o1.num*o2.den;
        num2=o2.num*o1.den;

        if ( num1>num2) {
            o1.show();
            System.out.print(" > ");
            o2.show();
        } else if (num1<num2)
        {
            o1.show();
            System.out.print(" < ");
            o2.show();
        } else {
            o1.show();
            System.out.print(" равен ");
            o2.show();
        }
    }
}

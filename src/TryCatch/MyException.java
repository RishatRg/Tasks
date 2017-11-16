package TryCatch;

/**
 * Created by RishatRg on 29.10.2017.
 */
class Interval{
    int min,max;
    public Interval(int min,int max) {
        this.min=min;
        this.max=max;
    }

    public  String isInterval(int num) throws IntervalException{

        if(num<min) throw new IntervalException("Число меньше 10", num);
        if(num>max) throw new IntervalException("Число, больше 20", num);
         return "Число принадлежит интервалу.";

    }
}
class IntervalException extends Exception
{
    int n;
    public IntervalException(String message,int n)
    {
        super(message);
        this.n=n;
    }

    public int getN() {
        return n;
    }
}

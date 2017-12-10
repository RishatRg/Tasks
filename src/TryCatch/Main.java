package TryCatch;

/**
 * Created by RishatRg on 30.10.2017.
 */
public class Main {

    public static void main(String[] args) {
        try{
            Interval a= new Interval(10,22);
            System.out.println(a.isInterval(23));
        }
        catch (IntervalException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

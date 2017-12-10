
package Compare;



import java.io.File;
import java.io.IOException;
import java.util.*;


/**
 * Created by RishatRg on 29.10.2017.
 */

public class Main {

    public static void main(String[] args) {

        List<Employee> e = new ArrayList<Employee>();
        MyComparator C =new MyComparator();
        try (Scanner in = new Scanner(new File("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Compare\\in.txt"))) {

            while (in.hasNext()) {
                Employee tmp = new Employee(in.next(), in.next(), in.nextInt());
                e.add(tmp);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        Collections.sort(e);
        for (Employee x:e) {
            System.out.println(x);
        }
        Collections.sort(e,C);
        for (Employee x:e) {
            System.out.println(x);
        }
    }

}


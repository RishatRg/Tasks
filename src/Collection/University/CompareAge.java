package Collection.University;

import java.util.Comparator;

/**
 * Created by RishatRg on 06.11.2017.
 */
public class CompareAge implements Comparator {
    public int compare(Object o1, Object o2) {
        Human any1 = (Human) o1;
        Human any2 = (Human) o2;
        return any1.getAge()>any2.getAge() ? 1 : any1.getAge()<any2.getAge()? -1 :0 ;
    }
}

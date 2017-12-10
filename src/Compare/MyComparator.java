
package Compare;

import java.util.Comparator;

/**
 * Created by RishatRg on 29.10.2017.
 */

public class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee any1 = (Employee) o1;
        Employee any2 = (Employee) o2;
        if (any1.getSalary() > any2.getSalary())
            return +1;
        else if (any1.getSalary() < any2.getSalary())
            return -1;
        else return 0;
    }
}


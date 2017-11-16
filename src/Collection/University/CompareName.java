package Collection.University;

import java.util.Comparator;

/**
 * Created by RishatRg on 06.11.2017.
 */
public class CompareName implements Comparator {
    public int compare(Object o1, Object o2) {
        Human any1 = (Human) o1;
        Human any2 = (Human) o2;
        int p=0;
        for (int i = 0; i < any1.getFirstName().toCharArray().length||i<any2.getFirstName().toCharArray().length; i++)
            if(any1.getFirstName().toCharArray()[i]<any2.getFirstName().toCharArray()[i])
                return -1 ;
            else if(any1.getFirstName().toCharArray()[i]> any2.getFirstName().toCharArray()[i])
                return +1;
            else return p=0;
        return p;
    }
}

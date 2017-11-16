package Collection.University;
import java.util.Comparator;

/**
 * Created by RishatRg on 06.11.2017.
 */
public class ComparePatronymic implements Comparator {
    public int compare(Object o1, Object o2) {
        Human any1 = (Human) o1;
        Human any2 = (Human) o2;
        int p=0;
        for (int i = 0; i < any1.getPatronymic().toCharArray().length||i<any2.getPatronymic().toCharArray().length; i++)
            if(any1.getPatronymic().toCharArray()[i]<any2.getPatronymic().toCharArray()[i])
            return -1 ;
            else if(any1.getPatronymic().toCharArray()[i]> any2.getPatronymic().toCharArray()[i])
                return +1;
            else p=0;
        return p;
    }

}


package Collection.University;
import java.util.Comparator;

/**
 * Created by RishatRg on 01.12.2017.
 */

public class CompareHuman implements Comparator {
    @Override
    public int compare (Object o11,Object o21) {
        Human o1 = (Human) o11;
        Human o2 = (Human) o21;
        if (o1.getLastName().compareTo(o2.getLastName()) != 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            if (o1.getFirstName().compareTo(o2.getFirstName()) != 0) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else {
                if (o1.getPatronymic().compareTo(o2.getPatronymic()) != 0) {
                    return o1.getPatronymic().compareTo(o2.getPatronymic());
                } else {
                    return 0;
                }
            }
        }
    }
}


package Collection;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by RishatRg on 19.11.2017.
 */
public class Collections3 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(), s1 = new TreeSet<>(), s2 = new LinkedHashSet<>();
        int a = 0, b = 100;
        for (int i = 0; i < 50; i++) {
            s.add(a + (int) (b * Math.random()));
            s1.add(a + (int) (b * Math.random()));
            s2.add(a + (int) (b * Math.random()));
        }
        System.out.println("HashSet: ");
        s.forEach(System.out::println);
        System.out.println("TreeSet: ");
        s1.forEach(System.out::println);
        System.out.println("LinckedHashSet: ");
        s2.forEach(System.out::println);

        Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2,3, 4, 5, 6));
        s1.removeAll(s3);
        System.out.println(" Updated Tree set: ");
        s1.forEach(System.out::println);
    }
}

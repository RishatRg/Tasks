package Collection.Alphabet;

import Compare.Employee;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by RishatRg on 18.11.2017.
 */

public class Main {
    public static void main(String[] args)
    {
        Set<Letter> s = new TreeSet<>();
        for (char i='a';i<='z';i++)
        {
            s.add(new Letter(i,0));
        }
        try (Scanner in = new Scanner(new File("D:\\in.txt"))) {

            while (in.hasNextLine()) {
                String tmp= in.nextLine();
                String t= tmp.toLowerCase();
                System.out.print(tmp+' ');
                System.out.println();
                char[]tmp1=t.toCharArray();
                for(int i=0;i<tmp1.length;i++) {
                    {
                        for (Letter x : s) {
                        if (x.n == tmp1[i] & (tmp1[i] != ' '))
                            x.setCount(x.getCount() + 1);
                        }
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        for (Letter x : s)
        {
            System.out.println(x.toString());
        }
    }
}

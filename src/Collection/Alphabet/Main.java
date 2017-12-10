package Collection.Alphabet;



import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by RishatRg on 18.11.2017.
 */

public class Main {
    public static void main(String[] args) {
        //Set<Letter> s = new TreeSet<>();
        SortedMap<Character, Integer> s = new TreeMap<>();
       /* for (char i = 'a'; i <= 'z'; i++) {
            // s.add(new Letter(i,0));
            s.put(i, 0);
        }*/
        try (Scanner in = new Scanner(new File("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Collection\\Alphabet\\in"))) {

            while (in.hasNextLine())
            {
                String tmp = in.nextLine();
                String t = tmp.toLowerCase();
                System.out.print(tmp + ' ');
                System.out.println();
                char[] tmp1 = t.toCharArray();
                for (int i = 0; i < tmp1.length; i++)
                {
                    {
                        if (s.containsKey(tmp1[i]))
                            s.put(tmp1[i], s.get(tmp1[i]) + 1);
                        else s.put(tmp1[i], 1);

                    }
                }
             }
             }
                catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(s);

    }
}

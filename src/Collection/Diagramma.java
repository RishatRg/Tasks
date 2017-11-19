package Collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Построить диаграмму распределения случайных чисел, т.е. сосчитать
 количество выпадений каждого выдаваемого генератором случайных
 чисел значения из заданного диапазона. Общее количество не менее
 100000. (Предварительно построить оболочку для числа вхождений).
 Подобрать нужную структуру данных.
 * Created by RishatRg on 19.11.2017.
 */
public class Diagramma {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
      /*  for (int i = 0; i <100 ; i++) {
            map.put(i,1);
        }*/
        int a = 0, b = 100;
        for (int i = 0; i < 100000; i++) {
            int tmp = a + (int) (b * Math.random());
            if (map.containsKey(tmp))
                map.put(tmp, map.get(tmp) + 1);
            else map.put(tmp, 1);
        }
        System.out.println(map.entrySet());
    }
}

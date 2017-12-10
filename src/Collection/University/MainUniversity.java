package Collection.University;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by RishatRg on 06.11.2017.
 */
public class MainUniversity {
    public static void main(String[] args)
    {
        LinkedList<Human> humans = new LinkedList<Human>();
       //CompareName name=new CompareName();//сравнивает имена
       // CompareLastName lastName=new CompareLastName();//сравнивает Фамилии
       // ComparePatronymic patronymic=new ComparePatronymic();//сравнивает Отчество
        CompareAge age=new CompareAge();


        try (Scanner in = new Scanner(new File("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Collection\\University\\inUniversity.txt"))) {
            int i= in.nextInt();
                for(int j=0;j<i&in.hasNext();j++)
                 humans.add(new Student(in.nextInt(),in.next(),in.next(),in.next(),in.nextInt(),in.nextLine()));
                while(in.hasNext()) {
                    humans.add(new Lecturer(in.nextInt(), in.next(), in.next(), in.next(),in.nextInt(), in.nextLine()));
                }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Collections.sort(humans,lastName);//сортируем коллекцию по Фамилии
        for (Human x : humans)
            System.out.println(x);
        Collections.sort(humans,new CompareHuman());
        humans.forEach(System.out::println);
        Collections.sort(humans,new CompareAge());
        System.out.println(" Самый старый : "+humans.getLast()+' '+humans.getLast().getAge()+" лет"+'\n'+" Cамый молодой : "+humans.getFirst()+' '+humans.getFirst().getAge()+" лет");

    }
}

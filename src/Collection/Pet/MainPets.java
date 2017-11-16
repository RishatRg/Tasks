package Collection.Pet;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by RishatRg on 04.11.2017.
 */

public class MainPets {

    public static void main(String[] args) {

        LinkedList<Pet> Pets = new LinkedList<Pet>();
        try (Scanner in = new Scanner(new File("D:\\inPets.txt"))) {

            while (in.hasNext())
                Pets.add(new Pet(in.next(), in.next(), in.nextInt()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();

                System.out.println("  Первый элемент коллекции: "+Pets.getFirst());

                System.out.println("  Последний элемент коллекции: "+Pets.getLast());

                System.out.println("  Удаляем последний элемент: "+Pets.removeLast()+"\n");

            for (Pet x : Pets)
                System.out.println(x);
        System.out.println();

        System.out.println("  Удаляем первый элемент: "+Pets.removeFirst()+"\n");

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();

        System.out.println("  Удаляем головной элемент: "+Pets.pollFirst()+"\n");

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();

        Pets.addFirst(new Pet("Мафин","дикий",4));

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();

        Pets.offerLast(new Pet("Райхан","добрый",5));

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();

        Pets.offerLast(new Pet("Чих","Ленивый",5));

        for (Pet x : Pets)
            System.out.println(x);
        System.out.println();


    }
}

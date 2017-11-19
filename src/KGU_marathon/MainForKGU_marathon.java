package KGU_marathon;

/**
 * Created by RishatRg on 15.10.2017.
 */
public class MainForKGU_marathon {
    public static void main(String[] args) {
        Result marathon=new Result("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\KGU_marathon\\in.txt");
        System.out.println("--Вывод участников в порядке возрастания времени---");
        marathon.show(marathon.sortMassUP());// вывод участников в порядке возрастания времени
        System.out.println("--Вывод участников в порядке убывания времени---");
        marathon.show(marathon.sortMassDown());// вывод участнико в порядке убывания времени
        System.out.println("----- Победитель: ");
        marathon.show(marathon.top1());
        System.out.println("---- Тройка призеров: ");
        marathon.show(marathon.top3());
        System.out.println("---- Общее количество участнико: "+marathon.getNumOfParticipants());
        System.out.println("---- Среднее время: "+marathon.getAvrTime());

    }
}

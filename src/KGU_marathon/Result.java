package KGU_marathon;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by RishatRg on 15.10.2017.
 */
class sortDown implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        double time1 = o1.getTime();
        double time2 = o2.getTime();

        if (time1 < time2) {
            return 1;
        } else if (time1 > time2) {
            return -1;
        } else {
            return 0;
        }
    }
}
class sortUP implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        double time1 = o1.getTime();
        double time2 = o2.getTime();

        if (time1 > time2) {
            return 1;
        } else if (time1 < time2) {
            return -1;
        } else {
            return 0;
        }

    }
}
public class Result {
    private int n;
    private Student[] students;

    Result(String fileName) {
        try (Scanner in = new Scanner(new File(fileName)))
        {
            n = in.nextInt();
            students = new Student[n];
            for (int i = 0; i < students.length; i++) {
                if (in.hasNext())
                    students[i] = new Student(in.next(), in.next(), in.nextDouble());
            }
            Arrays.sort(students,new sortUP());
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }
    public void show(Student[] student) {
        for (Student tmp : student) {
            System.out.println(tmp.getFirstName() + " " + tmp.getLastName() + " " + tmp.getTime());
        }
    }

    public void show(Student student) {

        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getTime());

    }
    public Student[] sortMassUP() {
        Student[] tmp = new Student[n];
        for (int i = 0; i < students.length; i++) {
            tmp[i] = students[i];
        }
        Arrays.sort(tmp, new sortUP());

        return tmp;
    }
    public Student[] sortMassDown() {
        Student[] tmp = new Student[n];
        for (int i = 0; i < n; i++)
            tmp[i] = students[i];
        Arrays.sort(tmp, new sortDown());
        return tmp;
    }
    public Student[] top3() {
        Student[] tmp = new Student[3];

        for (int i = 0; i < 3; i++)
        {
            tmp[i]=students[i];
        }
        return tmp;
    }
    public Student top1() {

       /* Student tmp = null;
        double time = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == 0) {
                time = time = students[i].getTime();
                count = i;
            }
            if (time > students[i].getTime()) {
                time = students[i].getTime();
                count = i;
            }

        }
        if (time != 0 & count != 0) {
            tmp = students[count];
        }*/

        return students[0];
    }
    public int getNumOfParticipants()
    {
        return students.length;
    }
    public double  getAvrTime()    {
        double avr=0;
        for (int i = 0; i <students.length; i++)
        {
            avr+=students[i].getTime();
        }
        return avr/students.length;
    }
}

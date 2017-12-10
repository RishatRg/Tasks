package MultiThreading;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RishatRg on 25.11.2017.
 * 28b
 Вводится массив из n чисел. Вычислить его сумму с помощью k потоков (число k вводится),
 каждый из которых считает сумму своего кусочка массива.
 При выполнении этой задачи задача 28с считается зачтенной.


 */

public class Second
{
    public static int[] array = {1,1,2,2,3,3,4,4,5,5};
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Введите число потоков:");
        int k=in.nextInt();

        for (int i:array )
            System.out.print(i+" ");
        System.out.println();
        int iter=array.length/k;
        Run [] runs=new Run[k];
        for(int i=0;i<k;i++)
        {
            runs[i]=new Run(""+i,i*iter,iter);
        }


        try {
          //  Thread.sleep(1000);
            for(int i=0;i<k;i++)
                runs[i].t.join();
            }
        catch (InterruptedException е) {
        }

        System.out.println(" Total="+Run.total);

    }
}

class Run implements Runnable {
    public static int total=0;
    int j,k;
    public Thread t;
    Run( String name,int j,int k)
    {
        String n=name;
        this.j=j;
        this.k=k;
        t= new Thread(this,n);
        t.start();
    }
    @Override
    public void run() {
        int total1 = 0;

        for ( int i = j; i <k+j; i++) {
            total1 += Second.array[i];
        }
        System.out.println("Result " + Thread.currentThread().getName() + " = " + total1);
        total+=total1;
    }

}
package MultiThreading;

import java.util.Scanner;

/**
 * 28a
 Дан массив. Сосчитать сумму компонентов массива с помощью двух потоков.
 При этом они начинают работу вместе и каждый из них считает сумму компонентов всего массива.
 * Created by RishatRg on 26.11.2017.
 */
public class First {

        public static int[] array = {1,1,2,2,3,3,4,4,5,5};
        public static void main(String[] args) {

            for (int i:array )
                System.out.print(i+" ");
            System.out.println();

            new MyThread("Первый");
            new MyThread("Второй");

            try {
                   Thread.sleep(1000);
                }
            catch (InterruptedException е) {
            }



        }
    }

class MyThread implements Runnable {

        public Thread t;
        MyThread( String name)
        {
            String n=name;
            t= new Thread(this,n);
            t.start();
        }
        @Override
        public void run() {
            int total = 0;

            for ( int i = 0; i <First.array.length; i++) {
                total += First.array[i];
            }
            System.out.println("Ресультат: " + Thread.currentThread().getName() + " = " + total);

        }

    }


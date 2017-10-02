package toTask;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by RishatRg on 02.10.2017.
 */


public class Task1 {

    double sol(int n) {
        double tmp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tmp *= 1 / (double) ((i + j * j));
            }
        }
        return tmp;
    }

    BigDecimal BIGsol(int n) {
        BigDecimal tmp = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tmp = tmp.multiply(BigDecimal.valueOf(1 / (double) ((i + j * j))));
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Task1 t = new Task1();

        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            n = in.nextInt();
            System.out.println(t.sol(n));
            System.out.println(t.BIGsol(n));
        }


    }
}

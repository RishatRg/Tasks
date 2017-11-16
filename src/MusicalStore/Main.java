package MusicalStore;

import java.util.Scanner;

/**
 * Created by RishatRg on 20.10.2017.
 */


public class Main {
    public static void main(String[] args) {
        MusicalInstrument MusicalInstrument[][]= new MusicalInstrument[][]{
                {new Guitar("Martin D-41 ",5600),new Guitar("Gipson  ES 0335 TDC",700000),new Violin("Tomas Vagner NV2850",56555)},
                {new Cello(" Stradivarius",500000),new Piano("Yamaha 88 ",8900000),new Balalaika("Doff BPS",1500)}
        };
        Scanner in= new Scanner(System.in);
        int n=0;
        System.out.println("Укажите номер ячейки на котором лежит инструмент: ");
        n=in.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Название: "+MusicalInstrument[0][0].getName()+" и звучит как:"+MusicalInstrument[0][0].getSound()+" стоит: "+MusicalInstrument[0][0].getCost());
                break;
            case 2:
                System.out.println("Название: "+MusicalInstrument[0][1].getName()+" и звучит как:"+MusicalInstrument[0][1].getSound()+" стоит: "+MusicalInstrument[0][1].getCost());
                break;
            case 3:
                System.out.println("Название: "+MusicalInstrument[0][2].getName()+" и звучит как:"+MusicalInstrument[0][2].getSound()+" стоит: "+MusicalInstrument[0][2].getCost());
                break;
            case 4:
                System.out.println("Название: "+MusicalInstrument[1][0].getName()+" и звучит как:"+MusicalInstrument[1][0].getSound()+" стоит: "+MusicalInstrument[1][0].getCost());
                break;
            case 5:
                System.out.println("Название: "+MusicalInstrument[1][1].getName()+" и звучит как:"+MusicalInstrument[1][1].getSound()+" стоит: "+MusicalInstrument[1][1].getCost());
                break;
            case 6:
                System.out.println("Название: "+MusicalInstrument[1][2].getName()+" и звучит как:"+MusicalInstrument[1][2].getSound()+" стоит: "+MusicalInstrument[1][2].getCost());
                break;
            default: System.out.println("Укажите правильную ячейку !");
        }
    }
}

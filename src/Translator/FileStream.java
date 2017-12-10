package Translator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * На вход программы подается 2 файла. Первый содержит английский текст. Второй – строки вида: Строка1 = Строка2.
 * Где строка1 – слово на английском языке, а строка2 – его перевод на русский.
 * Вывести на экран дословный перевод текста из первого файла с помощью перевода из второго, который нужно хранить в Map.
 * Created by RishatRg on 10.12.2017.
 */
public class FileStream {
    public static void main(String[] args) {

        String text="";
        Path dicPath = Paths.get("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Translator\\dictionary");
        Path inPath= Paths.get("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Translator\\input");
        Path tranPath= Paths.get("D:\\рабочий стол\\уку\\4 семестр\\Java!\\Tasks\\src\\Translator\\translated");
        Map<String,String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dicPath.toString()));BufferedReader br1 = new BufferedReader(new FileReader(inPath.toString()))) {
            if (Files.exists(dicPath)) {
                String tmp;
                while ((tmp = br.readLine()) != null) {
                    char[] tmp1 = tmp.toCharArray();

                    String key = "", value = "";
                    boolean p=true;
                    for (int i = 0; i < tmp1.length; i++) {
                        if (tmp1[i] != '='&&p) {
                            key += tmp1[i];
                            p = true;
                        }
                        else if (tmp1[i] == '=') {p=false;
                        } else value += tmp1[i];
                    }

                    map.put(key,value);

                }
                while((tmp=br1.readLine())!=null)
                {
                    text+=tmp;
                }
                text=text.toLowerCase();
                br.close();
                br1.close();
            } else System.out.println("Неверно указан путь!");


        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println(text);

        for(Map.Entry<String,String> entry : map.entrySet())
        {
             text=text.replaceAll(entry.getKey(),entry.getValue());
        }
        System.out.println(text);
       try (FileWriter fw = new FileWriter(tranPath.toString())) {
            if (Files.exists(tranPath))
            {
                fw.write(text);
            }else System.out.println("Неверно указан путь!");

        }
        catch(IOException e)
        {
            e.getMessage();
        }


    }
}


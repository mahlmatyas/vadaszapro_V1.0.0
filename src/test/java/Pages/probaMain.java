package Pages;

import General.Meth;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class probaMain {
    public static void main(String[] args) {
        //System.out.println(probaMain.gyariSzamRandom().substring(0,3)+"-"+probaMain.gyariSzamRandom().substring(0,4));
        //probaMain.msgGenerator();
        //System.out.println(probaMain.phoneGenerate());

        int lines = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            while (reader.readLine() != null) {
                lines++;
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    static Random random = new Random();

    public static String gyariSzamRandom(){
        random = new Random();
        int tmp = random.nextInt(1111111111);
        return String.valueOf(tmp);
    }

    public static void msgGenerator(){
        String val = "Ez 10 db generalt uzenetet\n\n";
        for (int i = 0; i < 10; i++) {
            val = val+"Ez a ("+String.valueOf(i+1)+") szamu teszt üzenet, random ID-val: "+ Meth.randNum()+"\n";
        }
        System.out.println(val);
    }

    public static String phoneGenerate(){
        String numPart_0 = "+36";
        String[] arr = {"20","30","70"};
        String numPart_1 = arr[random.nextInt(arr.length)];
        String numPart_2 = Meth.randNum().substring(0,3);
        String numPart_3 = Meth.randNum().substring(0,4);
        return numPart_0+numPart_1+"/"+numPart_2+"-"+numPart_3;
    }

    public static void array(){
        String[] a = new String[]{"3","5","8"};
        String x = a[random.nextInt(a.length)];
        System.out.println(x);
    }
}

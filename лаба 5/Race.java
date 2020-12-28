package Race;

import java.io.*;
import java.util.Arrays;

public class Race
{
     String number;
     double amount;
     boolean prize;
     Race () throws IOException {
         String bolv;
         BufferedReader input = new BufferedReader (new InputStreamReader(System.in,"Cp1251"));
         System.out.print("\nВедите дату проведения соревнований:");
         this.number = input.readLine();
         System.out.print("\nВведите количество участников:");
         this.amount = Double.parseDouble(input.readLine());
         while(true) {
             System.out.print("\nНаличие приза (Да/Нет): ");
             bolv = input.readLine();
             if ("Yes".equals(bolv)) {
                 this.prize = true;
                 break;
             }
             if ("No".equals(bolv)) {
                 this.prize = false;
                 break;
             }
             System.out.print("\nОшибка! Повторите ввод");
         }


     }
    public static int Amount(Race []races)
    {
        int a = 0;
        for (int i = 0; i < 3; i++)

            a += races[i].amount;
        return a;

    }

    public static int hasPrize(Race []races)
    {
        int p = 0;
        for(int i = 0;  i < 3; i++)
            if (races[i].prize == true)
                p++;
        return p;
    }
     public void InputInFile() throws IOException {
         File file = new File ("document.doc");
         file.deleteOnExit();
         FileWriter writer;
         writer = new FileWriter(file,true);
         writer.append ("\nДата соревнований "+this.number+"; количество участников: "+this.amount+";" );
         if (this.prize)
             writer.append("Есть приз.\n");
         else
             writer.append("Приз не предусмотрен.\n");

         writer.flush();
         writer.close();
     }
     public static void OutputOfFile() throws IOException {
         File file = new File("document.doc");
         FileReader reader;
         char buffer[];
         int numb;
         buffer = new char [1];
         reader = new FileReader(file);
         do {
             numb = reader.read (buffer);
             System.out.print (buffer [0]);
         }
         while (numb == 1);
         reader.close();
     }
     public static void main (String[] args) throws IOException {
         Race[] races;
         races = new Race[3];
         for (int i = 0; i < 3; i++)
             races[i] = new Race();

         for (int i = 0; i < 3; i++)

             races[i].InputInFile();
             System.out.println("Общее количество участников:" +Race.Amount(races));
             System.out.println("Количество соревнований с призовым фондом:" +Race.hasPrize(races));
             OutputOfFile();

     }
}

package lab4;

import java.util.Scanner;
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Child chi1 = new Child(10);
        chi1.printInfo();
        Teenager teen1 = new Teenager(2, "good");
        teen1.printInfo();
        System.out.println("Для выбора родителя:");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Введите количество детей: 1 - немногодетная семья, 2 - многодетная семья: ");
        if(scan.hasNext())
        {
            i = scan.nextInt();
        }
        int j = 0;
        System.out.println("Введите место работы: 1 - больница, 2 - милиция");
        if(scan.hasNext())
        {
            j = scan.nextInt();
        }
        if(i == 1 && j == 1)
        {
            System.out.println("Родитель: ");
            Father f1 = new Father (1, "Hospital", "Father");
            f1.printInfo();
        }
        if(i == 2 && j == 2)
        {
            System.out.println("Родитель: ");
            Mother m1 = new Mother (3, "Police", "Mother");
            m1.printInfo();
        }
        if(i == 1 && j == 2)
        {
            System.out.println("Родитель: ");
            Father f1 = new Father(1, "Police", "Father");
            f1.printInfo();
        }
        if(i == 2 && j == 1)
        {
            System.out.println("Родитель: ");
            Mother m1 = new Mother(4, "Hospital", "Mother");
            m1.printInfo();
        }
        else
            {
            if(i!=1 && i!=2 || j!=1 && j!=2)
            {
                System.out.println("Неверный выбор!");
            }
        }

    }
}

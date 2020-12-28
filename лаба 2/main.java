package com.company;
import lab2.Race;

public class Main {

    public static void main(String[] args) {
	Race []r1 = new Race[5];
    r1[0] = new Race("07.04.2020", 204, true);
    r1[1] = new Race("10.11.2021", 789);
    r1[2] = new Race();
    r1[3] = new Race(r1[0]);
    for(int i = 0;i<4;i++)
    {
        r1[i].print();
    }
    System.out.println("Общее количество участников:" +Race.Amount(r1));
    System.out.println("Количество соревнований с призовым фондом:" +Race.hasPrize(r1));
    }
}

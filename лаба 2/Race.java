package lab2;

public class Race {
    private String number;
    private int amount;
    private boolean prize;

public Race()
{
}
public Race(String number, int amount, boolean prize)
{
this.number = number;
this.amount = amount;
this.prize = prize;
}
public Race(Race o)
{
this.number = o.number;
this.amount = o.amount;
this.prize = o.prize;
}
public Race(String number, int amount)
{
this.number = number;
this.amount = amount;
}
public String getData()
{
return number;
}
public int getNumber()
{
    return amount;
}
public boolean isPrize()
{
    return prize;
}

public static int Amount(Race []race)
{
    int a = 0;
    for (int i = 0; i < 4; i++)

        a += race[i].amount;
        return a;

}

public static int hasPrize(Race []race)
{
    int p = 0;
    for(int i = 0;  i < 4; i++)
        if (race[i].prize == true)
            p++;
        return p;
}
public void print()
{
    System.out.println("Дата: " + this.getData()+"\n"+ "Количество участников: " + this.getNumber());
    if(this.isPrize())
    {
        System.out.println("Имеется призовой фонд.");
    }
    if(!this.isPrize())
    {
        System.out.println("Призовой фонд не предусмотрен.");
    }
}

}




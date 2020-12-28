package Human;

public class Parent extends Human
{
    private int amount;
    String Place;
    public Parent(String FIO, String Sex, int age, int a, String P)
    {
        super(FIO, Sex, age);
        amount = a;
        Place = P;
    }
    public Parent(String FIO, String Sex, int age, int a)
    {
        super(FIO, Sex, age);
        amount = a;
        Place = "Bank";
    }
    public Parent()
    {
        super();
        amount = 3;
        Place = "School";
    }
    public int GetDataamount()
    {
        return amount;
    }
    public String GetDataPlace()
    {
        return Place;
    }
    public String Name()
    {
        name = "Galina";
        return name;
    }
}

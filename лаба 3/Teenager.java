package Human;

public class Teenager extends Human
{
    private int number;
    String Performance;
    public Teenager(String FIO, String Sex, int age, int n, String Perform)
    {
        super(FIO, Sex, age);
        number = n;
        Performance = Perform;
    }
    public Teenager(String FIO, String Sex, int age, int n)
    {
        super(FIO, Sex, age);
        number = n;
        Performance = "good";
    }
    public Teenager()
    {
        super();
        number = 33;
        Performance = "above the average";
    }
    public int GetDatanumber()
    {
        return number;
    }
    public String GetDataPerformance()
    {
        return Performance;
    }
    public String Name()
    {
        name = "Gleb";
        return name;
    }
}

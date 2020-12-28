package lab4;

public class Teenager implements Object, Human
{
    private int number;
    public String Performance;

    public Teenager (int n, String Perform)
    {
        this.number = n;
        this.Performance = Perform;
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
        return (String) ("Ilya");
    }
    public void printInfo() {
        System.out.println("Номер школы - " + GetDatanumber() + "Успеваемость в школе - " + GetDataPerformance() + "Имя - " + Name());
    }
}

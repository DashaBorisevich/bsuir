package lab4;

public class Father extends Parent
{
    public Father (int amount, String Place, String type)
    {
        super(amount, Place, type);
    }
    public String Name()
    {
        return (String) ("Igor");
    }
    public void printInfo()
    {
        System.out.println("Количество детей - " + GetDataamount() + "Место работы: - " + GetDataPlace() + "Тип - " + GetType() + "Имя - " + Name());
    }
    public String GetType()
    {
        return type;
    }
}

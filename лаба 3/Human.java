package Human;

public class Human {
String FIO;
String Sex;
String name;
protected int age;
public Human(String FIO1, String Sex1, int age1)
{
    FIO = FIO1;
    Sex = Sex1;
    age = age1;
}
public Human()
{
    FIO = "Barysevich Dasha";
    Sex = "female";
    age = 18;
}
public String GetDataFIO()
{
    return FIO;
}
public String GetDataSex()
{
    return Sex;
}
public int GetDataage()
{
    return age;
}
public String Name()
{
    return name;
}
}

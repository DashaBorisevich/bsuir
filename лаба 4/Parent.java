package lab4;

public abstract class Parent implements Object, Human
{
    private int amount;
    String Place;
    String type;

    public Parent(int amount, String Place, String type)
    {
        this.amount = amount;
        this.Place = Place;
        this.type = type;
    }
    public int GetDataamount()
    {
        return amount;
    }
    public String GetDataPlace()
    {
        return Place;
    }
    public abstract String GetType();
}

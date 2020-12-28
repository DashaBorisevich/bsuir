package lab4;

public class Child implements Object, Human {
    private int number;

    public Child(int number)
    {
        this.number = number;
    }

    private int GetDataNumber() {
        return number;
    }

    public String Name() {

        return (String) ("Nastya");
    }

    public void printInfo() {
        System.out.println("Номер детского сада - " + GetDataNumber() + "Имя - " + Name());
    }
}




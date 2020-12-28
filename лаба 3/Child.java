package Human;

public class Child extends Human
{
  private int number;
  public Child(String FIO, String Sex, int age, int number)
  {
      super(FIO, Sex, age);
      this.number = number;
  }
  public Child(String FIO, String Sex, int age)
  {
      super(FIO, Sex, age);
      number = 6;
  }
  public Child()
  {
      super();
      number = 11;
  }
  public int GetDatanumber()
  {
      return number;
  }
  public String Name()
  {
      name = "Nastya";
      return name;
  }

}

package Human;

public class WriterInfo
{
    public static void main (String[] args)
    {
        Child c1 = new Child("Andreenko Sasha Viktorovna", "female", 4, 22);
        System.out.println("Child 1 - ФИО:"+c1.GetDataFIO()+", Пол:"+c1.GetDataSex()+", Возраст:"+c1.GetDataage()+", Номер детского сада:"+c1.GetDatanumber()+", Имя:"+c1.Name()+";");

        Child c2 = new Child("Shvaich Vika Andreevna", "female", 3);
        System.out.println("Child 2 - ФИО:"+c2.GetDataFIO()+", Пол:"+c2.GetDataSex()+", Возраст:"+c2.GetDataage()+", Номер детского сада:"+c2.GetDatanumber()+", Имя:"+c2.Name()+";");

        Child c3 = new Child();
        System.out.println("Child 3 - ФИО:"+c3.GetDataFIO()+", Пол:"+c3.GetDataSex()+", Возраст:"+c3.GetDataage()+", Номер детского сада:"+c3.GetDatanumber()+", Имя:"+c3.Name()+";");


        Teenager t1 = new Teenager("Baranov Slava Igorevich", "male", 14, 29, "good");
        System.out.println("Teenager 1 - ФИО:"+t1.GetDataFIO()+", Пол:"+t1.GetDataSex()+", Возраст:"+t1.GetDataage()+", Номер школы:"+t1.GetDatanumber()+", Успеваемость в школе:"+t1.GetDataPerformance()+", Имя:"+t1.Name()+";");

        Teenager t2 = new Teenager("Seriy Dima Ivanovich", "male", 12, 77);
        System.out.println("Teenager 2 - ФИО:"+t2.GetDataFIO()+", Пол:"+t2.GetDataSex()+", Возраст:"+t2.GetDataage()+", Номер школы:"+t2.GetDatanumber()+", Успеваемость в школе:"+t2.GetDataPerformance()+", Имя:"+t2.Name()+";");

        Teenager t3 = new Teenager();
        System.out.println("Teenager 3 - ФИО:"+t3.GetDataFIO()+", Пол:"+t3.GetDataSex()+", Возраст:"+t3.GetDataage()+", Номер школы:"+t3.GetDatanumber()+", Успеваемость в школе:"+t3.GetDataPerformance()+", Имя:"+t3.Name()+";");


        Parent p1 = new Parent("Klim Olga Vasilevna", "male", 36, 3, "Museum");
        System.out.println("Parent 1 - ФИО:"+p1.GetDataFIO()+", Пол:"+p1.GetDataSex()+", Возраст:"+p1.GetDataage()+", Количество детей:"+p1.GetDataamount()+", Место работы:"+p1.GetDataPlace()+", Имя:"+p1.Name()+";");

        Parent p2 = new Parent("Borisevich Galina Igorevna", "male", 27, 4);
        System.out.println("Parent 2 - ФИО:"+p2.GetDataFIO()+", Пол:"+p2.GetDataSex()+", Возраст:"+p2.GetDataage()+", Количество детей:"+p2.GetDataamount()+", Место работы:"+p2.GetDataPlace()+", Имя:"+p2.Name()+";");

        Parent p3 = new Parent();
        System.out.println("Parent 3 - ФИО:"+p3.GetDataFIO()+", Пол:"+p3.GetDataSex()+", Возраст:"+p3.GetDataage()+", Количество детей:"+p3.GetDataamount()+", Место работы:"+p3.GetDataPlace()+", Имя:"+p3.Name()+";");

    }

}

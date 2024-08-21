class Pen
{
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing someting");
    }
    public void printColor()
    {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student
{
    String name;
    int age;
    public void printName()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS_1 {
    public static void main(String[] args)
    {

        Pen gem = new Pen();
        gem.color="blue";
        gem.type= "Gel";
        gem.write();
        gem.printColor();

        Pen fem= new Pen();
        fem.color="Black";
        fem.type="Ballpen";
        fem.printColor();

        Student s1= new Student();
        s1.name="Nishan Giri";
        s1.age=21;
        s1.printName();

    }
}
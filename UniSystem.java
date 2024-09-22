import java.util.*;
 class Student {
    protected String Name;
    protected String Dept;
    protected int id;
    public Student(String Name, String Dept, int id)
    {
        this.Name=Name;
        this.Dept=Dept;
        this.id=id;
    }

    public void enroll(String course)
    {
        System.out.println(Name+" Enrolled in : "+course+" course");
    }
    public void drop(String course)
    {
        System.out.println(Name+"Dropped this course : " + course);
    }
    public void showinfo()
    {
        System.out.println("Name: "+Name+"\n ID: "+id+"\n Department: "+Dept);
    }
}

class Under_grad extends Student
{
    private int Year;

public Under_grad(String Name, String Dept, int id, int Year)
{
super(Name, Dept, id);
this.Year=Year;
}
public void Reg_for_ele()
{
    System.out.println(Name+" registered for elective courses!\n");
}
}
class Grad_Stu extends Student 
{
    
    private String Thesis;
    
    public Grad_Stu(String Name, String Dept, int id, String Thesis)
    {
        super(Name, Dept, id);
        System.out.println(Name+" is completing his thesis in ");
        this.Thesis=Thesis;
    }
    public void Sub_the()
    {
        System.out.println(Name+" Submitted their thesis on "+Thesis);
    }
}
 public class UniSystem
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your Department name: ");
        String department = input.nextLine();
        System.out.print("Enter you ID: ");
        int ID=input.nextInt();
        input.nextLine();
        System.out.print("Enter your enrollment year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter your elective course name: ");
        String crs=input.nextLine();

Under_grad undergradguate = new Under_grad(name, department, ID, year);
undergradguate.showinfo();
undergradguate.enroll(crs);
undergradguate.Reg_for_ele();

System.out.println("Enter details for grad student !");
System.out.print("Enter your Name : ");
String gradName=input.nextLine();
System.out.print("\n Enter your Department: ");
String gradDept=input.nextLine();
System.out.print("\n Enter your ID: ");
int gradID=input.nextInt();
input.nextLine();
System.out.print("\n Enter your thesis name: ");
String gradThesis=input.nextLine();
System.out.println("\n Enter your course to enroll: ");
String gradCourse=input.nextLine();
Grad_Stu graduatedstu = new Grad_Stu(gradName, gradDept, gradID, gradThesis);

graduatedstu.showinfo();
graduatedstu.Sub_the();
graduatedstu.enroll(gradCourse);




input.close();
    }
}
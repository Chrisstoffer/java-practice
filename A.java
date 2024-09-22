public class A {
    int i,j;
    void showij()
    {
        System.out.println("i and j ="+i+", "+j);
    }
}

class B extends A
{
int k;
void showk()
{
    System.out.println("k ="+k);

}
void sum()
{
    System.out.println("sum of i,j and k in subclass = "+(i+j+k));
}
}
class simpleInheritance
{
    public static void main (String [] args)
    {
        A superOb = new A();
       B subOb  = new B();
       
superOb.i = 10;
superOb.j = 8;
System.out.println("Contents of Super objects ");
superOb.showij();
System.out.println();
System.out.println("contents of sub class showing bellow\n");


// child class parameter pass

subOb.i = 9;
subOb.j = 6;
subOb.k = 5;

subOb.showij();
subOb.showk();
System.out.println();

//System.out.println("sum of i j and k in subobj : ");
subOb.sum();

    }
}
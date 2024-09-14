public class Func_Over {

    // method1 for multipication of two numbers 
    int mult (int a, int b)
    {
        return (a*b);
    }
    //method2 with same name but different amount of perameter 
    int mult(int x,int y,int z)
    {
        return (x*y*z);
    }
    // mthod3 of same name as before for different data type multipication 
    double mult(double x, double y)
    {
        return (x*y);
    }
    
    //method4 of same name as before with different data type
    float mult(float x, float y)
    {
        return (x*y);
    }



    public static void main(String[] args) {
        Func_Over object = new Func_Over();

        System.out.println(object.mult(4,5));           //calling first method 

        System.out.println(object.mult(8,9,7));         //calling second method 

        System.out.println(object.mult(50.12344,60.574264));    //calling third method

        System.out.println(object.mult(4.0f,5.0f));             //calling fourth method 
    }
}

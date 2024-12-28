package ArrayPrac;

public class Demo {
    public static void main(String[] args) {
        int x = 15;
        int y = 0;
        try {
            int z = x/y;
        }
        catch(Exception e )
        {
            System.out.println("Hey you cant devide by zero, change the divisor");
        }
        System.out.println("hey im out of try catch");
    }

}

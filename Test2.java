public class Test2 {
public static void main(String argss[])
{
StringBuffer str = new StringBuffer("Hi....");
str.append(" aniket");
System.out.println(str.toString()); //this will add the text at last 

str.insert(13," how are you?");//THIS WILL ADD THE TEXT TO A SPECIFIC INDEX
System.out.println(str.toString());

str.delete(2, 5); //this will delte the string from a starting point to a ending point 
System.out.println(str.toString());

str.reverse();
System.out.println(str.toString());
str.deleteCharAt(0);
System.out.println(str);



}
}

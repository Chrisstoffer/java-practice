package login;



public class main {
    
public static void main(String args [])
{
    IdandPassword idpass = new IdandPassword();
    
    LoginPage logpage = new LoginPage((idpass.getLogiInfo()));
}
}

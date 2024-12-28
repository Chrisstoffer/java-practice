package ArrayPrac;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class logframe extends JFrame implements ActionListener{
    
   
    JLabel name = new JLabel();
    JLabel login = new JLabel();
    JLabel passLabel = new JLabel();
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton button1 = new JButton();
    logframe()
    {
        setTitle("Login page");
        setBounds(100, 100, 1080, 630);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);

        login.setText("login");
        login.setFont(new Font("Cambria",Font.BOLD,30));
        login.setBounds(170, 10, 100, 100);
       login.setVisible(true);

        
        name.setText("Username :");
        name.setFont(new Font("Cambria",Font.BOLD,15));
        name.setBounds(100,100,100,20);
        name.setVisible(true);

        passLabel.setText("Password :");
        passLabel.setFont(new Font("Cambria",Font.BOLD,15));
        passLabel.setBounds(100, 160, 100, 20);
        passLabel.setVisible(true);

        user.setBounds(180,100,150,20);
        user.setVisible(true);

        pass.setBounds(180, 160 , 150, 20);
        pass.setVisible(true);

        button1.setBounds(200,200,100,25);
        button1.setText("login");
        button1.addActionListener(this);
        button1.setVisible(true);
        


        add(button1);
        add(pass);
        add(user);
        add(login);
        add(name);
        add(passLabel);
       

        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("your user name : "+user.getText());
        System.out.println("password : "+pass.getText());
       
    }
   

}
public class LogForm {
public static void main(String[] args) {
    logframe frame = new logframe();
    
}
}

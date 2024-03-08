package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField userText,passText;
    Choice loginChoice;

    JButton loginButton,cancelButton,signupButton;


    Login(){
        super("Login");
        getContentPane().setBackground(new Color(203, 203, 203));

//        for profile image
        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("image/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(310,310,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTwo);
        JLabel profileLabel = new JLabel(fprofileOne);
        profileLabel.setBounds(5,7,250,250);
        add(profileLabel);

//      for username lable
        JLabel username = new JLabel("Username");
        username.setBounds(300,60,100,20);
        add(username);

//        for username textbox
        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);


//        for password lable
        JLabel password = new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);


//        for password lable
        passText = new JTextField();
        passText.setBounds(400,100,150,20);
        add(passText);



//        for login button
        loginButton = new JButton("Login");
        loginButton.setBounds(325,192,100,20);
        loginButton.addActionListener(this);
        add(loginButton);

//        for cancle button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(450,192,100,20);
        cancelButton.addActionListener(this);
        add(cancelButton);


        setSize(640,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginButton)){

            try {
                Connection c = new Connection();
                String user = userText.getText();
                String pass = passText.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next())
                {
                    setVisible(false);
                    new Dashboard();
                }else
                {
                    JOptionPane.showMessageDialog(null, "invalid");
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        } else if (e.getSource().equals(cancelButton)) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();

    }

}
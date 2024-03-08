package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Index extends JFrame{
    Index()
    {
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("image/loader4.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(250,200,350,200);
        add(label);

        getContentPane().setBackground(new Color(0,0,0));
        setLayout(null);
        setLocation(300,50);
        setSize(880,660);
        setVisible(true);

        try {
            Thread.sleep(3000);
            setVisible(false);

            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
    new Index();

    }
}

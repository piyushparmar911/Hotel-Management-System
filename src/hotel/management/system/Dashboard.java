package hotel.management.system;

import  javax.swing.*;
import  java.awt.*;
public class Dashboard extends JFrame {

    JButton add,rec;
    Dashboard()
    {
        super("Royals");
//      for rec button
        rec  = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("comic sans ms", Font.BOLD,15));
        rec.setBackground(Color.black);
        rec.setForeground(Color.white);
        add(rec);


//      for admin button
        add  = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("comic sans ms", Font.BOLD,15));
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add(add);

//        this is for set frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("image/hotel.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1650,1090);
        add(label);



        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}

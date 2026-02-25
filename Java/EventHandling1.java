import javax.swing.*;
import java.awt.event.*;

class EventHandling1
{
    public static void main (String A[])
    {
        JFrame fobj = new JFrame("PPA");

        JButton bobj = new JButton("OK");
        bobj.setBounds(100,100,150,50);

        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button Clicked...");
            }
        });
        fobj.add(bobj);

        fobj.setSize(400,300);
        fobj.setLayout(null);                    // no layout(Blank paper)
        fobj.setVisible(true);                        //default false

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
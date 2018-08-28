import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionAwt implements ActionListener {

    private JButton b1;
    private JButton b2;
    private JTextField t1;
    private  JTextField t2,t3;
    JLabel label1,label2,label3;

    AdditionAwt()
    {
        JFrame frame=new JFrame("Calc");



        b1=new JButton("Add");
        b2=new JButton("Sub");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        label1=new JLabel("First Number");
        label2=new JLabel("Second Number");
        label3=new JLabel("Result");

        frame.setLayout(null);
        frame.setSize(500,500);



        frame.add(b1);
        frame.add(b2);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        b1.setBounds(70,270,100,70);
        b2.setBounds(190,270,100,70);
        t1.setBounds(190,50,200,40);
        t2.setBounds(190,100,200,40);
        t3.setBounds(190,150,200,40);
        label1.setBounds(30,50,200,40);
        label2.setBounds(30,100,200,40);
        label3.setBounds(30,150,200,40);

        b1.addActionListener(this);
        b2.addActionListener(this);


        frame.setVisible(true);


    }

    public static void main(String[] args) {

        AdditionAwt a=new AdditionAwt();



    }


    @Override
    public void actionPerformed(ActionEvent a) {

        if (a.getSource()==b1)
        {
            int v1= Integer.parseInt(t1.getText());
            int v2=Integer.parseInt(t2.getText());
            int v3=v1+v2;
            t3.setText(String.valueOf(v3));

        }
        else if (a.getSource()==b2)
        {
            int v1=Integer.parseInt(t1.getText());
            int v2=Integer.parseInt(t2.getText());
            int v3=v1-v2;
            t3.setText(String.valueOf(v3));
        }


    }
}

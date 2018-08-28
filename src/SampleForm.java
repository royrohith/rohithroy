import samples.Sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleForm implements ActionListener {

    private JButton button1;
    private JPanel panel1;
    JTextField textField;
    JLabel label;

    SampleForm()
    {
        JFrame frame=new JFrame("First app");
        button1=new JButton("click");
        textField=new JTextField();
        frame.setLayout(null);
        frame.setSize(500,500);
        label=new JLabel("FirstName");
        frame.add(button1);
        frame.add(label);
        frame.add(textField);

        button1.setBounds(120,100,70,30);
       button1.addActionListener(this);
        label.setBounds(120,100,90,30);
        textField.setBounds(70,75,90,30);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SampleForm s1=new SampleForm();
        s1.button1.setBackground(Color.YELLOW);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button1) {

            textField.setText("ASSSA");
            button1.setBackground(Color.BLUE);
            button1.setText("Clicked");
            JOptionPane.showMessageDialog(null, "Clicked");
        }

    }
}

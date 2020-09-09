import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {
    private JButton button5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JTextField textfield;
    private JPanel panelMain;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private Double a;
    private Double b;
    private Double c;
    private String opr;
    private Double db;
    private int flag1 =0;

    public Calculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"9");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"0");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!((textfield.getText()).equals("")))
                a = Double.valueOf(textfield.getText());
                textfield.setText("");
                opr="+";
                flag1=0;

            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(a!=null){

                if(flag1==0)
                b=Double.valueOf(textfield.getText());

                switch (opr) {
                    case "+" :

                        textfield.setText("" + (a + b));

                        break;
                    case "*" :

                        textfield.setText("" + (a * b));

                        break;
                    case "/" :

                        db=(a/b);
                        textfield.setText(""+(db));
                        break;



                }
                    a=Double.valueOf(textfield.getText());
                    flag1 =1;

            }

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!((textfield.getText()).equals("")))
                a = Double.valueOf(textfield.getText());
                textfield.setText("");
                opr="*";
                flag1=0;

            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!((textfield.getText()).equals("")))
                a = Double.valueOf(textfield.getText());
                textfield.setText("");
                opr="/";
                flag1=0;

            }
        });

        panelMain.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                textfield.setText(""+textfield.getText()+String.valueOf(e.getKeyChar()));
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText("");
                flag1=0;
                a=null;
                b=null;
                opr=null;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}

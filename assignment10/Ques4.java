import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import javax.swing.*;

public class Ques4 extends JFrame implements ActionListener {

  JLabel jlable;
  JCheckBox jcb1, jcb2, jcb3, jcb4;
  JButton jbutton;

  Ques4() {
    JFrame jframe = new JFrame();
    jframe.setSize(1000, 1000);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jpanel = new JPanel();
    jframe.setSize(1000, 1000);

    jlable = new JLabel("GeekBuy");
    jlable.setBounds(50, 50, 300, 20);

    jcb1 = new JCheckBox("Levi's Jeans : 3000");
    jcb1.setBounds(100, 100, 150, 20);
    jcb2 = new JCheckBox("Denim Jeans : 5000");
    jcb1.setBounds(100, 150, 150, 20);
    jcb3 = new JCheckBox("Urban Jeans : 2000");
    jcb1.setBounds(100, 200, 150, 20);
    jcb4 = new JCheckBox("Roadster Jeans : 4000");
    jcb1.setBounds(100, 250, 150, 20);

    jbutton = new JButton("Place Order");
    jbutton.setBounds(100, 250, 80, 30);
    jbutton.addActionListener(this);

    jpanel.add(jlable);
    jpanel.add(jcb1);
    jpanel.add(jcb2);
    jpanel.add(jcb3);
    jpanel.add(jcb4);
    jpanel.add(jbutton);

    jframe.add(jpanel);

    jframe.pack();
    jframe.setVisible(true);
  }

  public static void main(String args[]) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new Ques4();
        }
      }
    );
  }

  public void actionPerformed(ActionEvent e) {
    float amount = 0;

    String message = "";

    if (jcb1.isSelected()) {
      amount += 3000;
      message = "Levi's Jeans\n";
    } else if (jcb1.isSelected()) {
      amount += 5000;
      message = "Denim Jeans\n";
    } else if (jcb1.isSelected()) {
      amount += 2000;
      message = "Urban Jeans\n";
    } else if (jcb1.isSelected()) {
      amount += 4000;
      message = "Roadster Jeans\n";
    }

    JOptionPane.showMessageDialog(this, message + "Total Amount: " + amount);
  }
}

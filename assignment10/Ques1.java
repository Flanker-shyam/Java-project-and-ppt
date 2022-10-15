import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import javax.swing.*;

public class Ques1 extends JFrame implements ActionListener {

  JTextField jt;
  JLabel jl;

  Ques1() {
    JFrame jf = new JFrame("Fctorial");
    jf.setSize(700, 700);

    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jp = new JPanel();
    JButton jb = new JButton("Calculate");
    jl = new JLabel("");
    jt = new JTextField("Enter number");

    jb.addActionListener(this);
    jp.setSize(700, 700);
    jp.add(jt);
    jp.add(jb);
    jp.add(jl);

    jf.add(jp);

    jf.pack();
    jf.setVisible(true);
  }

  public static void main(String args[]) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new Ques1();
        }
      }
    );
  }

  public void actionPerformed(ActionEvent e) {
    int num = Integer.parseInt(jt.getText());
    jl.setText(String.valueOf(findFactorial(num)));
  }

  public int findFactorial(int num) {
    if (num == 0) return 1;

    return num * findFactorial(num - 1);
  }
}

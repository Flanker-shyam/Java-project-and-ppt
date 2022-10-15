import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import javax.swing.*;

public class Ques2 extends JFrame {

  JLabel jl1, jl2, jl3;

  Ques2() {
    JFrame jf = new JFrame("Buttons");

    jf.setSize(700, 700);

    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jp = new JPanel();

    jp.setSize(700, 700);
    JButton jb1, jb2, jb3;
    jb1 = new JButton("Good Morning");
    jb2 = new JButton("Hello");
    jb3 = new JButton("Welcome");

    jl1 = new JLabel("");
    jl2 = new JLabel("");
    jl3 = new JLabel("");

    jp.add(jb1);
    jp.add(jl1);
    jp.add(jb2);
    jp.add(jl2);
    jp.add(jb3);
    jp.add(jl3);

    jf.add(jp);

    jf.pack();
    jf.setVisible(true);

    jb1.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          jl1.setText("Good Morning");
        }
      }
    );

    jb1.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          jl1.setText("Good Morning");
        }
      }
    );

    jb2.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          jl2.setText("Hello");
        }
      }
    );

    jb3.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          jl3.setText("Welcome");
        }
      }
    );
  }

  public static void main(String args[]) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new Ques2();
        }
      }
    );
  }
}

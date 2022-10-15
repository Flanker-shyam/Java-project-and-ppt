import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;
import javax.swing.*;

public class Ques3 extends JFrame implements ActionListener {

  JLabel jl1;
  ImageIcon imageicon;

  Ques3() {
    JFrame jf = new JFrame("Flags");
    jf.setSize(700, 700);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jp = new JPanel();
    jp.setSize(700, 700);

    JButton jb1 = new JButton("India");
    JButton jb2 = new JButton("Russia");
    JButton jb3 = new JButton("USA");

    jl1 = new JLabel();
    jb1.setActionCommand("India");
    jb2.setActionCommand("Russia");
    jb3.setActionCommand("USA");

    jb1.addActionListener(this);
    jb2.addActionListener(this);
    jb3.addActionListener(this);

    jp.add(jb1);
    jp.add(jb2);
    jp.add(jb3);

    jp.add(jl1);

    jf.add(jp);
    jf.pack();
    jf.setVisible(true);
  }

  public static void main(String args[]) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new Ques3();
        }
      }
    );
  }

  public void actionPerformed(ActionEvent ae) {
    String s = ae.getActionCommand();

    if (s.equals("India")) {
      imageicon = new ImageIcon("india.jpg");
    } else if (s.equals("Russia")) {
      imageicon = new ImageIcon("russiaFlag.jpeg");
    } else if (s.equals("USA")) {
      imageicon = new ImageIcon("usaFlag.png");
    }

    jl1.setIcon(imageicon);
  }
}

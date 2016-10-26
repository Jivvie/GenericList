package ListPackage.gjvon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gjvon on 10/25/16.
 */
public class Display extends JFrame {
    //constants
    final String INFORMATION = "Please follow steps as accordingly.";
    final int WIDTH = 100;
    final int HEIGHT = 100;
    //panel and its objects
    private JPanel panel;
    private JButton changeIndexBtn;
    private JButton addValueBtn;
    private JLabel showInformationLabel;

    Display() {
        //build display
        super("Display");
        super.setSize(WIDTH, HEIGHT);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);
        buildDisplay();
    }

    private void buildDisplay() {
        //build buttons
        changeIndexBtn = new JButton();
        changeIndexBtn.addActionListener(new IndexBtnClicked());
        addValueBtn = new JButton();
        addValueBtn.addActionListener(new AddValuesBtnClicked());
        //build labels
        showInformationLabel = new JLabel();
        showInformationLabel.setText(INFORMATION);
    }

    public <E> E enterDataintoList() {
        E value = (E) JOptionPane.showInputDialog(null, "Enter a value");
        return value;
    }

    //Action Listeners
    public class IndexBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class AddValuesBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class DoneBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}

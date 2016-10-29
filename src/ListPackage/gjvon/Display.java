package ListPackage.gjvon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gjvon on 10/25/16...
 */
public class Display extends JFrame {
    //constants
    final String INFORMATION = "You may click on the buttons to do anything you would like to. I assume steps are" +
            "self explanatory. To my knowledge, you understand what you are able to do.";
    //ToDO: Configure for 4K Resolution // In reference to display Witdth
    final int WIDTH = 700;
    //ToDO: Configure for 4K Resolution //In reference to display   length
    final int HEIGHT = 300;
    Object listOfNodes;
    GenericLinkedList listObject;
    //panel and its objects
    private JPanel panel;
    private JButton removeAtIndexBtn;
    private JButton addValueBtn;
    private JButton viewAllBtn;
    private JTextArea showInformationLabel;

    Display(GenericLinkedList list) {
        this.listObject = list;
        this.listOfNodes = list.list;
        //build display
        buildDisplay();
    }

    private void buildDisplay() {
        panel = new JPanel();
        FlowLayout myLayout = new FlowLayout();
        panel.setLayout(myLayout);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //build buttons
        removeAtIndexBtn = new JButton("Remove at Index");
        removeAtIndexBtn.addActionListener(new IndexBtnClicked());
        addValueBtn = new JButton("Add Values");
        addValueBtn.addActionListener(new AddValuesBtnClicked());
        viewAllBtn = new JButton("View All");
        viewAllBtn.addActionListener(new ViewAllElementClicked());
        //build labels
        showInformationLabel = new JTextArea(5, 50);
        showInformationLabel.setText(INFORMATION);
        showInformationLabel.setWrapStyleWord(true);
        showInformationLabel.setLineWrap(true);
        showInformationLabel.setFocusable(false);
        showInformationLabel.setEditable(false);
        //add label
        panel.add(showInformationLabel);

        //add buttons
        panel.add(removeAtIndexBtn);
        panel.add(addValueBtn);
        panel.add(viewAllBtn);
        this.add(panel);

        //show display
        this.setVisible(true);
    }

    public void D_removeAtIndex() {
        String index = JOptionPane.showInputDialog(null, "Remove value at what Index?");
        int indexToInt = -1;
        try {
            indexToInt = Integer.parseInt(String.valueOf(index));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INCORRECT VALUE!!!!", "Wrong Input", JOptionPane.ERROR_MESSAGE);
        }
        if (indexToInt > -1) {
            listObject.remove(indexToInt);
        }
    }

    public void D_clearList() {
        listObject.clear();
    }

    public void D_addAtIndex(int index) {
        listObject.add(index);
    }

    public void D_viewAllElements() {
        JOptionPane.showMessageDialog(null, listObject.toString());
    }

    public <E> void D_enterDataintoList() {
        E value = (E) JOptionPane.showInputDialog(null, "Enter a value");
        listObject.add(value);
    }

    //Action Listeners
    public class IndexBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            D_removeAtIndex();

        }
    }

    private class AddValuesBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            D_enterDataintoList();
        }
    }

    private class RemoveAtIndexBTNClicked {

    }

    private class DoneBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class ViewAllElementClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            D_viewAllElements();
        }
    }

}

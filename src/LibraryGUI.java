import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI extends JFrame implements ActionListener {

    JMenu fileMenu;
    JMenu adminMenu;


    public LibraryGUI() {
        setTitle("Library Management System");
        setSize(500, 500);
        setBackground(Color.WHITE);
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jbutton = new JButton("Add Books");
        jbutton.addActionListener(this);
        Container jpane = getContentPane();
        jpane.add(jbutton);

        createFileMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);

        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("A Menu");

    } //end constructor


    private void createFileMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        fileMenu = new JMenu("File");

        fileMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Exit");        //New
        // make sure the program is listening for clicks: handle them in 'this' class
        item.addActionListener(this);
        // attach the item to the menu
        fileMenu.add(item);
    }
    public static void main(String[] args) {
        LibraryGUI lGUI = new LibraryGUI();
        lGUI.setVisible(true);
    } //end main

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hi there");

    } //end actionPerformed


}//end class

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI extends JFrame implements ActionListener {

    JMenu fileMenu;
    JMenu bookMenu;
    JMenu customerMenu;

    public static void main(String[] args) {
        LibraryGUI lGUI = new LibraryGUI();
        lGUI.setVisible(true);
    } //end main

    public LibraryGUI() {
        Container cPane;

        setTitle("Library Management System");
        setSize(500, 500);
        setBackground(Color.WHITE);
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        //JButton jbutton = new JButton("Add Books");
        //jbutton.addActionListener(this);
        Container jpane = getContentPane();
        //jpane.add(jbutton);

        createFileMenu();
        createBookMenu();
        createCustomerMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bookMenu);
        menuBar.add(customerMenu);


    } //end constructor


    private void createFileMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        fileMenu = new JMenu("File");

        fileMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Save");
        // make sure the program is listening for clicks: handle them in 'this' class
        item.addActionListener(this);
        // attach the item to the menu
        fileMenu.add(item);


        item = new JMenuItem("Exit");        //New

        item.addActionListener(this);

        fileMenu.add(item); }

    public void createBookMenu(){
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        bookMenu = new JMenu("Book");

        bookMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Add");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Amend");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Delete");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Reserve");
        item.addActionListener(this);
        bookMenu.add(item);

    }

    public void createCustomerMenu(){
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        customerMenu = new JMenu("Customer");

        customerMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Add");
        item.addActionListener(this);
        customerMenu.add(item);

        item = new JMenuItem("Amend");
        item.addActionListener(this);
        customerMenu.add(item);

        item = new JMenuItem("Delete");
        item.addActionListener(this);
        customerMenu.add(item);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String menuName;
        String myBook;
        menuName = e.getActionCommand();
        myBook = e.getActionCommand();// what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Quit")) {
            System.exit(0);
        } // end if
        else if (menuName.equals("Add")){
            JOptionPane.showInputDialog("Please enter name of book");

        }
    }
}//end class

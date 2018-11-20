import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class LibraryGUI extends JFrame implements ActionListener {

    JMenu fileMenu;
    JMenu bookMenu;
    JMenu customerMenu;

    public static void main(String[] args) {
        LibraryGUI lGUI = new LibraryGUI();
        lGUI.setVisible(true);
    } //end main

    JPanel p = new JPanel();
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

        JLabel library = new JLabel("Library Management System");
        library.setFont(new Font("Serif",Font.PLAIN, 30));
        cPane.add(library);

        ImageIcon icon = new ImageIcon("bookshelf.jpg");
        JLabel label = new JLabel(icon);
        cPane.add(label);

    } //end constructor


    private void createFileMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        fileMenu = new JMenu("File");

        fileMenu.setBackground(Color.white);

        item = new JMenuItem("Open");        //New

        item.addActionListener(this);

        fileMenu.add(item);

        // create the first item
        item = new JMenuItem("Save");
        // make sure the program is listening for clicks: handle them in 'this' class
        item.addActionListener(this);
        // attach the item to the menu
        fileMenu.add(item);


        item = new JMenuItem("Exit");        //New

        item.addActionListener(this);

        fileMenu.add(item);
    }

    public void createBookMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        bookMenu = new JMenu("Book");

        bookMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Add Book");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Amend Book");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Delete Book");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Reserve Book");
        item.addActionListener(this);
        bookMenu.add(item);

    }

    public void createCustomerMenu() {
        JMenuItem item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        customerMenu = new JMenu("Customer");

        customerMenu.setBackground(Color.white);

        // create the first item
        item = new JMenuItem("Add Customer");
        item.addActionListener(this);
        customerMenu.add(item);

        item = new JMenuItem("Amend Customer");
        item.addActionListener(this);
        customerMenu.add(item);

        item = new JMenuItem("Delete Customer");
        item.addActionListener(this);
        customerMenu.add(item);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String fileMenuName;
        String bookMenuName;
        String customerMenuName;

        fileMenuName = e.getActionCommand();
        bookMenuName = e.getActionCommand();
        customerMenuName = e.getActionCommand();

        if (fileMenuName.equals("Open")){


        }

        else if (fileMenuName.equals("Save")){
            JOptionPane.showConfirmDialog(null, "Are you sure you want to save details?");


        }


        // note the String comparison
        else if (fileMenuName.equals("Exit")) {
            JOptionPane.showConfirmDialog(null, "Are you sure you want to exit");
            if (true) {
                JOptionPane.showMessageDialog(null, "Thank you for visiting: Goodbye!!");
                System.exit(0);
            }
        }



            // end if

             if (bookMenuName.equals("Add Book")) {
                JOptionPane.showConfirmDialog(null, "Are you sure you want to add a book?");
                if (true) {



                  addBookFrame();


                }
                else {
                    return;
                }
            }

            else if (bookMenuName.equals("Amend Book")){
                JOptionPane.showConfirmDialog(null, "Are you sure you want to amend a book?");
                if (true) {

                    amendBookFrame();

                }

            }

            else if (bookMenuName.equals("Delete Book")){
                JOptionPane.showConfirmDialog(null, "Are you sure you want to delete a book?");
                if (true) {

                    deleteBookFrame();
                }

            }

            else if (bookMenuName.equals("Reserve Book")) {
                JOptionPane.showConfirmDialog(null, "Are you sure you want to reserve a book?");
                if (true) {

                    reserveBookFrame();

                }

            }

             if (customerMenuName.equals("Add Customer")){
                JOptionPane.showConfirmDialog(null, "Are you sure you want to add a customer?");
                if (true) {

                    addCustomerFrame();

                }

            }

            else if (customerMenuName.equals("Amend Customer")){
                JOptionPane.showConfirmDialog(null, "Are you sure you want to amend a customer?");
                if (true) {

                    amendCustomerFrame();

                }

            }

            else  if (customerMenuName.equals("Delete Customer")){
                JOptionPane.showConfirmDialog(null, "Are you sure you want to delete a customer?");
                if (true) {

                    deleteCustomerFrame();

                }

            }


        }




    private void addBookFrame() {


        JFrame jFrame = new JFrame();
        String header = "Add Book";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel jp = new JPanel();
        jFrame.add(jp);
        JLabel title = new JLabel("Title");
        title.setVerticalAlignment(JLabel.BOTTOM);
        jp.add(title);
        JTextField jtf = new JTextField();
        jtf.setSize(1150,100);
        jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);


        JLabel author = new JLabel("Author");
        author.setVerticalAlignment(JLabel.BOTTOM);
        jp.add(author);
        jtf = new JTextField();
        //jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);


        JLabel isbn = new JLabel("ISBN");
        jp.add(isbn);
        jtf = new JTextField();
        jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);

        JButton addBook = new JButton("Add Book");

        jp.add(addBook);


    }

    private void amendBookFrame() {
        JFrame jFrame = new JFrame();
        String header = "Amend Book";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);




    }

    private void deleteBookFrame() {
        JFrame jFrame = new JFrame();
        String header = "Delete Book";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }


    private void reserveBookFrame() {
        JFrame jFrame = new JFrame();
        String header = "Reserve Book";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }


    private void addCustomerFrame() {

        JFrame jFrame = new JFrame();
        String header = "Add Customer";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel jp = new JPanel();
        jFrame.add(jp);
        JLabel name = new JLabel("Name");
        jp.add(name);
        JTextField jtf = new JTextField();
        jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);


        JLabel address = new JLabel("Address");
        jp.add(address);
        jtf = new JTextField();
        jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);


        JLabel isbn = new JLabel("ISBN");
        jp.add(isbn);
        jtf = new JTextField();
        jtf.setBounds(110,130,80,40);
        jtf.addActionListener(this);
        jp.add(jtf);

        JButton addCustomer = new JButton("Add Customer");
        jp.add(addCustomer);


    }


    private void amendCustomerFrame() {
        JFrame jFrame = new JFrame();
        String header = "Amend Customer";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);




    }

    private void deleteCustomerFrame() {
        JFrame jFrame = new JFrame();
        String header = "Amend Customer";
        jFrame.setTitle(header);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }




}//end class

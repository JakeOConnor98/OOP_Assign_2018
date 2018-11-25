import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


public abstract class LibraryMS {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        //will only accept books in the array
        ArrayList<Customer> customers = new ArrayList<>(); //will only accept customers in the array


        JTextArea jta = new JTextArea("List of Books");
        for (Book b: books){
            jta.append(b.toString());
        }

        JTextArea jta2 = new JTextArea("List of Customers");
        for (Customer c: customers){
            jta2.append(c.toString());
        }

        JOptionPane.showMessageDialog(null, jta);
        JOptionPane.showMessageDialog(null, jta2);

        Book b = new Book();
        books.add(b);

    }

    public static void addBook(Book book){

        Book b = new Book();
        b.addBook(b);

    }

    public static void amendBook(Book amendBook){

    }

    public static void deleteBook(Book deleteBook){

    }

    public static void reserveBook(Book reserveBook){

    }

    public static void addCustomer(Customer addCustomer){

    }

    public static void amendCustomer(Customer amendCustomer){

    }

    public static void deleteCustomer(Customer deleteCustomer){

    }




    public static void SaveBooks(ArrayList<Book> books){
       try{
           File file = new File("Book.dat");
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(books);
           oos.close();
       }

       catch (IOException e){
           JOptionPane.showMessageDialog(null, "Problem saving file.");
           return;
       }

    }


    public static void OpenBooks() {
        try {
            File file = new File("Book.dat");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //ArrayList<Book> books = ois.readObject();
            ois.close();
        }

        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Problem opening book file.");
            return;
        }

        /*catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Book file not found.");
            return;
        }*/
    }



    public static void SaveCustomers(ArrayList<Customer> customers){
        try{
            File file = new File("Customer.dat");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.close();
        }

        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problem opening customer file.");
            return;

        }

    }

    public static void OpenCustomers(){
        try{
            File file = new File("Customer.dat");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //ArrayList<Customer> customers = ois.readObject();
            ois.close();
        }

        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problem opening customer file.");
            return;
        }

        /*catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Customer file not found.");
            return;
        }*/



    }

}

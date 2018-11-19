import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public abstract class LibraryMS {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(); //will only accept books in the array
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

    }

    public static void addCustomer(){

    }

    public static void addBook(){

    }

    /*public static void SaveBooks(ArrayList<Book> books){
        File file = new File("Book.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(books);
        oos.close();
    }

    public static void OpenBooks(){
        File file = new File("Book.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Book> books = ois.readObject();
        ois.close();
    }

    public static void SaveCustomers(ArrayList<Customer> customers){
        File file = new File("Customer.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(customers);
        oos.close();
    }

    public static void OpenCustomers(){
        File file = new File("Customer.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Customer> customers = ois.readObject();
        ois.close();
    }*/





}

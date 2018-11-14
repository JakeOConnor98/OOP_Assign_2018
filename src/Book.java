public class Book extends LibraryMS {

    private String title;
    private String author;
    private double price;
    private String isbn;
    private boolean reserve;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean getReserve() {
        return reserve;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public Book(){
        this("No Title", "No Author", 0.00, "No ISBN", true);

    }

    public Book(String title, String author, double price, String isbn, boolean reserve){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setIsbn(isbn);
        setReserve(reserve);
    }

    public String toString(){
        return "Title: " + getTitle() + "Author: " + getAuthor() +"\nPrice: " + getPrice() + "\nISBN: " + getIsbn() +
                "\nReserve: " + getReserve();
    }
}

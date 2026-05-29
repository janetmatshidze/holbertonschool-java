package exceptions;

public class Book {

    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price)
            throws InvalidBookException, InvalidAuthorException {

        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    // Setters with Validation
    // TITLE: at least 3 characters
    public void setTitle(String title) throws InvalidBookException {
        if(title == null || title.trim().length() < 3) {
            throw new InvalidBookException("Invalid book title")
        }
        this.title = title;
    }

    // AUTHOR: at least 2 names
     public void setAuthor(String author) throws InvalidAuthorException {
        if(author == null || author.trim().split("\\s+").length < 2) {
            throw new InvalidAuthorException("Invalid author name")
        }
        this.author = author;
    }
    
     // PRICE: must be > 0
     public void setPrice(double price) throws InvalidBookException {
        if(price <= 0 ) {
            throw new InvalidBookException("Invalid book price")
        }
        this.price = price;
    }


   //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice(){
        return price;
    }

}
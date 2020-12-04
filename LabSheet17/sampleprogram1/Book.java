package LabSheet17.sampleprogram1;

//Book.java

/**
 * An instantiable class which defines a Book. This one contains exception-handling code in some
 * of its mutators to prevent bad input
 * @author John Brosnan
 */

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private int ID;
    private static int count;

    /**
     * Book no-argument constructor. Calls the 4-argument Book constructor to initialise the
     * attributes of a Book object with some default initial values, to leave the Book
     * object in a consistent initial state
     */

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    /**
     * Book 4-argument constructor. Calls the 5 mutators and the incrementCount() method  to
     * initialise the attributes of a Book object with some user-supplied values. The Book ID is
     * set internally using the value of the count attribute, to ensure unique Book ID values.
     * @param title the title of the book
     * @param price the price of the book
     * @param ISBN the ISBN of the book
     * @param pages the number of pages in the book
     */

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
        incrementCount();
        setID(count);
    }

    /**
     * Method to increment the static count attribute of the class, this is to ensure that every
     * Book object will have a unique ID value, as it tracks the value of this attribute
     */

    private static void incrementCount() {
        count++;
    }

    /**
     * Method to get the value of the static count attribute
     * @return an integer value specifying the current value of the the count attribute
     */

    public static int getCount(){
        return count;
    }

    /**
     * Method to get the title of a Book object
     * @return a String value specifying the title of a Book object
     */

    public String getTitle() {
        return title;
    }

    /**
     * Method to get the ID of a Book object
     * @return an integer value specifying the ID of a Book object
     */

    public int getID() {
        return ID;
    }

    /**
     * Method to set the ID of a Book object
     * @param ID the ID number of the Book
     */

    private void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Method to set the title of a Book object
     * @param title the title of the Book
     * @throws IllegalArgumentException In the case of an invalid title
     */

    public void setTitle(String title) {

        if(title==null || title.equals(""))
            throw new IllegalArgumentException("The book title must be given some value\n");

        this.title = title;
    }

    /**
     * Method to get the price of a Book object
     * @return a double value specifying the price of a Book object
     */

    public double getPrice() {
        return price;
    }

    /**
     * Method to set the price of a Book object
     * @param price the price of the Book
     * @throws IllegalArgumentException In the case of an invalid price
     */

    public void setPrice(double price) {
        if(price<0)
            throw new IllegalArgumentException("The book price must be a positive number\n");

        this.price = price;
    }

    /**
     * Method to get the ISBN of a Book object
     * @return a String value specifying the ISBN of a Book object
     */

    public String getISBN() {
        return ISBN;
    }

    /**
     * Method to set the ISBN of a Book object
     * @param ISBN the ISBN of the Book
     * @throws IllegalArgumentException In the case of an invalid ISBN
     */

    public void setISBN(String ISBN) {
        if(!ISBN.equals("ISBN Not Available") && !ISBNValidator.isValidISBN(ISBN))
            throw new IllegalArgumentException("The book ISBN must be a proper ISBN value\n");

        this.ISBN = ISBN;
    }

    /**
     * Method to get the number of pages of a Book object
     * @return an integer value specifying the number of pages of a Book object
     */

    public int getPages() {
        return pages;
    }

    /**
     * Method to set the number of pages of a Book object
     * @param pages the number of pages in the Book
     * @throws IllegalArgumentException In the case of an invalid number of pages
     */

    public void setPages(int pages) {
        if(pages<0)
            throw new IllegalArgumentException("The number of pages in the book must be a positive number\n");

        this.pages = pages;
    }

    /**
     * Method to get the state of a Book object
     * @return a String value specifying the state of a Book object
     */

    public String toString() {
        return "Title: " + getTitle() + "  Price: " + getPrice() +
                "  ISBN: " + getISBN() + "  Number of Pages: " + getPages() +
                "  ID: " + getID();
    }
}

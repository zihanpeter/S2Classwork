/* in this assignment you will write a complete class
Please look at Plant.java as a model and copy the format
It is okay if you do not understand what you are doing deeply at this stage
 */

public class Book {
    /* todo: declare two instance variables a Book might have */
    private String name;
    private int numPages;

    /* todo: define one constructor */
    public Book(String name, int numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    /* todo: define an accessor and mutator method for both of your instance variables
    for a total of four methods
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public int getNumPages() {
        return numPages;
    }

    public String toString() {
        // todo: modify this line to initialise a string that contains the names and values of your instance variables
        String str = "Book name: " + name + ", Total pages: " + numPages;

        return str;
    }

    public static void main(String[] args) {
        Book book = new Book("Games Design", 200); // todo: modify this line so that the constructor call will compile
        System.out.println(book.name); // do you see your instance variable values printed?

        System.out.println(book.getName());
        System.out.println(book.getNumPages());

        System.out.println(book.toString());

        book.setName("Biology");
        book.setNumPages(300);

        System.out.println(book.getName());
        System.out.println(book.getNumPages());

        System.out.println(book.toString());
    }
}

//class BookContext
public class BookContext {
    //Declare Private Variable
    private BookState bookState;

    //Constructor
    public BookContext() {
        bookState = null;
    }

    //Getter of private variable
    public BookState getBookState() {
        return bookState;
    }

    //Setter of private variable
    public void setBookState(BookState bookState) {
        this.bookState = bookState;
    }
}

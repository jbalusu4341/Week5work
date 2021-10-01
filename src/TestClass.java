// Driver CLass
public class TestClass {
    //Main Method
    public static void main(String[] args) {
        // Objects of Classes
        BookContext book = new BookContext();
        OpenBookLibraryState open = new OpenBookLibraryState();
        CloseBookLibraryState close = new CloseBookLibraryState();

        open.bookState(book);
        //Print Statement
        System.out.println(book.getBookState().toString());
        System.out.println();

        close.bookState(book);
        //Print Statement
        System.out.println(book.getBookState().toString());
    }
}

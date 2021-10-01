//class CloseBookLibraryState that implements BookState
public class CloseBookLibraryState implements BookState {

    //Override the bookState method of interface BookState
    @Override
    public void bookState(BookContext bookContext) {
        System.out.println("Programming Books Shop is in....");
        bookContext.setBookState(this);
    }

    /*Override the toString method which
     returns the current state */
    @Override
    public String toString() {
        return "Close State";
    }
}

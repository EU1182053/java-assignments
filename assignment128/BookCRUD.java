package assignment128;

public class BookCRUD {

    Book bookArray[];
    public static int i = 0;

    public BookCRUD() {
        bookArray = new Book[5];
    }

    public BookCRUD(int size) {
        bookArray = new Book[size];
        System.out.println(bookArray.length);
    }

    public boolean addBook(Book book) {
        try {
            bookArray[i]=book;
            i++;
            System.out.println("book added till previous index of: "+i);
            return true;
         }
         catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
             System.out.println("Cannt add book");
             return false;
        }
    }

    public void display() {
        
        for (Book bk : bookArray)
            System.out.println(bk);
    }

    public Book searchBook(int bookId) {
        Book searchedBook = null;
        for (int j = 0; j < i; j++) {
            Book bk = bookArray[j];
            if (bk.getBookId() == bookId) {
                searchedBook = bk;
                break;
            }
        } // ended
        return searchedBook; // null will returned if no book found
    }

    public boolean updateBook(Book updatedbook) {
        boolean replaced = false;
        for (int j = 0; j < i; j++) {
            if (bookArray[j].getBookId() == updatedbook.getBookId()) {
                bookArray[j] = updatedbook;
                replaced = true;
                break;
            }
        }
        return replaced;
    }

    public boolean deleteBook(int bookId) {
        boolean deleted = false;
        for (int j = 0; j < i; j++) {
            Book bk = bookArray[j];
            if (bk != null && bk.getBookId() == bookId) {
                bookArray[j] = null;
                deleted = true;
            }
        } // ended
        return deleted;
    }
}

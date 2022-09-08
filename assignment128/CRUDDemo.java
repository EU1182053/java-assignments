package assignment128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CRUDDemo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        try {
            int size = sc.nextInt();
            BookCRUD crud = new BookCRUD(size);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int ch = 0;
            int id = 0;
            String name = "";
            double price = 0;

            do {
                System.out.println(
                        "1: ADD BOOK \n 2:UPDATE BOOK \n3: DELETE BOOK\n 4: SEARCH BOOK\n 5: DISPLAY BOOKS\n 6:BACK");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        if (BookCRUD.i == size)
                            System.out.println("Cant add Book. Array full");
                        else {
                            try {
                                System.out.println("Enter Book Id");

                                id = sc.nextInt();

                                try {
                                    System.out.println("Enter Book Name");
                                    name = br.readLine();

                                    try {
                                        System.out.println("Enter Book Price");
                                        price = sc.nextDouble();

                                        Book book = new Book(id, name, price); // Book Object created
                                        boolean b = crud.addBook(book);
                                        if (b)
                                            System.out.println("Book Added successfully...");
                                        else
                                            System.out.println("Book insertion failed...");
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.out.println("Enter a valid Price.");

                                    }
                                } catch (InputMismatchException e) {
                                    // TODO: handle exception
                                    System.out.println("Enter a valid Name.");

                                }
                            } catch (InputMismatchException im) {
                                System.out.println("Enter a valid Id. For eg.404, 987,etc.");
                            }
                            

                        }
                        break;
                    case 2:
                        System.out.println("Enter exisiting id of book which you want to update");
                        id = sc.nextInt();
                        Book searchedBook = crud.searchBook(id);
                        if (searchedBook != null) {
                            System.out.println("What u want to update 1: Name 2: Price 3: Both");
                            int ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:

                                    try {
                                        System.out.println("Enter new name");
                                        name = br.readLine();
                                        searchedBook.setBookName(name);

                                        /* Array not yet updated */
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.out.println("Enter a valid Name.");

                                    }
                                    break;
                                case 2:
                                    try {
                                        System.out.println("Enter new price");
                                        price = sc.nextDouble();
                                        searchedBook.setBookPrice(price);
                                        /* Array not yet updated */
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.out.println("Enter a valid Price.");

                                    }
                                case 3:
                                    try {
                                        System.out.println("Enter new name");
                                        name = br.readLine();
                                        try {
                                            System.out.println("Enter new price");
                                            price = sc.nextDouble();
                                            searchedBook.setBookName(name);
                                            searchedBook.setBookPrice(price);
                                            /* Array not yet updated */
                                        } catch (InputMismatchException e) {
                                            // TODO: handle exception
                                            System.out.println("Enter a valid Price.");

                                        }
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.out.println("Enter a valid Name.");

                                    }

                                default:
                                    System.out.println("Wrong choice");
                                    break;
                            }// end switch case
                            boolean update = crud.updateBook(searchedBook);
                            if (update)
                                System.out.println("Book updated Successfully..");
                            else
                                System.out.println("Book Updation failed...");
                        } // if ended
                        else {
                            System.out.println("Book not found to update");
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Enter existing id to delete the book");
                            id = sc.nextInt();
                            boolean delete = crud.deleteBook(id);
                            if (delete)
                                System.out.println("Book deleted Successfully..");
                            else
                                System.out.println("Book Deletion failed...");
                            break;
                        } catch (InputMismatchException e) {
                            // TODO: handle exception
                            System.out.println("Enter a valid Id. For eg.404, 987,etc.");
                        }
                    case 4:
                        try {
                            System.out.println("Enter id to search book");
                            id = sc.nextInt();
                            searchedBook = crud.searchBook(id);
                            if (searchedBook != null)
                                System.out.println(searchedBook);
                            else
                                System.out.println("Book Not Found");
                            break;
                        } catch (Exception e) {
                            // TODO: handle exception
                            System.out.println("Enter a valid Id. For eg.404, 987,etc.");

                        }
                    case 5:
                        crud.display();
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
            } while (ch != 6);
        } catch (NegativeArraySizeException e) {
            // TODO: handle exception
            System.out.println("Can't create array of negative size.");

        }

    }

}

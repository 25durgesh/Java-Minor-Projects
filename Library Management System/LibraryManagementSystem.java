import java.util.*;

// Book Class
class Book {
    int id;
    String name;
    String author;
    boolean isIssued;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }

    public void display() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Author: " + author +
                " | Issued: " + (isIssued ? "Yes" : "No"));
    }
}

// Library Class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    public void searchBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            try {
                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Search Book");
                System.out.println("4. Issue Book");
                System.out.println("5. Return Book");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();

                        library.addBook(new Book(id, name, author));
                        break;

                    case 2:
                        library.viewBooks();
                        break;

                    case 3:
                        System.out.print("Enter Book ID to search: ");
                        int searchId = sc.nextInt();
                        library.searchBook(searchId);
                        break;

                    case 4:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();
                        library.issueBook(issueId);
                        break;

                    case 5:
                        System.out.print("Enter Book ID to return: ");
                        int returnId = sc.nextInt();
                        library.returnBook(returnId);
                        break;

                    case 6:
                        System.out.println("Thank you.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter valid input.");
                sc.nextLine();
            }
        }
    }
}
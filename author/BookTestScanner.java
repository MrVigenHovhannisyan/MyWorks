package author;

import java.util.Scanner;

public class BookTestScanner {


    private static Scanner scanner = new Scanner(System.in);
    private static DynamicArray dy = new DynamicArray();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    isRun = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    addAuthor();
                    break;
                case 3:
                    searchBookByName();
                    break;
                case 4:
                    searchAuthorByName();
                    break;
                case 5:
                    getEmailByAuthorName();
                    break;
                case 6:
                    getBookByCount();
                    break;
                case 7:
                    deleteAuthorByName();
                    break;
                case 8:
                    getBookByPrice();
                    break;
                default:
                    System.out.println("Wrong Command ");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Please Press 0 for Exit ");
        System.out.println("Please press 1 for add Book ");
        System.out.println("Please press 2 for add Author ");
        System.out.println("Please press 3 for search Book ");
        System.out.println("Please press 4 for search Author ");
        System.out.println("Please press 5 for get Author Email ");
        System.out.println("Please press 6 for Search book By Count");
        System.out.println("Please press 7 for Delete Author ");
        System.out.println("Please press 8 for Search Book By Price ");

    }


    private static void addAuthor() {
        System.out.println("Please write Author's name, email,gender");
        String authorData = scanner.nextLine();
        String[] authorDataArr = authorData.split(",");
        Author author = new Author(authorDataArr[0], authorDataArr[1], authorDataArr[2]);
        System.out.println("Thank you Author is Added ");
        dy.add(author);
    }

    public static void addBook() {
        System.out.println("Please write Book's   name , price , count,authorName,currency ");
        String bookData = scanner.nextLine();
        String[] bookDataArr = bookData.split(",");

        double price = Double.parseDouble(bookDataArr[1]);
        int count = Integer.parseInt(bookDataArr[2]);

        Author authorByName = dy.getAuthorByName(bookDataArr[3]);
        Book book = new Book(bookDataArr[0], price, count, authorByName, bookDataArr[4]);
        System.out.println("Thank you Book is Added ");
        dy.add(book);
    }

    private static void searchBookByName() {
        System.out.println("Please Write Book Name for search");
        String bookName = scanner.nextLine();
        Book book1 = dy.getBookByName(bookName);
        if (book1 == null) {
            System.out.println("no Book By " + bookName);
        } else {
            System.out.println(book1);
        }
    }

    public static void searchAuthorByName() {
        System.out.println("Please input Author name");
        String authorName = scanner.nextLine();
        Author author1 = dy.getAuthorByName(authorName);
        if (author1 == null) {
            System.out.println("no Author by " + authorName);
        } else {
            System.out.println(author1);
        }
    }

    public static void getEmailByAuthorName() {
        System.out.println("Please input Author Name ");
        String email = scanner.nextLine();
        String author = dy.getEmailByAuthorName(email);
        System.out.println(author);


    }

    public static void getBookByCount() {
        System.out.println("Please input Count for search Book");
        int count = Integer.parseInt(scanner.nextLine());
        dy.getBookByCount(count);

    }

    public static void deleteAuthorByName() {
        System.out.println("Please Write Author Name for delete ");
        String authorName = scanner.nextLine();
        System.out.println("Thank you Author full Deleted");
        dy.deleteAuthorByName(authorName);


    }

    public static void getBookByPrice() {
        System.out.println("Please input MinPrice and MaxPrice ");
        String priceData = scanner.nextLine();
        String[] priceDataArr = priceData.split("-");
        double price = Double.parseDouble(priceDataArr[0]);
        double price1 = Double.parseDouble(priceDataArr[1]);
        dy.getBookByPrice(price, price1);
    }
    }



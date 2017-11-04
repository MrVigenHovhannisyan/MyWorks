package author;

public class DynamicArray {
    private Book[] bookarray = new Book[16];
    private Author[] authorArray = new Author[16];
    private int bookSize = 0;
    private int authorSize = 0;

    public void add(Book value) {
        if (bookSize == bookarray.length) {
            extendBook();

        }
        bookarray[bookSize] = value;
        bookSize++;
    }

    public void add(Author value) {
        if (authorSize == authorArray.length) {
            extendAuthor();

        }
        authorArray[authorSize] = value;
        authorSize++;
    }

    public void extendBook() {
        Book[] book = new Book[bookarray.length + 10];
        for (int i = 0; i < bookarray.length; i++) {
            book[i] = bookarray[i];

        }
        bookarray = book;
    }

    public void extendAuthor() {
        Author[] author = new Author[authorArray.length + 10];
        for (int i = 0; i < authorArray.length; i++) {
            author[i] = authorArray[i];

        }
        authorArray = author;
    }

    public Book getBookByName(String bookName) {
        for (int i = 0; i < bookSize; i++) {
            if (bookarray[i].getName().equals(bookName)) {
                return bookarray[i];
            }
        }
        return null;
    }

    public Author getAuthorByName(String authorName) {
        for (int i = 0; i < authorSize; i++) {
            if (authorArray[i].getName().equals(authorName)) {
                return authorArray[i];
            }
        }
        return null;
    }

    public void printBooks() {
        for (int i = 0; i < bookSize; i++) {
            System.out.println(bookarray[i]);

        }
    }

    public void printAuthors() {
        for (int i = 0; i < authorSize; i++) {
            System.out.println(authorArray[i]);

        }
    }

    public String getEmailByAuthorName(String name) {
        for (int i = 0; i < authorSize; i++) {
            if (authorArray[i].getName().equals(name))
                System.out.println(authorArray[i]);
            return String.valueOf(authorArray[i].getEmail());
        }
        return null;
    }

    //
//    public void printBookByFemaleAuthors() {
//        for (int i = 0; i < bookSize; i++) {
//            if (bookarray[i].getAuthor().getGender().equalsIgnoreCase("female")) {
//                System.out.println(bookarray[i]+" ");
//            return;
//            }
//        }
//    }
    public void getBookByCount(int count) {
        for (int i = 0; i < bookSize; i++) {
            if (bookarray[i].getCount() >= count) {
                System.out.println(bookarray[i]);

            }

        }
    }

    public void deleteAuthorByName(String name) {
     int temp = 0;
        for (int i = 0; i <authorSize ; i++) {
            if (authorArray[i].getName().equals(name)) {
                temp = i;
                break;
            }
        }
                if(temp>=0&&temp<authorSize){
                    for (int j = temp; j <authorSize ; j++) {
                        authorArray[j]=authorArray[j+1];
                        authorSize--;

                    }
                }else{
                    System.out.println("null");
                }

            }

    public void getBookByPrice(double min,double max) {
        if(min>max){
            getBookByPrice(max,max);
            return;
        }else {
            for (int i = 0; i <bookSize ; i++) {
                if((bookarray[i].getPrice()>=min)&&(bookarray[i].getPrice()<=max)){
                    System.out.println(bookarray[i]+" ");
                }

            }
        }
    }

}




















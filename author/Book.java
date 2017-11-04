package author;

public class Book {
    private String name;
    private double price;
    private int count;
    private Author author;
    private String currency;

    public Book(String name, double price, int count, Author author) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.author = author;
    }


    public Book(String name, double price, int count, Author author, String currency) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.author = author;
        this.currency = currency;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getUrrency() {
        return currency;
    }

    public void setUrrency(String urrency) {
        this.currency = urrency;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", Author=" + author +
                ", urrency='" + currency + '\'' +
                '}';
    }
}

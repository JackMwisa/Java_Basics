package Day7;

public class Book {
    String title;
    String author;
    String isbn;


    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString(){
        return title + "by " + author + "()ISBN: " + isbn;
    }


}

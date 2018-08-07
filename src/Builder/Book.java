package Builder;

import Observer.Bookworm;
import Observer.Lector;
import Singleton.TheOnlyAuthor;

import java.util.List;

public class Book {
    private String genre;
    private String title;
    private String pagesCount;
    private String publisher;
    private String price;
    private TheOnlyAuthor author;
    private List<String> chaptersList;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(String pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public TheOnlyAuthor getAuthor() {
        return author;
    }

    public void setAuthor(TheOnlyAuthor author) {
        this.author = author;
    }

    public void read(){
        Lector lector = new Lector();
        Bookworm bookwormAnn = new Bookworm("Ann Booklover");
        Bookworm bookwormRobert= new Bookworm("Rober Readingfreak");

        lector.register(bookwormAnn);
        lector.register(bookwormRobert);

        bookwormAnn.setReadingPerson(lector);
        bookwormRobert.setReadingPerson(lector);

        for (String chapter : this.chaptersList){
            lector.readAloud(chapter);
        }
    }

    public List<String> getChaptersList() {
        return chaptersList;
    }

    public void setChaptersList(List<String> chaptersList) {
        this.chaptersList = chaptersList;
    }
}

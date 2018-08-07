package Builder;

import Singleton.TheOnlyAuthor;

import java.util.List;

public class BookBuilderIm implements BookBuilder {
    private Book book = new Book();

    @Override
    public Book build() {
       return book;
    }

    @Override
    public BookBuilder setGenre(String genre) {
        book.setGenre(genre);
        return this;
    }

    @Override
    public BookBuilder setTitle(String title) {
        book.setTitle(title);
        return this;
    }

    @Override
    public BookBuilder setPagesCount(String pagesCount) {
        book.setPagesCount(pagesCount);
        return this;
    }

    @Override
    public BookBuilder setPublisher(String publisher) {
        book.setPublisher(publisher);
        return this;
    }

    @Override
    public BookBuilder setPrice(String price) {
        book.setPrice(price);
        return this;
    }

    @Override
    public BookBuilder setAuthor(TheOnlyAuthor author) {
        book.setAuthor(author);
        return this;
    }

    @Override
    public BookBuilder setChaptersList(List<String> chaptersList) {
        book.setChaptersList(chaptersList);
        return this;
    }
}

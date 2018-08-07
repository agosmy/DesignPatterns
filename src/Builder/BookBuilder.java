package Builder;

import Singleton.TheOnlyAuthor;

import java.util.List;

public interface BookBuilder {
    Builder.Book build();

    BookBuilder setGenre(String genre);
    BookBuilder setTitle(String title);
    BookBuilder setPagesCount(String pagesCount);
    BookBuilder setPublisher(String publisher);
    BookBuilder setPrice(String price);
    BookBuilder setAuthor(TheOnlyAuthor author);
    BookBuilder setChaptersList(List<String> chaptersList);
}

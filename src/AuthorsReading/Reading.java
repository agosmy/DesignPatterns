package AuthorsReading;

import Builder.Book;
import Builder.BookBuilder;
import Builder.BookBuilderIm;
import Singleton.TheOnlyAuthor;
import Strategy.ReadersReaction;
import Strategy.RomanceRection;

import java.util.ArrayList;
import java.util.List;

public class Reading {

    public static void main(String[] args) {
        TheOnlyAuthor greatWriter = TheOnlyAuthor.getTheOnlyAuthor();
        List<String> chaptersToBeReadToday = new ArrayList<>();
        ReadersReaction reaction = new ReadersReaction();

        for (int i =0; i<3; i++){
            chaptersToBeReadToday.add("Chapter " + i);
        }

        BookBuilder builder = new BookBuilderIm();
        builder.setAuthor(greatWriter);
        builder.setGenre("Comedy");
        builder.setPagesCount("300");
        builder.setPrice("100 $");
        builder.setPublisher("The Great Publishing House");
        builder.setTitle("The Greatest Book");
        builder.setChaptersList(chaptersToBeReadToday);

        Book firstBook = builder.build();
        firstBook.read();

        if (firstBook.getGenre().equals("Comedy")){
            reaction.set(new RomanceRection());
        }

        reaction.react();
    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

public class Lector implements ReadingPerson {

    private List<ListeningPerson> listeners;
    private String chapterRead;

    public Lector(){
        this.listeners = new ArrayList<>();
    }

    @Override
    public void register(ListeningPerson lp) {
        if(!listeners.contains(lp)) listeners.add(lp);
    }

    @Override
    public void unregister(ListeningPerson lp) {
        listeners.remove(lp);
    }

    @Override
    public void startReading() {
        for(ListeningPerson listeningPerson : listeners) {
            listeningPerson.listen();
        }
    }

    @Override
    public Object readAChapter(ListeningPerson lp) {
        return chapterRead;
    }

    public void setChapterRead(String chapterRead){
        this.chapterRead = chapterRead;
    }

    public void readAloud(String chapter){
        this.chapterRead = chapter;
        System.out.println("Reading " + chapter + "...");
        startReading();
    }
}

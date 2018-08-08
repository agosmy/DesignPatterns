package Observer;

public interface ReadingPerson {

    void register(ListeningPerson lp);
    void unregister(ListeningPerson lp);

    void startReading();
}

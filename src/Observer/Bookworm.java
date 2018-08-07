package Observer;

public class Bookworm implements ListeningPerson {
    private String name;
    private ReadingPerson reader;

    public Bookworm(String name){
        this.name = name;
    }

    @Override
    public void listen() {
        String chapter = (String)reader.readAChapter(this);
        if (chapter == null) System.out.println("Why is it so quiet? Read!");
        else System.out.println("Listening carefully to " + chapter);
    }

    @Override
    public void setReadingPerson(ReadingPerson rp) {
        this.reader = rp;
    }
}

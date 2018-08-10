package Strategy;

public class ReadersReaction {

    private ReactionStrategy strategy;

    public ReadersReaction(){
        strategy = new ComedyReaction();
    }

    public void set(ReactionStrategy strategy){
        this.strategy = strategy;
    }

    public void react(){
        strategy.react();
    }
}

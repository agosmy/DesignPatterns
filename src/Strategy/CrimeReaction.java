package Strategy;

public class CrimeReaction implements ReactionStrategy {

    @Override
    public void react() {
        System.out.println("That's so scary!");
    }
}

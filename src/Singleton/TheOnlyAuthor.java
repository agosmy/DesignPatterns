package Singleton;

public class TheOnlyAuthor {
    private String name = "Great Writer";

    private TheOnlyAuthor(){ }

    //eager version
    //private static TheOnlyAuthor instance = new TheOnlyAuthor();

    //public static TheOnlyAuthor getTheOnlyAuthor(){
    //    return instance;
    //}

    //lazy version
    private static TheOnlyAuthor instance = null;

    public static TheOnlyAuthor getTheOnlyAuthor(){
        if (instance != null)
            return instance;
        return new TheOnlyAuthor();
    }

    public String getName() {
        return name;
    }
}



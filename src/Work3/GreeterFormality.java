package Work3;

public abstract class GreeterFormality {
    protected String greet(String formality) {
        return switch (formality) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            default -> "Hello.";
        };
    }
}

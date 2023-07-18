package Work3;

public class Greeter extends GreeterFormality {
    private String formality;

    public Greeter(String formality) {
        this.formality = greet(formality);
    }

    public String getFormality() {
        return formality;
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    @Override
    public String toString() {
        return formality;
    }
}


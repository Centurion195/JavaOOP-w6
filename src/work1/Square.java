package work1;

// Квадрат
public class Square implements Figure {
    int length;

    public Square(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}

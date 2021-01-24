package inheritance;

// Przykład złego użycia polimorfizmu , tak nie dziedziczymy
class Square extends Rectangle{
    public Square(int sideA, int sideB) {
        super(sideA, sideB);
    }
}


public class Rectangle {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}

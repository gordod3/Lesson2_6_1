public class Box<A extends Number> {
    A numberl;
    A number2;

    public Box(A numberl, A number2) {
        this.numberl = numberl;
        this.number2 = number2;
    }

    public A getNumberl() {
        return numberl;
    }

    public A getNumber2() {
        return number2;
    }
}

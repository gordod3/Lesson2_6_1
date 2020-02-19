public class Main {

    public static void main(String[] args) {
        Double a = 4.3;
        Integer b = 3;
        Float c = 2.1F, d = 4.2F;
        Box<Number> box1 = new Box<>(a, b);
        Box<Float> box2 = new Box<>(c, d);
    }

    private static void addition(Box<? extends Number> box1, Box<? extends Number> box2){
        System.out.println((Double)box1.getNumberl() + (Double)box1.getNumber2() + (Double)box2.getNumberl() + (Double)box2.getNumber2());
    }
    private static void multiplication(Box<? extends Number> box1, Box<? extends Number> box2){
        System.out.println((Double)box1.getNumberl() * (Double)box1.getNumber2() * (Double)box2.getNumberl() * (Double)box2.getNumber2());
    }

}

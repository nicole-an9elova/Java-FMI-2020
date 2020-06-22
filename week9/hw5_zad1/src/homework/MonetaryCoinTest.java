package homework;

public class MonetaryCoinTest {

    public static void main(String[] args) {

	    MonetaryCoin coin1 = new MonetaryCoin(Face.HEAD, 25);
	    MonetaryCoin coin2 = new MonetaryCoin(Face.TAIL,  50);
	    MonetaryCoin coin3 = new MonetaryCoin(Face.TAIL,  100);
	    MonetaryCoin coin4 = new MonetaryCoin(Face.TAIL,  5);

	    int sum = coin1.getValue() + coin2.getValue() + coin3.getValue() + coin4.getValue();
	    System.out.printf("%s: %d", "Sum of values", sum);

	    //demonstration that a monetary coin inherits the flip method of class Coin
        System.out.print(coin2);
        coin2.flip();
        System.out.print(coin2);
        coin2.flip();
        System.out.print(coin2);
        coin2.flip();
        System.out.print(coin2);
    }
}

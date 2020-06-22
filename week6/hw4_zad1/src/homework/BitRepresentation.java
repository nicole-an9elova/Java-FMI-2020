package homework;

public class BitRepresentation {
    public static String display(int value) {
        String text = "";
        int displayMask = 1 << 7;
        for (int bit = 1; bit <= 8; bit++) {
            text += ((value & displayMask) == 0 ? "0" : "1");
            value <<= 1;
        }
        return text;
    }

    public static void compare(String text1, String text2){
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int count = 0;

        for(int bit = 0; bit < 8; bit++){
            if(t1[bit] != t2[bit]){
                count++;
            }
        }
        System.out.printf("Hamming distance: %d", count);

    }
}

package providers;

import services.Cipherable;

import java.util.Random;

public class Wrapper {
    private int size;

    public Wrapper() {
        this.size = 1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size > 0 ? size: 1;
    }

    class FixedRandom implements Cipherable {

        @Override
        public char[] getSecretChars(int seed) {
            char[] result = new char[size];
            Random random = new Random(seed);

            for(int i = 0; i < size; i++){
                int ascii = 65 + random.nextInt(26);
                char symbols = (char) ascii;
                result[i] = symbols;
            }
            return result;
        }
    }

    class FixedSelection implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            char[] result = new char[size];
            char[] alphabet = new char[seed];

            Random random = new Random();
            for(int i = 0; i < seed; i++){
                int ascii = 65 + random.nextInt(26);
                char symbols = (char)ascii;
                alphabet[i] = symbols;
            }
            for(int i = 0; i < size; i++){
                int index = 0 + random.nextInt(seed - 1);
                result[i] = alphabet[index];
            }
            return result;
        }
    }

    public Cipherable makeFixedSelection(){
        return new FixedSelection();
    }
    public Cipherable makeFixedRandom(){
        return new FixedRandom();
    }

}

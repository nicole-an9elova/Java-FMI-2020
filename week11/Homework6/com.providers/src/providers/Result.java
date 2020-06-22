package providers;

import java.util.Arrays;

public class Result {
    private char[] chars;
    private int data;

    public Result() {
        this.chars = new char[]{'A'};
        this.data = 0;
    }

    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    public char[] getChars() {
        char[] copy = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            copy[i] = chars[i];
        }
        return copy;
    }

    public void setChars(char[] chars) {
        if(chars != null && chars.length > 0){
            this.chars = new char[chars.length];
            for(int i = 0; i < chars.length; i++){
                this.chars[i] = chars[i];
            }
        }else{
            this.chars = new char[]{'A'};
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data > 0 ? data: 0;
    }

    @Override
    public String toString(){
        return "Chars: " + Arrays.toString(getChars()) + "\n" + String.format("%s: %d", "Result", getData());

    }

}

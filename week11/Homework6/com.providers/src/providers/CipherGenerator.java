package providers;

import services.Cipherable;

import java.util.Arrays;

public class CipherGenerator {
    public static Result countDistinct(Cipherable cipher, int seed) {

        char[] chars = cipher.getSecretChars(seed);

        int data = 0;
        Result result = new Result(chars, data);
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            data = 0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j)
                    data++;
            }
            if(data==0) {
                count++;
            }
        }

        result.setData(count);
        return result;
    }
}

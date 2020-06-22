package homework;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .mapToObj(Integer::toString)
                .reduce((x, y ) -> x + "#" + y)
                .ifPresent(System.out::println);

        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            list.add(rand.nextInt(31));
        }
        System.out.println("Printing the stream:");
        list.stream().forEach(System.out::println);

        Predicate<Integer> predicate1 = p -> p % 5 == 0;
        Predicate<Integer> predicate2 = p -> p < 15;
        Predicate<Integer> predicate3 = p -> p > list.stream().mapToInt(val -> val).average().orElse(0);

        System.out.println("Is there a number in the stream which can be divided by 5?");
        if(list.stream().filter(predicate1).count() > 0){
            System.out.printf("Yes, there is such a number, actually they are: %d. \n", list.stream().filter(predicate1).count());
        }else{
            System.out.println("No, there is not such a number.");
        }
        System.out.println();
        System.out.println("Are all numbers smaller than 15?");
        if(list.stream().filter(predicate2).count() == 20){
            System.out.println("Yes, they are.\n");
        }else{
            System.out.printf("No, they aren't. Only %d are smaller.\n",
                    list.stream().filter(predicate2).count());
        }
        System.out.println();
        System.out.println("Is the count of the numbers bigger than the average of the stream, more than 5?");
        if(list.stream().filter(predicate3).count() > 5){
            System.out.println("Yes, it is.");
        }else{
            System.out.println("No, it isn't.");
        }
    }
}

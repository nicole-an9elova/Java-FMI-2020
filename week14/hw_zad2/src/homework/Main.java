package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aBc");
        list.add("d");
        list.add("ef");
        list.add("123456");
        Stream<String> stream = list.stream();
        List<String> sortedList = stream.map(String::toUpperCase).sorted().collect(Collectors.toList());
        //printing 1st option
        for(int i = 0; i < sortedList.size(); i++){
            System.out.println(sortedList.get(i));
        }
        //printing 2nd option
        System.out.println(sortedList);
        //printing 3rd option
        sortedList.forEach(System.out::println);
    }
}

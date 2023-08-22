package code.test.august;

import java.util.ArrayList;
import java.util.List;
public class LamdaTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");

        list.forEach(x -> System.out.println(x));
    }
}

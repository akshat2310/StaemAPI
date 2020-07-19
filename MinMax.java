import java.util.Comparator;
import java.util.stream.*;

public class MinMax {
    public static void main(String args[]) {

        //getting max number
        Integer maxnum = Stream.of(10, 13, 4, 9, 2, 100)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        //getting min number
        Integer minnum = Stream.of(10, 13, 4, 9, 2, 100)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("Max number is: " + maxnum);
        System.out.println("Min number is: " + minnum);
    }
}

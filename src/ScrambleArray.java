import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScrambleArray {
    public static void main(String[] args) {
        Integer [] sortedArray = {7,13,13,18,29,33};
        List<Integer> arrayAsList = Arrays.asList(sortedArray);
        Collections.shuffle(arrayAsList);
        for (Integer integer : arrayAsList) {
            System.out.println(integer);
        }
    }

}



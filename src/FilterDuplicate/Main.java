package FilterDuplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[]data = {7,6,4,3,3,9,4,9,7,4,6};

        filterDuplicates(data); //[7, 6, 4, 3, 9]
    }

    public static int[] filterDuplicates(int[] data){
        Set<Integer> set = new LinkedHashSet<>(); //Set do not allow duplicates
        for (int i = 0; i< data.length; i++) {
            set.add(data[i]); //add elements into Set
        }
        int[]intArray = set.stream()
                .mapToInt(Integer::intValue)
                .toArray(); //convert Set into int[];
        System.out.println(Arrays.toString(intArray)); //to see the elements we need to use Arrays.toString(arr)

        return intArray;
    }
}

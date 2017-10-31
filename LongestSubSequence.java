import java.io.*;
import java.util.*;

public class LongestSubSequence {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        List<Integer> list = new ArrayList<>(n);
        list.add(arr[0]);
        int len = 1;
        int index;
        for (int i=0; i<n; i++) {
            if (arr[i] > list.get(len-1)) {
                list.add(arr[i]);
                len++;
            }else {
                index = Collections.binarySearch(list, arr[i]);
                if (index < 0) {
                    index += 1;
                    index *= -1;
                    list.set(index, arr[i]);
                }
            }
        }
        System.out.println(len);
        scn.close();
    }
}
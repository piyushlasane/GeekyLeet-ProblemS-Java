import java.util.*;
    public class RelativeSortArray {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < arr2.length; i++) {
                for(int j = 0; j < arr1.length; j++) {
                    if(arr1[j] == arr2[i]) {
                        res.add(arr1[j]);
                        arr1[j] = -1;
                    }
                }
            }
            Arrays.sort(arr1);
            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != -1) res.add(arr1[i]);
            }
            int[] resultArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resultArray[i] = res.get(i);
            }
            return resultArray;
        }
        public static void main(String[] args) {
            RelativeSortArray solution = new RelativeSortArray();
            
            int[] arr1_example1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
            int[] arr2_example1 = {2, 1, 4, 3, 9, 6};
            int[] result_example1 = solution.relativeSortArray(arr1_example1, arr2_example1);
            System.out.println(Arrays.toString(result_example1)); // Output: [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]
            
            int[] arr1_example2 = {28, 6, 22, 8, 44, 17};
            int[] arr2_example2 = {22, 28, 8, 6};
            int[] result_example2 = solution.relativeSortArray(arr1_example2, arr2_example2);
            System.out.println(Arrays.toString(result_example2)); // Output: [22, 28, 8, 6, 17, 44]
        }
    }
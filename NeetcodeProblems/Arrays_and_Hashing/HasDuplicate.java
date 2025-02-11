package NeetcodeProblems.Arrays_and_Hashing;

import java.util.HashSet;

public class HasDuplicate {
    public static boolean HasDuplicates(int arr[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,5,3,1,2};
        System.out.println(HasDuplicates(arr));
    }
}

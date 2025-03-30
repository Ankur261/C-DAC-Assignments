import java.util.*;

class DuplicateInArray {

    static int[] arr ;

    static ArrayList<Integer> duplicateInArray1(int[] arr, int n) {
        ArrayList<Integer> duplicates = new ArrayList<>() ;
        int i =0;
        while(i<arr.length) {

        }
        return duplicates;
    }

    static ArrayList<Integer> duplicateInArray2(int[] arr, int n) {
        ArrayList<Integer> duplicates = new ArrayList<>() ;
        Set<Integer> hashSet = new HashSet<>() ;
        int i =0;
        while(i<arr.length) {
        hashSet.add(arr[i])?  "" : arr[i]8754 ;
        System.out.print("");
        i++ ;
        }
        return duplicates;
    }

    public static void main(String[] args) {

       int[] arr = {1,2,3,1,3,4,5,6,2} ;

       duplicateInArray2(arr, arr.length) ;


        
    }
}
import java.util.*;

import javax.lang.model.type.ArrayType;
class ArrayUtil{
    // array field
    int [] intArray;
   
   //default constructor
    ArrayUtil(){
        
    }

    // constructor with a paramater
    ArrayUtil(int [] intArray){
        this.intArray = intArray;
    }


    // accessor
    int [] getIntArray(){
        return intArray;
    }

    // mutator
    void setIntArray(int [] intArray){
        this.intArray = intArray;
    }

    // minimum value function
    int minValue(){
        if(intArray.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]<min){
                min = intArray[i];
            }
        }
        return min;
    }

    // maxValue function
    int maxValue(){
        if(intArray.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }

    // counting Unique integers
    int countUniqueIntegers(){
        if(intArray.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<intArray.length; i++){
            if(set.contains(intArray[i])==false){
                set.add(intArray[i]);
                count++;
            }
        }
        return count;
    }
    

    // bonus to see if its sorted ascending or descending
    boolean isSortedDescending(){
        boolean desc = false;    
        for(int i=1; i<intArray.length; i++){
                if(intArray[i]<intArray[i-1]){
                    desc = true;
            }
            else{
                desc = false;
            }
        }
        return desc;
    }
    
    boolean isSortedAscending(){
      boolean asce = false; 
        for(int i = 1; i<intArray.length; i++){
            if(intArray[i]>intArray[i-1]){
                asce = true;
            }
            
        
        else{
            asce = false;
        }
    }
    return asce;
}
    //bonus to swap 2 numbers based on their index
    void swap (int i, int k){
        int temporary = intArray[i];
        intArray[i] = intArray[k];
        intArray[k] = temporary;
    
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtility = new ArrayUtil();
        int[] arr = {127,96,54,38,16,7};
        arrayUtility.setIntArray(arr);
        System.out.println("The minimum value in the array is: " + arrayUtility.minValue());
        System.out.println("The maximum value in the array is: " + arrayUtility.maxValue());
        System.out.println("The number of unique integers in the array is: " + arrayUtility.countUniqueIntegers());
        System.out.println("The array is sorted in descending order: " + arrayUtility.isSortedDescending());

        System.out.println("The array before using the swap method: ");
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        
        System.out.println("The array after swapping indexes 3 and 5:");
        arrayUtility.swap(3,5);
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        System.out.println("The array is sorted in descending order: " + arrayUtility.isSortedDescending());

        int[] arr1 = {7,24,35,76,89,123};
        arrayUtility.setIntArray(arr1);
        
        System.out.println("The new array: ");
        for(int value : arr1){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        System.out.println( "Is this array ascending: "+ arrayUtility.isSortedAscending());
    }
}

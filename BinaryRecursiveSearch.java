

public class BinaryRecursiveSearch implements Practice2Search {


    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    @Override
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }


    public int binarySearch(int[] arr, int target, int lower, int upper){

        int middle = lower + ((upper - lower)/2);

        if(upper < lower){
            return -1;
        }

        if(arr[middle] == target){
            return middle;
        }

        if(target < arr[middle]){
            return binarySearch(arr, target, lower, middle - 1);
        } else {
            return binarySearch(arr, target, lower, middle + 1);
        }

    }



}

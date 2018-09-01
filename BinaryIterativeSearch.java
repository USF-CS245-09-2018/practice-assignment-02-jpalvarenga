

public class BinaryIterativeSearch implements Practice2Search {


    @Override
    public String searchName() {
        return "Binary Iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {

        int middle;

        int lower = 0;
        int upper = arr.length;


        while(upper > lower){

            // Create middle
            middle = lower + ((upper - lower)/2);

            if(arr[middle] != target){

                if(target > arr[middle]){
                    lower = arr[middle]+1;
                }

                else if(target < arr[middle]){
                    upper = arr[middle]-1;
                }

            }else{
                return arr[middle];
            }

        }
        return -1;
    }



}

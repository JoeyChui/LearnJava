

public class BinarySearch {
    public static void main(String[] args){
    }

    public static int binarySearch(int array[], int goal){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = (low + high)/2;
            if(array[middle] = goal){
                return middle;
            }
        }
    }
}

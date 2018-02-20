

public class BinarySearch {
    public static void main(String[] args){
        int[] array = {1, 21, 30, 32, 43, 51, 62};
        System.out.println(binarySearch(array, 30));
        System.out.println(binarySearch1(array, 0, array.length - 1, 1));
    }

    private static int binarySearch(int array[], int goal){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = (low + high)/2;
            if(array[middle] == goal){
                return middle;
            }else if(array[middle] > goal){
                high = middle -1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }
//fdghf
    private static int binarySearch1(int[] array, int low, int high, int goal){
        int middle = (low + high)/2;
        while(low <= high){
            if(goal == array[middle]){
                return middle;
            }else if(goal < array[middle]){
                return binarySearch1(array, low, middle - 1, goal);
            }else if(goal > array[middle]){
                return binarySearch1(array, middle + 1, high, goal);
            }
        }
        return -1;
    }
}

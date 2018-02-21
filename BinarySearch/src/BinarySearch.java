import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        int[] array = {1, 21, 3, 32, 43, 51,62};
        Arrays.sort(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
        /*
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }*/
    }
}
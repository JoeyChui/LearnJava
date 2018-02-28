public class ArraySearch {
    public static void main(String[] args){

    }

    private class Solution{
        public boolean Find(int[][] array, int target){
            for(int i = 0; i < array.length; i++){
                int low = 0;
                int high = array[i].length - 1;

                while (low <= high){
                    int mid = (low + high) / 2;
                    if(target > array[i][mid])
                        low = mid + 1;
                    else if(target < array[i][mid])
                        high = mid - 1;
                    else
                        return true;
                }
            }
            return false;
        }
    }

    public class Solution1 {
        public boolean Find(int [][] array,int target) {
            int len = array.length - 1;
            int i = 0;
            while((len >= 0) && (i < array[0].length)){
                if(array[len][i] > target){
                    len--;
                }else if(array[len][i] < target){i++;
                }else{
                    return true;
                }
            }
            return false;
        }

    }

}


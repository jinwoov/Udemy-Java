public class ArrayBinarySearch {
    public static void main(String[] arg) {
        int[] intArr = {1, 2, 3, 4, 5};
        int result = BinarySearch(intArr, 4);
        System.out.print(result);
    }

    public static int BinarySearch(int[] array, int searchValue){
        int start = 0;
        int finish = array.length - 1;

        while (start <= finish)
        {
            int index = (finish + start)/2;

            if(array[index] == searchValue)
            {
                return index;
            }
            if(searchValue < array[index]){
                finish = index - 1;
            }
            else{
                start = index + 1;
            }
        }
        return -1;
    }
}

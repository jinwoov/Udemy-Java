public class ArrayShift {
    public static void main(String[] args){
        int[] number = {1, 2, 4, 5};
        int[] result = Addnumber(number, 3);

        for (int num: result
             ) {
            System.out.println(num);
        }
    }

    public static int[] Addnumber(int[] intArr, int numberToAdd){
        int[] intNewArr = new int[intArr.length + 1];
        int middleI = intArr.length / 2;
        int j = 0;
        for (int i = 0; i < intNewArr.length; i++) {
            if(i == middleI)
            {
                intNewArr[i] = numberToAdd;
            }
            else {
                intNewArr[i] = intArr[j];
                j++;
            }
        }
        return intNewArr;
    }
}

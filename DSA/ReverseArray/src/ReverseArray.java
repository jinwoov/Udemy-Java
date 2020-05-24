public class ReverseArray {
    public static void main(String[] args){
        String book = "Hello";
        String[] bookArr = book.split("");
        bookArr =  ReverseArr(bookArr);
        book = String.join(", ", bookArr);
        System.out.println(book);
    }

    public static String[] ReverseArr(String[] strArr){
        String[] newArr = new String[strArr.length];
        int j = 0;
        for (int i = strArr.length - 1 ; i >= 0 ; i--) {
            newArr[j] = strArr[i];
            j++;
        }
        return newArr;
    }
}

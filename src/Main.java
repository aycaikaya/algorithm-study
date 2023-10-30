public class Main {

    public static void main(String[] args){
        int[] array = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(calculateCapacity(array));
    }

    public static int calculateCapacity(int[] array) {
        //If the input array is empty
        if (array.length <=2 ){
            return 0;
        }
        int h = 0;
        int sum = 0;
        int i = 0; //left pointer
        int j = array.length - 1; //right pointer
        while(i < j) {
            if ( array[i] < array[j] ) {
                h = Math.max(h,array[i]);
                sum += h - array[i];
                i++;
            } else {
                h = Math.max(h,array[j]);
                sum += h - array[j];
                j--;
            }
        }
        return sum;
    }


}

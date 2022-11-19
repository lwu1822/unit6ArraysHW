public class ArraysHack5 {
    public static void main(String[] args) {

        int[] array1 = {7, 9, 4}; 

        int firstIndexNum = array1[0]; 

        // shift element of each index one to the left
        for(int i = 0; i < array1.length - 1; i++) {
            array1[i] = array1[i+1];
        }
        array1[array1.length - 1] = firstIndexNum; 

        // print left-shifted array
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}

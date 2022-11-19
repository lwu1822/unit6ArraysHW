public class ArraysHack3 {

    public static void arraySorter(int[] myNumbers) {
        int largerNum = 0; 
        for (int i = 0; i < myNumbers.length; i++) {
            // start at index 0, compare with elements in index 1-5, and replace the element 
            // in index 0 with the smallest number
            // then start at index 1 and repeat this process
            for (int j = i+1; j < myNumbers.length; j++) {
                if (myNumbers[i] > myNumbers[j]) {
                    largerNum = myNumbers[i]; 
                    myNumbers[i] = myNumbers[j]; 
                    myNumbers[j] = largerNum; 
                }
            }
        }

        // print out array 
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]); 
        }

    }
    public static void main (String[] args) {
        int[] myNumbers = new int[] {5, 3, 4, 1, 2};
        arraySorter(myNumbers); 
    }

/* // this is another arraySorter method that does the same function
   // but the method used in the program is more efficient than this one

    public static void arraySorter(int[] myNumbers) {
        int num = 0; 
        for (int i = 0; i < myNumbers.length; i++) {
            num = myNumbers[i]; 
            for (int j = i; j < myNumbers.length; j++) {
                // find the smallest number
                if (num > myNumbers[j]) {
                    num = myNumbers[j]; 
                }
            }

            for (int j = i; j < myNumbers.length; j++) {
                // place the smallest number in the leftmost index
                if (num == myNumbers[j]) {
                    myNumbers[j] = myNumbers[i];
                    myNumbers[i] = num; 
                }
            }
        }
        
        // print array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]); 
        }
    }
 */
}

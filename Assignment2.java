package ARRAY;
//idle Abdullahi isak
//ID c1210007
public class Assignment2 {

        public static int[] removeDuplicates(int[] array) {

            int[] tempArray = new int[array.length];
            int count = 0;


            for (int i = 0; i < array.length; i++) {
                boolean isDuplicate = false;

                for (int j = 0; j < count; j++) {
                    if (array[i] == tempArray[j]) {
                        isDuplicate = true;
                        break;
                    }
                }


                if (!isDuplicate) {
                    tempArray[count] = array[i];
                    count++;
                }
            }


            int[] uniqueArray = new int[count];
            for (int i = 0; i < count; i++) {
                uniqueArray[i] = tempArray[i];
            }

            return uniqueArray;
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 2, 3, 4, 4, 5};
            int[] output = removeDuplicates(input);
            for (int i : output) {
                System.out.print(i + " ");
            }
            // Output: 1 2 3 4 5
        }
    }



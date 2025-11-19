package h1;

public class H1_main {
    public static void main (String[] args) {
        int[] myArray = {5,6,7,10};

        int[] temp_Array = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            temp_Array[i] = myArray[myArray.length - 1 - i];
        }

        myArray = temp_Array;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}

package Arrays07_10;

// Normally, an array is a collection of similar type of elements which has contiguous memory location.
//
//Java array is an object which contains elements of a similar data type.
// Additionally, The elements of an array are stored in a contiguous memory location.
// It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

// Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
// Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.

// In Java, array is an object of a dynamically generated class.
// Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces.
// We can store primitive values or objects in an array in Java.
// Like C/C++, we can also create single dimentional or multidimentional arrays in Java.
// Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.


//  Advantages
//Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
//Random access: We can get any data located at an index position.
//  Disadvantages
//Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
// To solve this problem, collection framework is used in Java which grows automatically.

public class Arrays {
    public static void main(String[] args) {
        int a[] = new int[5]; // //declaration and instantiation
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
        for(int i = 0; i < a.length; i++) System.out.println(a[i]);
        System.out.println("");

        int a1[] = { 33, 3, 4, 5 };//declaration, instantiation and initialization
        for (int i : a1) System.out.println(i);
        System.out.println("");

        // Anonymous Array in Java
        for (int i : new int[]{10, 22, 44, 66}) {
            System.out.println(i);
        }
        System.out.println("");

        // Returning Array from the Method
        int arr[] = TestReturnArray.get();
        for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
        System.out.println("");

        // Multidimensional Array in Java
        int[][] arr2 = new int[3][3];
        arr2[0][0]=1;
        arr2[0][1]=2;
        arr2[0][2]=3;
        arr2[1][0]=4;
        arr2[1][1]=5;
        arr2[1][2]=6;
        arr2[2][0]=7;
        arr2[2][1]=8;
        arr2[2][2]=9;

        int[][] arr3 = {{1,2,3},{2,4,5},{4,4,5}};

        // Jagged Array in Java
        // If we are creating odd number of columns in a 2D array, it is known as a jagged array.
        // In other words, it is an array of arrays with different number of columns.
        int arr4 [][] = new int[3][];
        arr4[0] = new int[3];
        arr4[1] = new int[4];
        arr4[2] = new int[2];
        int count = 0;
        for (int i=0; i<arr4.length; i++)
            for(int j=0; j<arr4[i].length; j++)
                arr4[i][j] = count++;

        //printing the data of a jagged array
        for (int i=0; i<arr4.length; i++){
            for (int j=0; j< arr4[i].length; j++){
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("");

        // Example of Copying an Array in Java
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
        System.out.println("");

        // **Cloning an Array in Java
        int arr5[] = {22, 3, 5, 2, 1};
        int carr[] = arr5.clone();
        for(int i:carr)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr==carr ? "Yes" : "No");
    }
}


class TestReturnArray{
    static int[] get(){
        return new int[]{10,30,50,90,60};
    }
}

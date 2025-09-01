
public class Array1 {

    public static void printArray(int[] arr) {
        // int fre[] = new int[arr.length];
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if (visited[i]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // fre[i] = count;
            // System.out.println(arr[i] + " → " + count + " times");
            // if (count == 1) {
            //     System.out.println(arr[i] + " is a unique element");
            // }
            if (count > 1) {
                System.out.println(arr[i] + " → " + count + " times");
            }

        }
    }

    public static void reverseArray(int arr[]) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length-i-1];
        }
        for (int elem : newArr) {
            System.out.println(elem);
        }
    }

    //17.Write a Java program to put even and odd elements of array in two separate array.
    static void seperateNumbers(int arr[]){
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex++] = arr[i];
            } else {
                odd[oddIndex++] = arr[i];
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 4, 5};
        //11.Write a Java program to count frequency of each element in an array.

        // printArray(arr1);
        //12.Write a Java program to print all unique elements in the array.
        // 16.Write a Java program to find reverse of an array.
        reverseArray(arr1);
        seperateNumbers(arr1);
    }
}

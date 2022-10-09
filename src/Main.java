public class Main {

    //Part 1
    public static void printNumber(int n) {
        if (n > 1) {
            printNumber(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void printNumberBackward(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }

    //Part2
    public static void printArray(int[] array, int i) {
        if (i > array.length - 1) {
            return;
        }
        System.out.print(array[i] + " ");
        printArray(array, i + 1);
    }

    public static int arraySum(int[] array, int i) {
        if (i == array.length) {
            return 0;
        }
        return arraySum(array, i + 1) + array[i];
    }

    public static int findCountInArray(int[] array, int what, int i) {
        if (i == array.length)
            return 0;
        if (array[i] == what) {
            return findCountInArray(array, what, i + 1) + 1;
        }
        return findCountInArray(array, what, i + 1);

    }

    public static void main(String[] args) {
        //Part1
        printNumber(9);
        System.out.println();
        printNumberBackward(9);
        //Part2
        int[] arr = {1, 2, 3, 7, 9, 2, 5, 5, 5};
        System.out.println();
        printArray(arr, 0);
        System.out.println();
        System.out.println("Sum of array is " + arraySum(arr, 0));
        System.out.println(findCountInArray(arr, 5, 0));
    }
}
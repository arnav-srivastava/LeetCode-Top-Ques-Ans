public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31};
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Largest element = " + max);
    }
}

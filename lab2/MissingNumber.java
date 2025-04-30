public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 2, 4}; 
        int n = arr.length + 1; 

        int expSum = n * (n + 1) / 2;

        int Sum = 0;
        for (int num : arr) {
            Sum += num;
        }
        int missno = expSum - Sum;

        System.out.println("The missing number is: " + missno);
    }
}

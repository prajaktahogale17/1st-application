import java.util.*;
public class StudentRollSearch {
        public static int binarySearch(int arr[], int left, int right, int roll) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == roll)
                return mid; // found at index mid
            if (arr[mid] > roll)
                return binarySearch(arr, left, mid - 1, roll);
            else
                return binarySearch(arr, mid + 1, right, roll);}  
      return -1; }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int rollNumbers[] = new int[n];
        System.out.println("Enter " + n + " roll numbers in sorted order:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();}
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        int result = binarySearch(rollNumbers, 0, n - 1, roll);
        if (result == -1)
            System.out.println("Roll number " + roll + " not found!");
        else
            System.out.println("Roll number " + roll + " found at position: " + (result + 1));
    }
}


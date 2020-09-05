/*Iterating over arrays  The longest ascending sequence
Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

Sample Input 1:

10
1 2 4 1 2 3 5 7 4 3

Sample Output 1:

5
*/
import java.util.*;
class longest_sequence {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int c=1;
        int k=0;
        int arr1[] = new int[n];
        for(i=0;i<(n-1);i++)
        {
            if(arr[i]<arr[i+1])
            {
                c=c+1;
            }
            else
            {
                arr1[k]=c;
                c=1;
                k++;
            }
        }
        arr1[k]=c;
        int maxi = arr1[0];
        for(i=1;i<n;i++)
        {
            if(maxi<arr1[i])
            {
                maxi=arr1[i];
            }
        }
        System.out.println(maxi);
    }
}

/* Other solution:
int maxSequenceLength = 1;
        int currentSequenceLength = 1;
        for (int i = 1; i < len; i++) {
            currentSequenceLength = arr[i - 1] < arr[i] ? ++currentSequenceLength : 1;
            maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
        }
*/

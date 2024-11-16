import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] aerd){

        int max=0;
        int secondMax=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        if(arr.length<2){
            System.out.println("Atleast 2 elements required");
        }

        System.out.println("Insert array elements: ");
        for (int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }

        System.out.println("******************");
        System.out.println("Max: "+max);
        System.out.println("SecondMax: "+secondMax);
        System.out.println("******************");
    }
}

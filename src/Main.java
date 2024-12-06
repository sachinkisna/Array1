import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Arrays");
//        int[] marks={1,2,3,4,5,6};
//        int[] myart= new int[5];
//        myart[2]=452;
//        myart[0]=450;
//        myart[1]=451;
//        System.out.println(myart[0]);
//        System.out.println(myart[2]);
//        System.out.println(marks.length);
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The number You Want To search");
        int num=input.nextInt();

        boolean isFound=isFound(arr,num);
        if (isFound){
            System.out.println("Your number was found on the array");
        }else {
            System.out.println("Your NUmber Is Not Found ");
        }


    }

    public static boolean isFound(int[] arr, int num){
        int index=0;
        while (index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }

        return false;
    }
}
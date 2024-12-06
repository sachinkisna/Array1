public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{5,6}};
//        System.out.println(arr[1][2]);
        int[][] rr=new int[8][5];
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

package kadane;

public class Bruteforce {
    public static void main(String[] args) {
        int arr[]={-1-2,3,2,-1};
        System.out.println(bruteKadane(arr));
    }

    public static int bruteKadane(int arr[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}

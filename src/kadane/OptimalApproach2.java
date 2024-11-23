package kadane;

public class OptimalApproach2 {
    public static void main(String[] args) {
        int arr[]={-1,-2,2,3,-1};
        System.out.println(kadane(arr));
    }

    public static int kadane(int arr[]){
        int sum=0,max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }

        return max;
    }
}

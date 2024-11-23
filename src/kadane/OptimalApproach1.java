package kadane;

public class OptimalApproach1 {
    public static void main(String[] args) {
        int arr[]={-1-2,3,2,-1};
        System.out.println(kadane(arr));
    }

    public static int kadane(int arr[]){
        int maxCurr=arr[0],maxG=arr[0];

        for(int i=1;i<arr.length;i++){
            maxCurr = Math.max(maxCurr+arr[i],arr[i]);
            if(maxCurr>maxG)
                maxG=maxCurr;
        }
        return maxG;
    }
}

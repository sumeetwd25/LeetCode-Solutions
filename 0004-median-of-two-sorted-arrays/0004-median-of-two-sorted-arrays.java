class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int arr[] = new int[nums1.length+nums2.length];
        int index=0;
        double sum=0;


        for(int i=0; i<nums1.length; i++){
            arr[index] = nums1[i];
            index++;
        }
        
        for(int i=0; i<nums2.length; i++){
            arr[index] = nums2[i];
            index++;
        }

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }

        Arrays.sort(arr);

        if(arr.length%2==0){
            int midLeft=arr[arr.length/2-1];
            int midRight=arr[arr.length/2];
            sum = (double)(midLeft+midRight)/2;
        }
        else{
            int mid = arr[arr.length/2];
            sum = (double) mid;
        }

        return sum;
    }
}
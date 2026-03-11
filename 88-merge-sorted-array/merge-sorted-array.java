class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer>arr1=new ArrayList<>();
        for (int num : nums1) {
            arr1.add(num); 
        }
        ArrayList<Integer>arr2=new ArrayList<>();
        for (int num : nums2) {
            arr2.add(num); 
        }
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=0;
         while(i<m && j<n){
            if(arr1.get(i)<arr2.get(j)){
                res.add(arr1.get(i));
                i++;
            }else {
                res.add(arr2.get(j));
                j++;
            }
        }
        while(i<m){
            res.add(arr1.get(i));
            i++;
        }
        while(j<n){
            res.add(arr2.get(j));
            j++;
        }
        for(int k=0;k<res.size();k++){
            nums1[k]=res.get(k);
        }
    }
}
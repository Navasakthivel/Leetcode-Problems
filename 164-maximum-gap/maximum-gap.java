class Solution {
    public int maximumGap(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list);
        int ans=0;
        for(int i=0;i<list.size()-1;i++){
            int max=list.get(i+1)-list.get(i);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
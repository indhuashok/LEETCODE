// Last updated: 8/11/2026, 11:26:03 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        for(int num:nums1){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(m.containsKey(num)&& m.get(num)>0){
                result.add(num);
                m.put(num,m.get(num)-1);
            }
        }
        int[]ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}
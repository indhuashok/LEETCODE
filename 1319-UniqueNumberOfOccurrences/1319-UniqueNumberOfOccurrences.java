// Last updated: 8/11/2026, 11:24:13 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // int a[]=new int[Integer.MAX_VALUE/100];
        // for(int i=0;i<arr.length;i++){
        //     a[arr[i]]++;
        // }
        
        // for(int i=0;i<a.length-1;i++){
        //     if(a[i]==a[i+1]){
        //         return false;
        //     }
        // }
        // return true;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:map.values()){
          if(!set.add(i)){
            return false;
          }
        }
        return true;
    }
}
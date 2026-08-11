// Last updated: 8/11/2026, 11:24:09 AM
class Solution {
    public double angleClock(int hour, int minutes) {
        
   hour=hour %12;
     double a=(double)(30*hour+0.5*minutes);
    double b=(double)6*minutes;
     double ans=0.0;
    if(a>b){
      ans=a-b;
    }else{
      ans=b-a;
    }
     if(ans>180){
        return (360-ans);
     }
     return ans;
    }
}
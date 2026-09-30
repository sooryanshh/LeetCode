class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     
     int start =-1;
     int sum =0;
     for(int i =0;i<cost.length;i++){
       gas[i]=gas[i]-cost[i];
     }
    int count=0;
    int i=0;
    for(int j =0;j<2*gas.length;j++){
        if(gas[i]>=0 && start==-1){
           count =0;
            start=i;
        }
        if(start!=-1){
            sum+=gas[i];
            count++;}
        
        if(sum<0){
            start=-1;
            sum=0;
            count=0;
        }
        
        if(count==gas.length)return start;
        i++;
        if(i==gas.length)i=0;
    }
     return -1; 
    }
}
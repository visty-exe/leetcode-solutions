class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tG=0;
        int tC=0;
        for(int i=0;i<gas.length;i++){
            tG+=gas[i];
            tC+=cost[i];
        }
        if(tG<tC)return -1;

        int rem=0;
        int pos=0;
        for(int i=0;i<gas.length;i++){
            rem+=gas[i]-cost[i];
            if(rem<0){
                rem=0;
                pos=i+1;
            }
        }
        return pos;
    }
}
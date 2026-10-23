class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int min=0;
        int max=0;

        for(int w: weights){
            min=Math.max(min,w);
            max+=w;
        }

        while(min<=max){
            int mid=min+(max-min)/2;
            int days=1;
            int sum=0;

            for(int w: weights){
                if(sum+w>mid){
                    days++;
                    sum=0;
                }
                sum+=w;
            }

            if(days>D){
                min=mid+1;
            }else{
                max= mid-1;
            }
        }
        return min;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->hs.get(a)- hs.get(b));

        for(int n: nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }

        for(int n: hs.keySet()){
            pq.offer(n);

            if(pq.size()>k){
                pq.poll();
            }
        }

        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]= pq.poll();
        }
        return res;
    }
}
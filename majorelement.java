class majorityElement {
    public static int majority(int[] nums){
        int num=nums[0];
        int count=1;
        for(int i =1;i<nums.length;i++) {
            if(num==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                num=nums[i];
                count=1;
            }
        }
        return num;
    }
        public static void main(String args[]){
            int arr[]={3,0,4,3,7,3};
            int res=majority(arr);
        System.out.println(res);
    }
}
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[][] numIndex = new int[n][2];
        

        for(int i=0;i<n;i++){
            numIndex[i][0]=nums[i];
            numIndex[i][1]=i;
        }
            Arrays.sort(numIndex,(a,b) -> Integer.compare(a[0],b[0]));

            int left=0;
            int right=n-1;
            while(left<right){
                int sum=numIndex[left][0] + numIndex[right][0];

                if(sum==target){
                    return new int []{numIndex[left][1],numIndex[right][1]};
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
            return new int[]{-1,-1};
        }
        

    }
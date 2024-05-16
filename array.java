561. Array Partition I
Input: nums = [1,4,3,2]
Output: 4
Explanation: All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.

public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int res = 0;
    for(int i=0; i<nums.length; i+=2){
        res  += nums[i];
    }
    return res;
}
################################################################################################
66. Plus One

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

public int[] plusOne(int[] arr) {
        
    int n = arr.length;
    for(int i=n-1; i>=0; i--){
        if(arr[i] != 9){
            arr[i]++;
            break;
        }else{
            arr[i] = 0;
        }
    }
    
    if(arr[0] == 0){
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
    return arr;
}
####################################################################################################################################
2293. Min Max Game

Input: nums = [1,3,5,2,4,8,2,2]
Output: 1
Explanation: The following arrays are the results of applying the algorithm repeatedly.
First: nums = [1,5,4,2]
Second: nums = [1,4]
Third: nums = [1]
1 is the last remaining number, so we return 1.

public int minMaxGame(int[] nums) {
        
    while(nums.length>1){
        int n = nums.length;
       
       int[] newNums = new int[n/2];
       for(int i=0; i<newNums.length; i++){
           if(i%2 == 0){
               newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
           }else{
               newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
           }
       }
       nums = newNums;
   }
   return nums[0];
   }

####################################################################################################################################
88. Merge Sorted Array

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public void merge(int[] n1, int m, int[] n2, int n) {
    int p = m+n-1, p1 = m-1, p2 = n-1;
    
    while(p1>=0 && p2>=0){
        if(n1[p1] > n2[p2]){
            n1[p] = n1[p1];
            p1--;
            p--;
        }else{
            n1[p] = n2[p2];
            p2--;
            p--;
        }
    }
    while(p2>=0){
        n1[p] = n2[p2];
        p2--;
        p--;
    }
####################################################################################################################################

####################################################################################################################################


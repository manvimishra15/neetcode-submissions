class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> hash;
         for(int i=0;i<nums.size();i++)
        {
        int a=target-nums[i];
        if(hash.find(a)!=hash.end())
        return {hash[a],i};
        hash[nums[i]]=i;
    }}
};

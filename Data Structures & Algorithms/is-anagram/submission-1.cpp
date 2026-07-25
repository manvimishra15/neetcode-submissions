class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> hash;
        unordered_map<char,int> hash1;
        if(s.length()==t.length())
        {
            for (int i=0;i<s.length();i++)
        {
            hash[s[i]]++;
            hash1[t[i]]++;
        }
        if(hash==hash1)
        return true;
        }
        return false;
    }
};

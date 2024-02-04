class Solution {
public:
    int smallestEvenMultiple(int n) {
        int res=n%2;
        return n*(res+1);
    }
};

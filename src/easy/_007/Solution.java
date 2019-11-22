package easy._007;

class Solution {
    public int reverse(int x) {
        long b = 0, term;
        while (x!=0){
            term = x%10;
            b = b * 10 + term;
            x=x/10;
        }
        if(b<Integer.MIN_VALUE || b>Integer.MAX_VALUE){
            return 0;
        }
        return (int)b;
    }
}

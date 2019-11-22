package medium._006;

class Solution {
    public String convert(String s, int numRows) {
        //标记数组
        if(numRows==1)
            return s;
        String str = "";
        int count = 0;
        int TotalJump = (numRows - 1) * 2;
        int OneJump;
        int cur;
        for(int i=0;i<s.length() && count<numRows;i++){
            cur = i;
            if(count==numRows-1)
                OneJump = (numRows - 1) * 2;
            else
                OneJump = (numRows - 1) * 2 - count*2;
            while(cur<s.length()){
                str = str + s.charAt(cur);
                cur = cur + OneJump;
                if(count>0 && count<numRows-1)//首位和末尾不换跳的次数
                    OneJump = TotalJump - OneJump;
            }
            count++;
            }
        return str;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("PAYPALISHIRING"
                ,1));
    }
}

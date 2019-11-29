package hard._010;
//动态规划法：难度大
class Solution3 {
    public boolean isMatch(String s,String p){
        if(p.isEmpty())//p为空时，s必须为空，才匹配
            return s.isEmpty();
        int sSize = s.length(),pSize = p.length();
        //dp(i,j)表示s的前i个元素是否和p的前j个匹配
        boolean dp[][] = new boolean[sSize+1][pSize+1];
        //初始化dp所有的元素为false
        for(int i=0;i<=sSize;i++)
        {
            for(int j=0;j<=pSize;j++){
                dp[i][j] = false;
            }
        }
        //初始化矩阵
        dp[0][0] = true;
/*      s为空的时候，p什么时候可以匹配，只有c*c*c*,c表示任意字符
        for j in range(1, pSize, 2):
        dp[0][j+1] = dp[0][j-1] and p[j] == '*'
        *后面的元素是否匹配取决于*前面的元素是否匹配
*/
        //s为空时
        if(p.charAt(0)=='*')
            dp[0][1] = true;//p的第一个元素为*时，p和空串s匹配
        for(int j=1;j<pSize;j++){
            if(p.charAt(j)=='*'){//当前元素是*，下一个是否匹配和前面是否匹配相同
                dp[0][j+1] = dp[0][j-1];
            }
        }
        //递推
        for(int i=0;i<sSize;i++){
            for(int j=0;j<pSize;j++){
                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
                    dp[i+1][j+1] = dp[i][j];
                }
                else if(p.charAt(j)=='*'){
                    if(p.charAt(j-1)!=s.charAt(i) && p.charAt(j-1)!='.')
                    {
                        //*可以表示下标为j-1的元素取0个
                        dp[i+1][j+1] = dp[i+1][j-1];
                    }
                    else {
                        //“x*” 有三种可能，“”，“x”，“xxx...”(s的那个元素匹配，取决于s前面的和p当前的是否匹配)
                        dp[i+1][j+1] = dp[i+1][j-1] || dp[i+1][j] || dp[i][j+1];
                    }
                }
            }
        }
        return dp[sSize][pSize];
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.isMatch("aac","a*c"));
    }
}

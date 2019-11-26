package hard._010;

class Solution2 {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty())
            return s.isEmpty();
        if(p.length()>=2 && p.charAt(1)=='*')
        {//*匹配0个或多个，匹配
            return isMatch(s,p.substring(2)) || (!s.isEmpty() && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.') && isMatch(s.substring(1),p));
        }
        else
        {
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1),p.substring(1));
        }
    }
}

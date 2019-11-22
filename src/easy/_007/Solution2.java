package easy._007;

class Solution2 {
    public int reverse(int x) {
        //int转化为String，再转化为char[]数组
        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        int i = 0,len=arr.length;
        char term;
        if(arr[0]=='-')
            for(i=1;i<=len/2;i++){
                term = arr[i];
                arr[i] = arr[len-i];
                arr[len-i] = term;
            }
        else{
            for(i=0;i<len/2;i++){
                term = arr[i];
                arr[i] = arr[len-i-1];
                arr[len-i-1] = term;
            }
        }
        s = String.valueOf(arr);
        long x1 = Long.valueOf(s);
        if(x1<Integer.MIN_VALUE || x1>Integer.MAX_VALUE)
            return 0;
        else
            return (int)x1;
    }
}

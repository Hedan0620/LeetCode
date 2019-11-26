package medium._008;

class Solution2 {
    public int myAtoi(String str){
        if(str.isEmpty())//检测空串
            return 0;
        char[] arr = str.toCharArray();
        long ans = 0;
        int i =0,sign =1,n=str.length();
        while (i<n&&arr[i]==' '){
            i++;
        }
        if(i<n&&arr[i]=='+'){
            i++;
        }
        else if(i<n&&arr[i]=='-')
        {
            sign=-1;
            i++;
        }
        while (i<n&&(arr[i]>='0'&&arr[i]<='9')){
            ans = ans * 10 +arr[i]-'0';
            i++;
            //ans 可能会超过long的范围
            if(ans!=(int)ans){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        if(ans!=(int)ans){
            return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return (int)(ans*sign);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.myAtoi("18446744073709551617"));
    }
}

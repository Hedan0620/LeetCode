package medium._008;
//代码写的有点冗余，太多if-else了
class Solution {
    public int myAtoi(String str) {
        //String转化成char[]
        if(str == null || str == "")
            return 0;
        char[] arr = str.toCharArray();
        int start,end;
        if(arr.length<=0)
            return 0;
        if(arr[0]==' ' ||arr[0]=='+'||arr[0]=='-'||(arr[0]>='0' && arr[0]<='9')){
            int i=0;
            while(i<arr.length&&arr[i]==' '){//去掉前面的空格
                i++;
            }
            //第一个必须是数字或者+/-
            if(i<arr.length && (arr[i]=='+'||arr[i]=='-'||(arr[i]>='0' && arr[i]<='9'))){
                start = i;
                i++;
                while(i<arr.length && (arr[i]>='0' && arr[i]<='9')){
                    i++;
                }
                end = i-1;
                if(start==end && (arr[start]>='0' && arr[start]<='9'))
                    return arr[start]-'0';
                else if(start<end ){
                    long b=0;

                    for(int j=start;j<=end;j++){
                        if(arr[j]>='0' && arr[j]<='9'){
                            b = b *10 +(arr[j]-'0');
                        }
                        if(b>Integer.MAX_VALUE){
                            if(arr[start]=='-'){
                                b = b * (-1);
                                return Integer.MIN_VALUE;
                            }
                            else{
                                return Integer.MAX_VALUE;
                            }
                        }
                    }
                    if(arr[start]=='-'){
                        b = b * (-1);
                    }
                    return (int)b;
                }
                else{
                    return 0;
                }
            }
            else
                return 0;
        }else
            return 0;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("-91283472332"));
    }
}
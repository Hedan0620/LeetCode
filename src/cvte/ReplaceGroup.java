package cvte;

public class ReplaceGroup {
    public static int solution(int[][] input){
        int len = input.length;
        int[] out = new int[len];
        for(int i=0;i<len;i++){//用一个数组标记和它一组的下标，统一用小的序号作为带头的
            out[i] = i;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(input[i][j]==1){
                    out[i] = out[j];
                }
            }
        }
        int sum = 0;
        for(int i=0;i<len;i++){
            if(out[i]==i)
                sum++;
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] arr = {{1,0,1,0,0,0},{0,1,0,0,0,0},{1,0,1,0,0,0},{0,0,0,1,0,1},{0,0,0,0,1,0},{0,0,0,1,0,1},};
        int a = solution(arr);
        System.out.println(a);
    }
}

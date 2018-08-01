class RotatePrintMatrix2{
    public void  action(int arr[][]){
        int dR = arr.length - 1;
        int dC = 0;
        int tC = arr[0].length - 1;
        int tR = 0;
        print(arr,dR,dC,tR,tC);
    }
    private void print(int [][]arr,int dR,int dC,int tR, int tC){
        for(int i = dC; i <= tC; i ++){
            for(int j = dR; j >= tR; j--){
                System.out.print(arr[j][i]+",");
            }
        }
    }
    public static  void main (String[] args){
        int [][]matrix = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        new RotatePrintMatrix2().action(matrix);
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return res;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int up = 0, down = m-1, left=0, right=n-1;
        
        while(true){
            for(int i=left;i<=right;i++){
                res.add(matrix[up][i]);
            }
            if(++up > down) break;
            for(int j = up;j<= down; j++){
                res.add(matrix[j][right]);
            }
            if(--right < left) break;
            for(int k = right;k >= left; k--){
                res.add(matrix[down][k]);
            }
            if(--down < up) break;
            for(int q=down; q>=up; q--){
                res.add(matrix[q][left]);
            }
            if(++left > right)break;
        }
        
        return res;
    }
}

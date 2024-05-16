<==== 2D ARRAY ====>(https://leetcode.com/playground/a3sqsBim)
####################################################################################################################################
Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] mat = new int[row][col];
        
        for(int i=0; i<row; i++){ 
            for(int j=0; j<col; j++){
                mat[i][j] = scn.nextInt();    
            }
        }
####################################################################################################################################

Sum of All Elements of Matrix
//         int sum = 0;
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 sum = sum + mat[i][j];
//             }
//         }
        

//         System.out.println("Sum of All Elements : " + sum);


####################################################################################################################################

Output 2D Array (Row by Row)
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
            
        //     System.out.println(); 
        //     // To Print Different Rows in Different Lines
        // }

Print Matrix (Col by Col)
        // for(int j=0; j<col; j++){
        //     for(int i=0; i<row; i++){
        //         System.out.print(mat[i][j] + " ");
        //     }
            
        //     System.out.println(); 
        //     // To Print Different Rows in Different Lines
        // }

        
        
        // System.out.println();

####################################################################################################################################
Row by Row Reversal
//         for(int i=0; i<row; i++){
            
//             // Reversing the ith Row
//             int left = 0, right = col - 1;
//             while(left < right){
//                 int temp = mat[i][left];
//                 mat[i][left] = mat[i][right];
//                 mat[i][right] = temp;   
//                 left++; right--;
//             }
            
//         }
        
####################################################################################################################################
Col by Col Reversal
// for(int j=0; j<col; j++){
            
//     // Reversing the ith Row
//     int left = 0, right = row - 1;
//     while(left < right){
//         int temp = mat[left][j];
//         mat[left][j] = mat[right][j];
//         mat[right][j] = temp;   
//         left++; right--;
//     }
    
// }
        
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 System.out.print(mat[i][j] + " ");
//             }
            
//             System.out.println(); 
//             // To Print Different Rows in Different Lines
//         }    

####################################################################################################################################
Sum of All Rows of Matrix
//         for(int i=0; i<row; i++){
//             int rowSum = 0;
//             for(int j=0; j<col; j++){
//                 rowSum = rowSum + mat[i][j];
//             }
            
//             // Inside the (Row) outer loop, outside the (Col) inner loop
//             System.out.println("Sum of " + i + " th Row : " + rowSum);
//         }
        
####################################################################################################################################
Sum of All Columns of Matrix
//         for(int j=0; j<col; j++){
//             int colSum = 0;
//             for(int i=0; i<row; i++){
//                 colSum = colSum + mat[i][j];
//             }
            
//             System.out.println("Sum of " + j + " th Col : " + colSum);
//         }
####################################################################################################################################
Reverse both Rows & Cols (Rotating Image by 180 Degree)
// for(int i=0; i<row; i++){
            
//         //             // Reversing the ith Row
//                     int left = 0, right = col - 1;
//                     while(left < right){
//                         int temp = mat[i][left];
//                         mat[i][left] = mat[i][right];
//                         mat[i][right] = temp;   
//                         left++; right--;
//                     }
                    
//                 }
                
                
//                 for(int j=0; j<col; j++){
                    
//                     // Reversing the ith col
//                     int left = 0, right = row - 1;
//                     while(left < right){
//                         int temp = mat[left][j];
//                         mat[left][j] = mat[right][j];
//                         mat[right][j] = temp;   
//                         left++; right--;
//                     }
                    
//                 }
                                    
//                 for(int i=0; i<row; i++){
//                     for(int j=0; j<col; j++){
//                         System.out.print(mat[i][j] + " ");
//                     }
                    
//                     System.out.println(); 
//                     // To Print Different Rows in Different Lines
//                 }

####################################################################################################################################
rotate the image by 90 degrees (clockwise)
3 
1 2 3
4 5 6
7 8 9

7 4 1 
8 5 2 
9 6 3 

Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){ 
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();    
            }
        }
         int transpose[][]=new int[n][n];
        for(int i=0;i<n;i++){    
            for(int j=0;j<n;j++){    
                transpose[i][j]=arr[j][i];  
            }    
        }
        for(int i=0; i<n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;   
                left++; right--;
            }
        }
        for(int i=0;i<n;i++){    
            for(int j=0;j<n;j++){    
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println();

####################################################################################################################################
Check if sum of each row is same
        // int firstrowSum = 0;
        
        // for(int i=0; i<row; i++){
            
        //     int rowSum = 0;
        //     for(int j=0; j<col; j++){
        //         rowSum = rowSum + mat[i][j];
        //     }
            
        //     if(i == 0){
        //         firstrowSum = rowSum;
        //     } else {
        //         if(rowSum != firstrowSum)
        //             return false;
        //     }
        // }
        
        // return true;


####################################################################################################################################
74 and 240. Search a 2D Matrix
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// int row = 0, col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(matrix[row][col] == target){
//                 return true;
//             }else if(matrix[row][col] < target){
//                 row++;
//         }else{
//             col--;
//         }
//         }
//         return false;

####################################################################################################################################
print wave of 2d array
1 2 3       1 2 3
4 5 6  => 6 5 4
7 8 9       7 8 9


for(int i=0; i<row; i++){
        if(i%2 == 0){  //if even print col as it is 
                for(int j=0; j<col; j++){
                        System.out.print(arr[i][j]+" ");
                }
        }else{ //if odd reverse the col 
                for(int j=col-1; j>=0; j--){
                        System.out.print(arr[i][j]+" ");
                }
        }
        System.out.print();
}


####################################################################################################################################
Row with max 1s
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2


int rowWithMax1s(int arr[][], int n, int m) {
        // code here
       int maxZeros = 0, row = 0;
       
       for(int i=0; i<n; i++){
           int count = 0;
           for(int j=0; j<m; j++){
               if(arr[i][j] == 1) count++;
               
           }  
               if(count > maxZeros){
                   maxZeros = count;
                   row = i;
               }
           }
           return row;
       
    }


####################################################################################################################################
All Zeroes at Right

Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){ 
                arr[i] = scn.nextInt();    
            }
        
        int i=0, j=0;
        
        while(j<arr.length){
            if(arr[j] != 0){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++; j++;
        }else{
            j++;
        }
    }
    for(int k=0; k<n; k++){
    System.out.print(arr[k]+ " ");
        }


####################################################################################################################################
int row = scn.nextInt();
int col = scn.nextInt();
// 
Sum of Row, Col Index

        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
Difference of Row, Col Index
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(i - j + " ");
            }
            System.out.println();
        }
####################################################################################################################################
Check Symmetric Matrix (A = A^T)
// matrix shoudld be squre and the lower left triangle == upper right triangle
int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] mat = new int[row][col];
        
        for(int i=0; i<row; i++){ 
            for(int j=0; j<col; j++){
                mat[i][j] = scn.nextInt();    
            }
        }    
        if(row != col){
            System.out.print(false);
            return;
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mat[i][j] != mat[j][i]){
                    System.out.print(false);
                    return;
                }
            }
        }
        System.out.print(true);


####################################################################################################################################
Check Identity Matrix
//Should be  square matrix (every identity matrix is symmetrix matrix)
//all left diagnol elements should be '1'
//rest all should be '0'
1 0 0
0 1 0  or 1 
0 0 1

if(row != col){
        // Non-Square Matrix can never be Identity Matrix
        System.out.println("false");
        return;
    }
    
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            
            // Diagonal Elements should be 1
            if(i == j && mat[i][j] != 1){
                System.out.println("false");
                return;
            }
            
            // Non-Diagonal Elements should be 0
            if(i != j && mat[i][j] != 0){
               System.out.println("false");
                return; 
            }
        }
    }
    
    System.out.println("true");


####################################################################################################################################
Check Diagonals Sum are equal or not
 // Check Diagonals Sum are equal or not (for Square Matrix)
 int leftSum = 0;
 for(int i=0; i<row; i++){
     leftSum = leftSum + mat[i][i];
 }
 
 int rightSum = 0;
 for(int i=0; i<row; i++){
     rightSum = rightSum + mat[i][row - 1 - i];
 }
 
 if(leftSum == rightSum) System.out.println("true");
 else System.out.println("false");


####################################################################################################################################
Zigzag (or diagonal) traversal of Matrix
1     2     3     4
5     6     7     8
9    10    11    12
13    14    15    16
17    18    19    20 

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20


####################################################################################################################################
Diagnal Trevarsal
4 4
1 2 3 4
2 1 4 3
3 1 4 2
1 2 3 9

1 
2 2 
3 1 3 
1 1 4 4 
2 4 3 
3 2 
9 
Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = scn.nextInt();
            }
        }
      for(int sum=0; sum<=(row-1 + col-1); sum++){
          int i=sum, j=0;
          if(sum >= row){
              i = row-1;
              j = sum-i;
          }
          while(i>=0 && j<col){
              System.out.print(mat[i][j]+" ");
          i--; j++;
      }
        System.out.println();
          }
####################################################################################################################################
Diagonal Sum

Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        
        for(int i=0; i<n; i++){
            sum += mat[i][n-1-i];
        }
####################################################################################################################################
Count All Palindromic Rows

Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        
        for(int i=0; i<m; i++){ 
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        } 
        int count = 0;
        for (int i = 0; i < m; i++){
                int j = 0, k = n - 1;
                boolean t = true;
            while (j < k) {
                if (arr[i][j] != arr[i][k]) {
                    t = false;
                    break;
                }
                j++;
                k--;
            }
            if (t)
                count++;
        }
            System.out.print(count);

####################################################################################################################################
Sum of Absolute Differences

3
2 3 5

4 3 5

result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.

Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                sum+=Math.abs(arr[i]-arr[j]);
                
            }
            System.out.print(sum+" ");
        }

####################################################################################################################################
Sort The Complete Matrix(m * n)
3 3
9 8 7 
5 4 1 
2 3 6
ans: 
1 2 3 
4 5 6 
7 8 9 

Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            arr[i][j] = sc.nextInt();
            // System.out.println(arr[i]);
        }
        }    
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<n; k++){
                    for(int l=0; l<m; l++){
                        if(arr[i][j]<arr[k][l]){
                           int temp =  arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

####################################################################################################################################
Convert 1-D Array to 2-D Array
Sample Input:
9
1 2 3 4 5 6 7 8 9
3 3
Sample Output :
1 2 3 
4 5 6 
7 8 9 


Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        
        
        int n = scn.nextInt();
        int m = scn.nextInt();

        int j = 0;
        int[][] arr2 = new int[n][m];
        
        for(int id = 0; id<n; id++){
            for(int idx = 0; idx<m; idx++){
                arr2[id][idx] = arr[j];
                j++;
                System.out.print(arr2[id][idx]+" ");
            }
            System.out.println();
        }
####################################################################################################################################
2022. Convert 1D Array Into 2D Array

public int[][] construct2DArray(int[] arr, int n, int m) {
    int N = arr.length;
    if(N != n*m) return new int[0][0];
    int[][] arr2 = new int[n][m];
    for(int id = 0; id<N; id++){
            int nr = id/m;
            int nc = id%m;
            arr2[nr][nc] = arr[id];
            
        }
    
        return arr2;
}

####################################################################################################################################


####################################################################################################################################


####################################################################################################################################


####################################################################################################################################


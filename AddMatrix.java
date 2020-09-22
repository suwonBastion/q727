class AddMatrix{

  public static boolean addMatrix(int[][]x,int[][]y,int[][]z){
    if (x.length != y.length || y.length != z.length)
      return false;
    for (int i = 0;i<x.length;i++)
      if (x[i].length != y[i].length || x[i].length != z[i].length)
        return false;
    for (int i = 0; i<x.length;i++)
      for (int j = 0;j<x[i].length;j++)
        z[i][j] = x[i][j] + y[i][j];
    return true;
    
  }
  public static void printMatrix(int[][]m){
    for (int i = 0;i<m.length;i++){
      for (int j = 0; j<m[i].length;j++){
        System.out.print(m[i][j]+" ");
        System.out.println();
      }
    }


  }
  




}
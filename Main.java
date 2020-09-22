class Main {
  public static void main(String[] args) {
    int[][]a = {{1,2,3},{4,5,6}};
    int[][]b = {{6,4,5,},{5,1,2}};
    int[][]c = new int[2][3];

    if (AddMatrix.addMatrix(a,b,c)) {
      System.out.println("행렬a");
      AddMatrix.printMatrix(a);
      System.out.println("\n행렬b");
      AddMatrix.printMatrix(b);
      System.out.println("\n행렬c");
      AddMatrix.printMatrix(c);
      
    }
    
  }
}
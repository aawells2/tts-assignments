class Main {
  //1.
  static int arr[] = { 1,2,3,4,5 };
 
    static int sumOfArray()
    {
        int sumOfArray = 0; 
        for (int i = 0; i < arr.length; i++)
            sumOfArray += arr[i];
 
        return sumOfArray;
    }
    //2.) NO OUTPUT - SYNTAX ERRORS
    //3.)
  public static double toPower(int size,int power){
  
    
    return Math.pow(size,power);
  }
  
    public static void main(String[] args)
    {
        System.out.println("The sum of the array is: "
                           + sumOfArray());
      System.out.println("Three to the power of 4 is: " + toPower(3,4));
    }
}



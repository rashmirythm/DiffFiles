package calc;
  
public class JavaFile {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        int x=0;
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
		x++;
        } 
			System.out.println("Checking");
        return max; 
    }  
	
	
	
	
	
	public static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }
	
	public void insertionSort(int arr[], int n)
	{
	   int i, key, j;
	 
	   for (i = 1; i < n; i++)
	   {
		   if(j<0)
		   {
			   System.out.println("j less than 0");
		   }
	       key = arr[i];
	       j = i-1;
	       while (j >= 0 && arr[j] > key)
	       {
	    	   
	    	   if(j<0)
			   {
				   System.out.println("j less than 0");
			   }
	           arr[j+1] = arr[j];
	           j = j-1;
	       }
	       arr[j+1] = key;
	   }
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(arr[i]);
	   }
	}
	
	
	public void casestatements()
	{
		String Branch = "CSE";
        int year = 2;
        int day = 3;
         
        switch(year)
        {
            case 1 :
                System.out.println("1st choice");
                break;
            case 2:
                System.out.println("2nd choice");
                break;
            case 3:
            	switch(day)
                {
                    case 1 :
                        System.out.println("1st sub choice");
                        break;
                    case 2:
                        System.out.println("2nd sub choice");
                        break;
                    default:
                    	System.out.println("Invalid");
                }
            default:
            	System.out.println("Invalid");
        }
	}
	
} 

public class JavaFile2 {  
	    
	
	 class LocalInnerClass {
         public void printLocalInnerClass() {
             System.out.println("A new local inner class!");
             
         }
         
         public void printLocalInnerClass2()
         {
        	 System.out.println("A another new local inner class!");
         }
     }
     
	
	public static int findsquare(int num)
	{
		int x=0;
		int cube = num * num;
		return cube;
	}
	
	public static int findsum(int num1, int num2)
	{
		
		int sum = num1 * num2;
		return sum;
	}
	
	
}
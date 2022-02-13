import java.util.Scanner;


public class Main {
	
    //function to checkPalindrome
    public void checkPalindrome()  {
    	 Scanner in = new Scanner(System.in);
    	 int inNumber = in.nextInt();
    	 int temp = inNumber;
    	 int revNum = 0;
    	 while(temp != 0) {
    		 revNum *= 10;
    		 int rem = temp %10;
    		 revNum  += rem;
    		 temp /= 10;  
    	 }
    	 System.out.println( inNumber + "   " + revNum);
    	 if(inNumber== revNum) 
    		 System.out.println("The number is palindrome");
    	 else
    		 System.out.println("The number is NOT palindrome");
   }


    //function to printPattern
    public void printPattern() {
    	 Scanner in = new Scanner(System.in);
    	 int inNumber = in.nextInt();
    	 for(int i=inNumber;i>=1;i--) {
    		 for(int j=1;j<=i;j++)
    			 System.out.print("*");
    		 System.out.println("\n");
    	 }    
   }



     //function to check no is prime or not
     public void checkPrimeNumber() {
    	 Scanner in = new Scanner(System.in);
    	 int inNumber = in.nextInt();
    	 int facCnt = 0;
    	 int i =1;
    	 do {
    		 if(inNumber%i == 0)
    			 facCnt++;
    		 	i++;
    	 }while(inNumber == i);
    	 if(facCnt == 2)
    		 System.out.println("The number is prime");
    	 else
    		 System.out.println("The number is NOT prime");
     }



       // function to print Fibonacci Series
       public void printFibonacciSeries() {
       //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        Scanner in = new Scanner(System.in);
   	 	int inNumber = in.nextInt();
   	 	
   	 	System.out.print(first+",");
	 	System.out.print(second+",");
   	 	int cnt = 2;
   	 	while(cnt < inNumber) {
	   	 	int temp = second;
	   	 	second += first;
	   	 	first = temp;
	   	 	cnt++;
	   	 	System.out.print(second+",");

   	 	}
       }
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
        int choice;

        Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
        	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
        	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        	System.out.println();

        	choice = sc.nextInt();
        	
        	switch (choice) {

        	case 0:     choice = 0;
        				break;
        				
        	case 1: 	{
        				obj.checkPalindrome();
        				}
        				break;
        				
        	case 2: 	{

        				obj.printPattern();
        				}
        				break;

        	case 3: 	{
        			obj.checkPrimeNumber();
        			}
        			break;

        	case 4: {
        			obj.printFibonacciSeries();
        			}
        			break;

        	default:
        		System.out.println("Invalid choice. Enter a valid no.\n");

        	}

        	} while (choice != 0);

        	System.out.println("Exited Successfully!!!");

        	sc.close();

        	}
	}


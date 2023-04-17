public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 5;
		//System.out.println("SYSO");
		//System.out.println("Hello World");
		
		//System.out.println(a);
		
		//Arithmetic Operators
		
				int a = 10, b = 5;
				
				System.out.println(a+b); //Prints the addition of two numbers
				System.out.println(a-b); //Prints the subtraction of two numbers
				System.out.println(a*b); //Prints the multiplication of two numbers
				System.out.println(a/b); //Prints the division of two numbers
				System.out.println(a%b); //Prints the reminder of division
				System.out.println(++a); //Increments the value by 1 and prints it
				System.out.println(--b); //Decrements the value by 1 and prints it
				
				//Relational Operators
				
				System.out.println(a==b);  
				System.out.println(a!=b);  
				System.out.println(a>b);   
				System.out.println(a<b);   
				System.out.println(a>=b);  
				System.out.println(a<=b);
				
				//Logical Operators
				
				System.out.println(true&&true);
				System.out.println(false||true);
				System.out.println(!true);
				
				//Assignment Operators
				
				int c = 8;
				System.out.println(c);
				
				int d = 5;
				d+=7;
				System.out.println(d);
				
				int e = 10;
				e-=3;
				System.out.println(e);
				
				int f = 12;
				f*=2;
				System.out.println(f);
				
				int g = 15;
				g/=3;
				System.out.println(g);
				
				int h = 7;
				h%=4;
				System.out.println(h);
				
				//Conditional Operator
				
				String s = (10 > 5) ? "Greater" : "Smaller" ;
				System.out.println(s);	
				
				int p = (1>5) ? 6 : 9 ;
				System.out.println(p);
				b=14;
				if (a>b) {
					System.out.print(a);
					System.out.println(" A is greater IF");
					System.out.print(b);
					System.out.println(" B is lesser IF");
				}
				else if(c>a)  {
					System.out.print(c);
					System.out.println(" C is greater Else If");
					System.out.print(a);
					System.out.println(" A is lesser Else If");
				}
				else {
					System.out.print(a);
					System.out.println(" A is greater Else");
					System.out.print(c);
					System.out.println(" C is lesser Else");
				}
		
				System.out.println("end of flow IF ELSE If IF");
				
				String fooditem = "pasta";
				
				switch(fooditem) {
				case "pizza":
					System.out.println("Switch case Pizza");
					break;
				case "pasta" :
					System.out.println("Switch Case pasta");
					break;
				case "burger":
					System.out.println("swithc Case burger");
					break;
				default:
					System.out.println("swithc Default Not in list ");
						
				}
				
				while (a >= c) {
					System.out.print("while value of a is ");
					System.out.println(a);
					System.out.print("while value of c is ");
					System.out.println(c);
					a--;
				}
				
				do  {
					System.out.print("Do while value of a is ");
					System.out.println(a);
					System.out.print("Do while value of c is ");
					System.out.println(c);
					a--;
				}while (a >= c);
				
				for (int i=1; i<=10; i++) {
					System.out.print("For value of i is ");
					if (i == 6) {
						break;
						//System.out.println();
						//continue;
					}
					System.out.println(i);
					System.out.println("Change via GitHub_1");
				}
						
	}
	
}
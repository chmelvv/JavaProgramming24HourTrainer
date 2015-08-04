import	java.util.Scanner;	

public	class	FriendsAndFamily	{	
public	static	void	main(String[]	args)	{	
	 	
Scanner	input=	new	Scanner(System.in);	
	 	
do	{	
	 	System.out.println("\n	Enter	list	price:	"	);	
	 	double	listPrice	=	input.nextDouble();	// input good`s price	
	 	
	 	System.out.println("	Enter	discount	%:	"	);	 //input discount
	 	int	discount	=	input.nextInt();		
	 	
	 	System.out.printf("	You'll	pay	only		$%2.2f", listPrice-listPrice*discount/100); //print price with discount
			}	while	(true);		//never stop
}	
}	
package week04L07;

public class MySaving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double savings[]=new double[12];
int option=-1;

while(option!=3) {
	Helper.line(40,"-");
	System.out.println("My SAVINGS");
	Helper.line(40,"-");
	System.out.println("1.View Saving");
	System.out.println("2 Add to saving");
	System.out.println("3.Quit");
	option=Helper.readInt("Enter option>");
	if(option==1) {
		double totalSavings=0.0;
		for(int i=0;i<savings.length;i++) {
			totalSavings+=savings[i];
		}
		Helper.line(40, "-");
		System.out.println("Total savings:$"+totalSavings);
		System.out.println(String.format("Average saving in 12 month:$%.2f", totalSavings/12));
	}
	else if(option==2) {
		int month=Helper.readInt("Enter month to save(1-12)>?");
		double amount=Helper.readDouble("Enter amount to save>$");
		savings[month-1]=amount;
		System.out.println("$"+amount+"added to your saving!");
		
	}
	else if(option==3) {
		System.out.println("Bye");
	}
} 
	}

}

package cardealer;
import java.util.Scanner;

public class cardealer {

	public static void main(String[] args) {
		System.out.println("List of cars in showroom ");
		cardetails c=new cardetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Car Model: ");
		String model=sc.nextLine();
		int carcost=c.carmodel(model);
		int cost=c.rto(carcost);
		cost=c.tcs(cost);
		System.out.println("Do you need Insurance: ");
		String insurance=sc.nextLine();
		if(insurance.equals("yes")) {
			cost=c.insurance(cost);
		}
		System.out.println("Do you need Accessories: ");
		String accessories=sc.nextLine();
		if(accessories.equals("yes")) {
			cost=c.accessories(cost);
		}
		int dis;
		if(insurance.equals("yes") || accessories.equals("yes")) {
			System.out.println("Is Discount given in percentage : ");
			String disper=sc.nextLine();
		
			if(disper.equals("yes")) {
				System.out.println("Dealer discount in percentage: ");
				float discount=sc.nextFloat();
				discount=discount/100;
				dis=c.discount(discount,carcost);
			}
			else {
				System.out.println("Dealer discount: ");
				int discount=sc.nextInt();
				if(discount<=30000) {
					dis=discount;
				}
				else {
					System.out.println("Maximum discount should not cross 30,000.");
					System.out.println("Discount = 30000");
					dis=30000;;
				}
			}
		}
		else {
			System.out.println("Any one of additional features has to be added");
			System.out.println("Dealer discount: 0");
			dis=0;
		}
		System.out.println("Total cost : "+(cost-dis));
		
		// TODO Auto-generated method stub

	}

}

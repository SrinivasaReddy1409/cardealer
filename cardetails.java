package cardealer;

public class cardetails extends cardealer{
	public  cardetails(){
		System.out.println("Polo Trendline - 8.70 lakh");
		System.out.println("Polo Highline - 10.09 lakh");
		System.out.println("Virtus Trendline - 11.05 lakh");
		System.out.println("Virtus Highline - 13.08 lakh");
		System.out.println("Taigun Trendline - 14.89 lakh");
		System.out.println("Taigun Highline - 15.42 lakh");
		System.out.println("Taigun Topline - 17.71 lakh");
	}
	public int carmodel(String model) {
		int carcost;
		switch (model) {
		case "Polo Trendline":
			carcost=870000;
			break;
		case "Polo Highline":
			carcost=1009000;
			break;
		case "Virtus Trendline":
			carcost=1105000;
			break;
		case "Virtus Highline":
			carcost=1308000;
			break;
		case "Taigun Trendline":
			carcost=1489000;
			break;
		case "Taigun Highline":
			carcost=1542000;
			break;
		case "Taigun Topline":
			carcost=1771000;
			break;
		default:
			carcost=0;
			
		}
		return carcost;
		
	}
	public int rto(int carcost) {
		int cost=carcost+113990;
		return cost;
	}
	public int tcs(int cost) {
		int c=cost+11000;
		return c;
	}
	public int insurance(int cost) {
		int i=cost+47300;
		return i;
	}
	public int accessories(int cost) {
		int a=cost+15000;
		return a;
	}
	public int discount(float discount,int carcost) {
		int dis=(int) (discount*carcost);
		return dis;
	}
}

import java.util.ArrayList<E>;

public class Rental {
	//private int daysRented;
	private ArrayList<Media> rentals;
	private ArrayList<Media> purchases;
	private Customer c;
	
    public Rental(Customer customer) {
		//daysRented=_daysRented;
		rentals=new ArrayList<Media>();
		purchases=new ArrayList<Media>();
		c=customer;
    }
    
    //public int getDaysRented() {
    //    return _daysRented;
    //}

	public void addRental(Media m){
		rentals.add(m);
	}
	
	public void addPurchase(Media m){
		purchases.add(m);
	}
	
	public void rmRental(Media m){
		rentals.remove(m);
	}
	
	public void rmPurchase(Media m){
		purchases.remove(m);
	}

	public void setFRPMethod(int i){
		if(i<3)
			frpmethod=i;
		else
			System.out.println("Error: Invalid FRP method");
	}

	public int getFRPMethod(){
		return frpmethod;
	}
	
	private static int getAmount(){
		int amount=0;
		int frp=0;
		ArrayList<Media> all= new ArrayList<Media>();
		for(int i=0; i<rentals.size(); i++){
			amount+=rentals.get(i).getPrice();
			all.add(rentals.get(i));
		}
		i=0;
		for(i=0; i<purchases.size();i++){
			amount+=purchases.get(i).getPPrice();
			all.add(purchases.get(i));
		}
		if(frpmethod==0)
			frp=FRPStrategy.addFRP(all);
		if(frpmethod==1)
			frp=FRPStrategy.addFRPAlt1(all);
		if(frpmethod==2)
			frp=FRPStrategy.addFRPAlt2(all);
		c.addFRP(frp);
		return amount;
	}
	
	private static String listMedia(){
		String list = "";
		for(int i=0; i<rentals.size(); i++){
			list += rentals.get(i).getTitle() + "\n";
		}
		i=0;
		list += "</p><p>You purchased\n";
		for(i=0; i<purchases.size();i++){
			list += purchases.get(i).getTitle() + "\n";
		}
		return list;
	}
	
	public String printReceipt(){
		int total = getAmount();
		return "<html><header><title>Your Statement</title></header><body><p>You rented\n"+listMedia()+"</p><p>Your total is " + total.toString() + " and you earned " + c.getFRP() + "Frequent Renter Points!</p></body></html>");
	}
}

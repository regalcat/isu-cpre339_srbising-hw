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
	
	private static int getAmount(){
		int amount=0;
		for(int i=0; i<rentals.size(); i++){
			amount+=rentals.get(i).getPrice();
			c.addFRP(rentals.get(i));
		}
		i=0;
		for(i=0; i<purchases.size();i++){
			amount+=purchases.get(i).getPPrice();
			c.addFRP(purchases.get(i));
		}
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
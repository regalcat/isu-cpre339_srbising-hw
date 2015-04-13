

public class Book extends Media {
	private String title;
	private int daysrented;
	private int pPrice;
	private boolean isN;
	private boolean kids;
	
	public Book(String t){
		super(t);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setDays(int days){
		daysrented=days;
	}
	
	public int getDays(){
		return daysRented;
	}
	public int getPrice(){
		if (isNew())
			return daysrented*3;
		if (isKids()){
			if (daysrented>3)
				return (daysrented-3)*1.5;
			return 1.5;
		}
		if (daysrented>2)
			return (daysrented-2)*1.5+2;
		return 2;
	}
	
	public void setPPrice(int price){
		pPrice = price;
	}
	
	public int getPPrice(){
		return pPrice;
	}
	
	public boolean isNew(){
		return isN;
	}
	
	public void setNew(boolean val){
		isN=val;
	}
	
	public boolean isKids(){
		return kids;
	}
	
	public void setKids(boolean val){
		kids=val;
	}
}
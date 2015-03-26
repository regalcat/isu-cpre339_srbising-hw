
abstract class Media {
    
    private String title;
	private int daysRented;
	private int pPrice;
	private boolean isN;
	private boolean kids;
    
    public Media(String _title) {
        title = _title;
		daysrented=0;
		pPrice=0;
		isN=false;
		kids=false;
    }
    
    public String getTitle() {
        return title;
    }
	
	public void setDays(int days){
		daysrented=days;
	}
	
	public void getDays(){
		return daysRented;
	}
	abstract int getPrice();
	
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
		kids = val;
	}
}
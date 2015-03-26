

public class RentalTest{
	
	public main(int argc, String argv[]){
		//Instantiate variables
		Book a = new Book("Gone With the Wind");
		Movie b = new Movie("Guardians of the Galaxy");
		Movie c = new Movie("The Boxtrolls");
		Movie d = new Movie("Iron Man");
		Game e = new Game("Grand Theft Auto V");
		Music f = new Music("Disney Classics");
		Rental r = new Rental();
		Customer c = new Customer("Sally");
		
		c.setKids(true);
		b.setNew(true);
		f.setKids(true);
		
		a.setDays(3);
		b.setDays(3);
		c.setDays(8);
		d.setDays(4);
		e.setDays(7);
		f.setDays(4);
		r.addRental(a);
		r.addRental(b);
		r.addPurchase(c);
		r.addRental(d);
		r.rmRental(d);
		r.addRental(e);
		r.addRental(f);
		String html = r.printReceipt();
	}
}
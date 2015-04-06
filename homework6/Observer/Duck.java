/* @author	Steff Bisinger
 * @file	Duck.java
 * @date	4/2/2015 - created
 * @brief	A lovely duck who sings in a choir
 */



public class Duck{
	
	private DuckConducktor conducktor;

	private int note;

	private String notes[];

	public Duck(){
		
	}
	public Duck(int n, DuckConducktor con){
		conducktor = con;
		con.addDuck(this);
		note = n;
		notes[0] = "A";
		notes[1] = "B";
		notes[2] = "C";
		notes[3] = "D";
		notes[4] = "E";
		notes[5] = "F";
		notes[6] = "G";
	}

	///Called by DuckConducktor. Only calls sing if the conductor has the same note as this Duck
	public void update(){
		int n=conducktor.getNote();
		if (n%8==(note%8))
			sing();
	}

	private void sing(){
		System.out.println(notes[note%8]);
	}

	public void unsubscribe(){
		conducktor.removeDuck(this);
	}
}

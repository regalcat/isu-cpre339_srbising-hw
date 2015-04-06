/* @author	Steff Bisinger
 * @file	DuckConducktor.java
 * @date	4/2/2015 - created
 * @brief	Class to be observed by a choir of Ducks
 */
 
import java.util.ArrayList;

public class DuckConducktor {
	
	private ArrayList<Duck> choir;

	private int note;

	public DuckConducktor(){
		choir = new ArrayList<Duck>();
		note = -1;
	}
	
	///Changes the state of the DuckConducktor and lets the Ducks in the choir know afterwards
	public void nextNote(int n){
		note=n;
		for(Duck d : choir){
			d.update();
		}
	}

	public void addDuck(Duck d){
		choir.add(d);
	}

	public void removeDuck(Duck d){
		choir.remove(d);
	}

	public int getNote(){
		return note;
	}
}

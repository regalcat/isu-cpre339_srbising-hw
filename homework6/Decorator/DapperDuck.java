/* @author	Steff Bisinger
 * @file	DapperDuck.java
 * @date	4/5/2015
 * @brief	A wrapper for the Duck class that wears a monocle and adds more functionality
 */


public class DapperDuck{
	
	private Duck d;

	public DapperDuck(Duck duck){
		d=duck;
	}

	public String quack(){
		String s = d.quack();
		s+=", my good sir!";
		return s;
	}

	public String dance(){
		String s = d.dance();
		s+="*breakdances*";
		return s;
	}
}

/* @author	Steff Bisinger
 * @file	LeafDuck.java
 * @date	4/5/2015 - created
 * @brief	A Duck that can be a leaf in a tree of Ducks
 */

public class LeafDuck implements AbstractDuck{
	
	public LeafDuck(String n){
		super(n);
	}

	public String quack(){
		return "I am a leaf on the wind.";
	}
}

/* @author	Steff Bisinger
 * @file	AbstractDuck.java
 * @date	4/5/2015 - created
 * @brief	An abstraction of a duck
 */

public interface AbstractDuck{

	private String name;

	public AbstractDuck(String n){
		name=n;
	}

	public String quack();
}

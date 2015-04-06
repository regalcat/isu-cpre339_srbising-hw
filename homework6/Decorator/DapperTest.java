/* @author	Steff Bisinger
 * @file	DapperTest.java
 * @date	4/5/2015 - created
 * @brief	A test of the Duck and DapperDuck classes
 */

public class DapperTest{

	public void main(){
		Duck d = new Duck();
		System.out.println(d.quack());
		System.out.println(d.dance());
		DapperDuck dapper = new DapperDuck(d);
		System.out.println(d.quack());
		System.out.println(d.dance());
		System.out.println(dapper.quack());
		System.out.println(dapper.dance());
	}
}

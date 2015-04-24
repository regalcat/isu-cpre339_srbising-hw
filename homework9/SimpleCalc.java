/* 	@author Steff Bisinger
*	@file	SimpleCalc.java
*	@created	4/23/2015
*	@description	This is a calculator that uses a state machine style approach.
*/


public class SimpleCalc{
	
	private String prevState;
	private String state;

	public SimpleCalc(){
		state = init;
		prevState = NULL;
	}

	private Number addNums(Number x, Number y){
		return a+b;
	}

	private Number subNums(Number x, Number y){
		return a-b;
	}

	private Number multNums(Number x, Number y){
		return a*b;
	}

	private Number divNums(Number x, Number y){
		//TODO: check for dividing by zero and catch it
		return a/b;
	}

	public Number parseEquation(String s){
		while(!state.equals("exit"){
			
		}
	}
}

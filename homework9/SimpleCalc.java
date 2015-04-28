/* 	@author Steff Bisinger
*	@file	SimpleCalc.java
*	@created	4/23/2015
*	@description	This is a calculator that uses a state machine style approach.
*/

import java.util.ArrayList<E>;
import java.lang.Number;

public class SimpleCalc{
	
	private String state;

	public SimpleCalc(){
		state = "oparen";
		prevState = NULL;
	}

	private Number addNums(Number x, Number y){
		Float f = Float(x.floatValue()+y.floatValue());
		return f;
	}

	private Number subNums(Number x, Number y){
		Float f = Float(x.floatValue()-y.floatValue()); 
		return f;
	}

	private Number multNums(Number x, Number y){
		Float f = Float(x.floatValue()*y.floatValue()); 
		return f;
	}

	private Number divNums(Number x, Number y){
		if(y.intValue()==0){
			System.out.println("Error: Cannot divide by zero.");
			return NULL;
		}
		Float f = Float(x.floatValue()/y.floatValue()); 
		return f;
	}

	public Number parseEquation(String s){
		Float answer = NULL;
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(s.split("(?!^)"));
		ArrayList<Float> operands = new ArrayList<Number>();
		ArrayList<String> operators = new ArrayList<String>();
		String s = "";
		int i=0;
		while(!state.equals("exit"){
			if(state.equals("oparen"){
				i=equation.lastIndexOf("(");
				if(i>=0){
				operators.add(equation.get(i));
				equation.remove(i);
				state = "num";
				}
				else if(equation.size()==1){
					state = "exit";
				}
				else{
					i=0;
					state = "num";
				}
			}

			if(state.equals("num"){
				if(isDigit(equation.get(i))){
					s+=equation.get(i);
					equation.remove(i);
					i++;
				}

				if(!isDigit(equation.get(i))){
					if(equation.get(i).equals(")"))
						state = "cparen";
					else
						state = "operator";
					Float f = new Float(s);
					operands.add(f);
				}
			}

			if(state.equals("cparen"){
				
			}
		}
		return equation.get(0);
	}

	private boolean isDigit(String str){
		if(str.matches("?\\d^") || str.matches("?\\.^"))
			return true;
		return false;
	}
}

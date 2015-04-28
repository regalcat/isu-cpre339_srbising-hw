/// @author	Steff Bisinger
///	@file	SimpleCalc.java
///	@created	4/23/2015
///	@description	This is a calculator that uses a state machine style approach.


import java.util.ArrayList<E>;
import java.lang.Number;

public class SimpleCalc{
	
	private String state;
	private ArrayList<String> equation;
	private ArrayList<Float> operands;
	private ArrayList<String> operators;
	private String s;
	private int i;

	public SimpleCalc(){
		state = "init";
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

	///The user calls this to begin the computations on the given equation
	/// @return The Number representing the result of the equation
	public Number parseEquation(String s){
		equation = new ArrayList<String>(Arrays.asList(s.split("(?!^)"));
		operands = new ArrayList<Number>();
		operators = new ArrayList<String>();
		s = "";
		i=0;
		while(!state.equals("exit"){
			if(state.equals("oparen")||state.equals("init")){
				oparenState();
			}

			if(state.equals("num"){
				numState();
			}

			if(state.equals("cparen"){
				cparenState();
			}
			
			if(state.equals("operator"){
				opState();
			}
		}
		return equation.get(0);
	}

	private void oparenState(){
				i=equation.lastIndexOf("(");
				if(i>=0){
				operators.add(equation.get(i));
				equation.remove(i);
				state = "num";
				}
				else if(equation.size()<=1){
					state = "exit";
				}
				else{
					i=0;
					state = "num";
				}
	}
	
	private void numState(){
		if(isDigit(equation.get(i))){
			s+=equation.get(i);
			equation.remove(i);
		}
		if(!isDigit(equation.get(i))){
			if(equation.get(i).equals(")"))
				state = "cparen";
			else
				state = "operator";
			Float f = new Float(s);
			operands.add(f);
			s="";
		}
	}
	
	private void opState(){
		operators.add(equation.get(i));
		equation.remove(i);
		state = "num";
	}
	
	private void cparenState(){
		equation.remove(i);
		if(operands.size()==1)
			equation.add(operands.get(i);
		else{
			int j=operators.size()-1;
			for(j=operators.size()-1, j>=0, j--){
				if(operators.get(j).equals("*")){
					Float f = multNums(operands.get(j), operands.get(j+1));
					operands.remove(j+1);
					operands.remove(j);
					operands.add(j, f);
					operators.remove(j);
				}
				if(operators.get(j).equals("/")){
					Float f = divNums(operands.get(j), operands.get(j+1));
					operands.remove(j+1);
					operands.remove(j);
					operands.add(j, f);
					operators.remove(j);
				}
			}
			for(j=operators.size()-1, j>=0, j--){
				if(operators.get(j).equals("+")){
					Float f = addNums(operands.get(j), operands.get(j+1));
					operands.remove(j+1);
					operands.remove(j);
					operands.add(j, f);
					operators.remove(j);
				}
				if(operators.get(j).equals("-")){
					Float f = subNums(operands.get(j), operands.get(j+1));
					operands.remove(j+1);
					operands.remove(j);
					operands.add(j, f);
					operators.remove(j);
				}
			}
		}
		equation.add(i, operands.get(0));
		operands.removeAll();
		operators.removeAll();
		state = "oparen";
	}
	
	private boolean isDigit(String str){
		if(str.matches("?\\d^") || str.matches("?\\.^"))
			return true;
		return false;
	}
}

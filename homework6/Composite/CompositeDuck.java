/* @author	Steff Bisinger
 *
 */

import ArrayList<E>;

public class CompositeDuck implements AbstractDuck {
	
	private String name;
	private ArrayList<AbstractDuck> children;
	private AbstractDuck parent;

	public CompositeDuck(String n, AbstractDuck p){
		super(n);
		parent = p;
	}

	public String quack(){
		if(children.size()>0)
			for(AbstractDuck d : children)
				return d.quack();
		else
			return "I have no children";
	}

	public void addChild(AbstractDuck d){
		children.add(d);
	}

	public AbstractDuck[] getChildren(){
		AbstractDuck ducks[] = new AbstractDuck[children.size()];
		for (int i=0; i<children.size();i++){
			ducks[i] = children.get(i);
		}
		return ducks;
	}

	public AbstractDuck getParent(){
		return parent;
	}

	public void removeChild(AbstractDuck d){
		children.remove(d);
	}
}

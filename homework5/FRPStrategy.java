
import java.util.ArrayList<E>;

public class FRPStrategy {
	
	
	public int addFRP(ArrayList<Media> m){
		int frp = 0;
		for(int i=0; i<m.size();i++){
			if (m.isNew() && m.getDays()>1)
				frp++;
			frp++;
		}
		return frp;
	}

	public int addFRPAlt1(ArrayList<Media> a){
		int frp=a.size();
		if (a.size()<3)
			return frp;
		boolean kidsMed=false;
		boolean newMed=false;
		boolean regMed=false;
		for(int i=0; i<a.size(); i++){
			Media m = a.get(i);
			if (m.isKids() && !kidsMed)
				kidsMed=true;
			if (m.isNew() && !newMed)
				newMed=true;
			if (m.isReg() && !regMed)
				regMed=true;
		}
		if (kidsMed && newMed && regMed)
			return frp * 2;
		return frp;
	}

	public int addFRPAlt2(ArrayList<Media> a, Customer c){
		int frp = a.size();
		boolean dubs=false;
		for(int i=0; i<a.size(); i++){
			Media m = a.get(i);
			if (m.isNew())
				dubs=true;
		}
		if ((18<=c.getAge()<=22) && dubs)
			return frp * 2;
		return frp;
	}
}

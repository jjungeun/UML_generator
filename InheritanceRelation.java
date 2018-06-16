
import java.util.ArrayList;

public class InheritanceRelation {
	private int totalNumOfInheritance;
	private ArrayList<RelationElement> relation;
	
	public int getInheritancenum(){
		return totalNumOfInheritance;
	}
	public void setInheritancenum(int num){
		totalNumOfInheritance = num;
	}

	public RelationElement getRelationelement(int index){
		return relation.get(index);
	}
	public void addRelationelement(RelationElement element){
		relation.add(element);
	}
	public void setRelationelement(){
		relation = new ArrayList<RelationElement>();
	}
}
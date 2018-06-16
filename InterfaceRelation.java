import java.util.ArrayList;

public class InterfaceRelation {
	private int totalNumOfInteface;
	private ArrayList<RelationElement> relation;
	
	public int getInterfacenum(){
		return totalNumOfInteface;
	}
	public void setInterfacenum(int num){
		totalNumOfInteface = num;
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
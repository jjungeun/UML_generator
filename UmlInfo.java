
import java.util.ArrayList;

public class UmlInfo {
	private int totalNumOfClasses = 0;
	private int totalNumOfInterfaces = 0;
	private ArrayList<ClassInfo> classes;
	private ArrayList<InterfaceInfo> interfaces;
	private ArrayList<InheritanceRelation> inheritanceInfo;
	private ArrayList<InterfaceRelation> interfaceInfo;
	
	public int getClassnum(){
		return totalNumOfClasses;
	}
	public void setClassnum(int num){
		totalNumOfClasses = num;
	}
////////////////////////////////////////
	public int getInterfacenum(){
		return totalNumOfInterfaces;
	}
	public void setInterfacenum(int num){
		totalNumOfInterfaces = num;
	}
////////////////////////////////////////
	public ClassInfo getClassinfo(int index){
		return classes.get(index);
	}
	public void addClassinfo(ClassInfo classinfo){
		classes.add(classinfo);
	}
	public void setClassinfo(){
		classes = new ArrayList<ClassInfo>();
	}
////////////////////////////////////////
	public InterfaceInfo getInterfaceinfo(int index){
		return interfaces.get(index);
	}
	public void addInterfaceinfo(InterfaceInfo interfaceinfo){
		interfaces.add(interfaceinfo);
	}
	public void setInterfaceinfo(){
		interfaces = new ArrayList<InterfaceInfo>();
	}
////////////////////////////////////////
	public InheritanceRelation getInheritanceRealtion(int index){
		return inheritanceInfo.get(index);
	}
	public void addInheritanceRealtion(InheritanceRelation inheritancerelation){
		inheritanceInfo.add(inheritancerelation);
	}
	public void setInheritanceRealtion(){
		inheritanceInfo = new ArrayList<InheritanceRelation>();
	}
////////////////////////////////////////
	public InterfaceRelation getInterfaceRealtion(int index){
		return interfaceInfo.get(index);
	}
	public void addInterfaceRealtion(InterfaceRelation interfacerelation){
		interfaceInfo.add(interfacerelation);
	}
	public void setInterfaceRealtion(){
		interfaceInfo = new ArrayList<InterfaceRelation>();
	}
}

import java.util.ArrayList;

public class InterfaceInfo {
	private int totalNumOfVariables;
	private int totalNumOfMethods;
	private String interfaceName;
	private ArrayList<Variable> variables;
	private ArrayList<Method> methods;
	
	public int getVarinum(){
		return totalNumOfVariables;
	}
	public void setVarinum(int num){
		totalNumOfVariables = num;
	}
	
	public int getMethodnum(){
		return totalNumOfMethods;
	}
	public void setMethodnum(int num){
		totalNumOfMethods = num;
	}
	
	public String getInterfacename(){
		return interfaceName;
	}
	public void setInterfacename(String name){
		interfaceName = name;
	}

	public Variable getVariable(int index){
		return variables.get(index);
	}
	public void addVariable(Variable vari){
		variables.add(vari);
	}
	public void setVariable(){
		variables = new ArrayList<Variable>();
	}

	public Method getMethod(int index){
		return methods.get(index);
	}
	public void addMethod(Method method){
		methods.add(method);
	}
	public void setMethod(){
		methods = new ArrayList<Method>();
	}
}
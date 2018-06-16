
import java.util.ArrayList;

public class ClassInfo {
	int x,y,width,height;
	private int totalNumOfVariables;
	private int totalNumOfMethods;
	private String className;
	private String access;
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
	
	public String getClassname(){
		return className;
	}
	public void setClassname(String classname){
		className = classname;
	}
	
	public String getAccess(){
		return access;
	}
	public void setAccess(String access){
		this.access = access;
	}
	
	public Variable getVarilist(int index){
		return variables.get(index);
	}
	public void addVarilist(Variable variable){
		variables.add(variable);
	}
	public void setVarilist(){
		variables = new ArrayList<Variable>();
	}
	
	public Method getMethodlist(int index){
		return methods.get(index);
	}
	public void addMethodlist(Method method){
		methods.add(method);
	}
	public void setMethodlist(){
		methods = new ArrayList<Method>();
	}
}
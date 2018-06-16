import java.util.ArrayList;

public class Method {
	private String access ;
	private String name;
	private String returnType;
	private int paramNum;
	private ArrayList<formalParameter> formalParameter;
	
	public String getAccess(){
		return access;
	}
	public void setAccess(String access){
		this.access = access;
	}
	
	public String getretType(){
		return returnType;
	}
	public void setretType(String type){
		this.returnType = type;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getParamnum(){
		return paramNum;
	}
	public void setParamnum(int num){
		this.paramNum = num;
	}

	public formalParameter getformalParam(int index){
		return formalParameter.get(index);
	}
	public void addformalParam(formalParameter formalparameter){
		formalParameter.add(formalparameter);
	}
	public void setformalParam(){
		formalParameter = new ArrayList<formalParameter>();
	}
}
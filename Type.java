
import java.util.LinkedList;

public class Type extends BasicElement{

	
	//static blocks
	public static LinkedList<Type> listOfBuildInTypes = new LinkedList<Type>();

	static{
		listOfBuildInTypes.add(new Type("int", true)); //0
		listOfBuildInTypes.add(new Type("void", true)); //1
		listOfBuildInTypes.add(new Type("boolean", true)); //2
		listOfBuildInTypes.add(new Type("", true)); //3
		listOfBuildInTypes.add(new Type("INT_ARR", true)); //4
		listOfBuildInTypes.add(new Type("STR_ARR", true)); //5
	}
	
	
	//normal non-static blocks
	
	private boolean isBuildInType;
	
	public Type(String name1, boolean isBuildIn) {
		super(name1);
		this.isBuildInType = isBuildIn;
	}
	
	
	
    public static Type getTypeByName(String name) {
        switch (name) {
            case "int":
                return Type.listOfBuildInTypes.get(0);
            case "void":
                return Type.listOfBuildInTypes.get(1);
            case "boolean":
                return Type.listOfBuildInTypes.get(2);
            case "":
                return Type.listOfBuildInTypes.get(3);
            case "int[]":
            case "INT_ARR":
                return Type.listOfBuildInTypes.get(4);
            case "String []":
            case "STR_ARRAY":
                return Type.listOfBuildInTypes.get(5);    
            default:
            	//create a new custom type
                return new Type(name, false);
        }
    }


	public boolean isBuildInType() {
		return isBuildInType;
	}
	

	@Override
	public String toString() {
		if(this.getName().equals(Type.listOfBuildInTypes.get(4).getName()))
    		return "int []";
    	if(this.getName().equals(Type.listOfBuildInTypes.get(5).getName()))
    		return "String []";
    	return this.getName();
	}

	@Override
	public boolean equals(Object obj) {
		
		Type typeRef = (Type)obj;
		
		if(typeRef.getName().equalsIgnoreCase(this.getName()))
			return true;
		return false;
	}
}

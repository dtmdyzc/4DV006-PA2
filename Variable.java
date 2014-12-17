
public class Variable extends BasicElement {

	private Type type;
	
	public Variable(String name1, Type type1) {
		super(name1);
		this.type = type1;
	}
	
	public Variable(Type type1){
		super("");
		this.type = type1;
	}
	
	public Variable(String name1){
		super(name1);
		this.type = Type.listOfBuildInTypes.get(1);
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void print(Margin margin){
		System.out.println(margin.getMarginString() + this.getType().toString() + " " + this.getName());
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
}

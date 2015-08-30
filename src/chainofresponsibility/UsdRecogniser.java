package chainofresponsibility;

/**
 * developed by BURHAN ARAS
 */
public abstract class UsdRecogniser {
	protected UsdRecogniser next;
	protected int value;
	
	public int recognise(int value) {
		if(value == this.getValue()){
			System.out.println("Money is recognised.It's "+ this.getValue()+" USD.");
			return getValue();
		}else{
			if(this.getNext() != null){
				return next.recognise(value);
			}else{
				System.out.println("This money is not valid.");
				return 0;
			}
		}
		
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public UsdRecogniser getNext() {
		return next;
	}
	public void setNext(UsdRecogniser next) {
		this.next = next;
	}

}

package lecture_39;

public class Abstract_Demo_Child extends Abstract_Demo {


	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int No_Item() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_Demo_Child ab = new Abstract_Demo_Child();
//		Abstract_Demo ab = new Abstract_Demo_Child();     this is also right
		ab.payment();
	}

}

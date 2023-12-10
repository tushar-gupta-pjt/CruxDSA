package lecture_39;

public abstract class Abstract_Demo {
	
	public abstract void payment();
	
	public void ViewItem() {
		
	}
	
	public abstract int No_Item();
	
	public static void main(String[] args) {
		Abstract_Demo ad = new Abstract_Demo() {                      // one way to make object of abstract class , feature introduced in java 8

			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int No_Item() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}

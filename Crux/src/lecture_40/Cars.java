package lecture_40;

public class Cars implements Comparable<Cars>{
	
	int price;
	int speed;
	String color;
	
	public Cars() {
		
	}
	
	public Cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	
	}
	
	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C: " + this.color;
	}

	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		//return this.price - o.price;                                                //ascending order me aayega price ke liye
		//return o.speed - this.speed;                                                  //descending order me aayega price ke liye
		return this.color.compareTo(o.color);                                         // string khud ek class hai, toh compare to use hoga
	}
}

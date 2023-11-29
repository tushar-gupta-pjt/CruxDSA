package lecture_29;

public class Student {
	private String name = "Kaju";
	private int age = 17;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) throws Exception  {                        // this was one way to generate and throw exception
//		
//		if(age<0) {
//			throw new Exception("Age is invalid");
//		}
//		this.age = age;
//	}
	
	public void setAge(int age)  {
			try {
			if(age<0) {
				throw new Exception("Age is invalid");
			}
			this.age = age;
			}
			catch (Exception e) {
				// Handle exception
				e.printStackTrace();
			}
			finally {
				System.out.println("I am in finally block");
			}
		}
	
	

}

package lecture_28;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Kaju";
		s1.age=19;
		s1.Intro_yourself();
		Student s2=new Student();
		s2.name="kamlesh";
		s2.age=18;
		s2.Intro_yourself();
		
		s2.SayHey("Ramu");
	}

}

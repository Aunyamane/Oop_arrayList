public class stMain{
	public static void main(String[] args) {
		Student st1 = new Student("149","Khim",3.99);
		Student st2 = new Student("148","Numph",1.23);
		Student st3 = new Student("150","kk",2.50);

		StudentList stl1 = new StudentList();
		stl1.addStudent(st1);
		stl1.addStudent(st2);
		stl1.addStudent(st3);

		stl1.showAllStudentInfo();

		stl1.removeStudentBystCode("150");
		stl1.showAllStudentInfo();

		int f;
		f = stl1.searchStudentBystCode("150");
		if(f==-1){
			System.out.println("Not found");
		}

		int num;
		num = stl1.getNumberOfStudent();
			System.out.println(num);
	}

}
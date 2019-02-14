import java.util.*;

public class StudentList{
	private ArrayList<Student> stList;
	public StudentList(){
		stList = new ArrayList<Student>();
	}
	public void addStudent(Student student){
		stList.add(student);
	}
	public void removeStudentBystCode(String stCode){
		int i;
		for(i=0;i<stList.size();i++){
			if(stList.get(i).getCode()==stCode){
				stList.remove(i);
			}
		}
	}
	public void showAllStudentInfo(){
		int i;
		for(i=0;i<stList.size();i++){
			System.out.println(stList.get(i).toString());
		}
	}
	public int searchStudentBystCode(String stCode){
		int i;
		for(i=0;i<stList.size();i++){
			if(stList.get(i).getCode()==stCode){
				System.out.println(stList.get(i).toString());
				return i;
			}
		}
		return -1;
	}
	public int getNumberOfStudent(){
		return stList.size();
	}
}
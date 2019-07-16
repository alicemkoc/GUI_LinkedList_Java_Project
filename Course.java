import java.util.ArrayList;


public class Course {
	private String cName;
	private ArrayList<Student> students= new ArrayList<>();
	public int getSize(){
		return students.size();
	}
	public String getCName(){
		return cName;
	}
	
	public Course(){
		cName="None";
	}
	public Course(String name){
		cName=name;
	}
	private boolean isMember(Student s){
		for(Student a:students)
			if(a.getNameSurname().equals((s.getNameSurname())))
				return true;
		return false;
	}
	public void addStudent(Student s){
		if(!isMember(s))
			students.add(s);
	}
	public ArrayList<Student> getStudents(){
		return students;
	}
}

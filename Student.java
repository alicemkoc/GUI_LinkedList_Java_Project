
public class Student {
	private String nameSurname;
	private int classNo;
	private String deptCode;
	private char gender;
	public Student(String nameSurname, int classNo, String deptCode, char gender) {
		super();
		this.nameSurname = nameSurname;
		this.classNo = classNo;
		this.deptCode = deptCode;
		this.gender = gender;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Student){
			Student s=(Student)o;
			return (this.nameSurname.equals(s.nameSurname));
		}
		return false;
	}
	

}

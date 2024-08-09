package oops;

class Testing{
	private int studentid;
	private String studentname;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
		
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t=new Testing();
		t.setStudentid(100);
		System.out.println(t.getStudentid());
		t.setStudentname("Anjitha");
		System.out.println(t.getStudentname());

	}

}

package week3.day1;

public class Students {
	
	public void getStudentsInfo() {
		System.out.println("Empty Argument");

	}
	
	public void getStudentsInfo(int studentID) {
		System.out.println("Student ID is " +studentID );

	}
	
	public void getStudentsInfo(String studentName) {
		System.out.println("Student Name is " +studentName );

	}
	
	public void getStudentsInfo(String studentName, int studentID) {
		System.out.println("Name: " + studentName + " and ID " +studentID );

	}
	
	public void getStudentsInfo( int studentID,String studentNam) {
		System.out.println("ID is " + studentID +"  and Name " + studentNam);

	}
	
	public static void main(String[] args) {
		Students obj =new Students(); 
		obj.getStudentsInfo();
		obj.getStudentsInfo(123);
		obj.getStudentsInfo("Lakshmi");
		obj.getStudentsInfo(456, "Mohan");
		obj.getStudentsInfo("LakshmiMohan", 789);
	}

}

package model;
// Generated 2020�~11��9�� �U��2:48:10 by Hibernate Tools 5.4.21.Final

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private String studentId;
	private String name;
	private String address;

	public Student() {
	}

	public Student(String studentId, String name, String address) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

package com.jdbc.to;

import java.util.Date;

public class Student {
	private int studentId;
	private String studentName;
	private String localAddress,permanentAddress;
	private int age;
	private String parentName;
	private String boardName12th;
	private int percent12th;
	private String rollNo12th;
	boolean CS201,CS203,CS303,IT301,IT303,HS101;
	boolean CS206,EC201,HS201,MA201,MA301,MA101;
	private String otherCourses,familyIncome;
	private String degree;
	private int currentSem;
	private String fatherOcc,motherOcc;
	private String highestQualification;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	public String getBoardName12th() {
		return boardName12th;
	}
	public void setBoardName12th(String boardName12th) {
		this.boardName12th = boardName12th;
	}
	
	public int getPercent12th() {
		return percent12th;
	}
	public void setPercent12th(int percent12th) {
		this.percent12th = percent12th;
	}
	
	public String getRollNo12th() {
		return rollNo12th;
	}
	public void setrollNo12th(String rollNo12th) {
		this.rollNo12th = rollNo12th;
	}
	
	public String getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public int getCurrentSem() {
		return currentSem;
	}
	public void setCurrentSem(int currentSem) {
		this.currentSem = currentSem;
	}
	
	public String getFatherOcc() {
		return fatherOcc;
	}
	public void setFatherOcc(String fatherOcc) {
		this.fatherOcc = fatherOcc;
	}
	
	public String getMotherOcc() {
		return motherOcc;
	}
	public void setMotherOcc(String motherOcc) {
		this.motherOcc = motherOcc;
	}
	
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	
	public boolean getCS201() {
		return CS201;
	}
	public void setCS201(boolean CS201) {
		this.CS201 = CS201;
	}
	
	public boolean getCS203() {
		return CS203;
	}
	public void setCS203(boolean CS203) {
		this.CS203 = CS203;
	}
	
	public boolean getCS303() {
		return CS303;
	}
	public void setCS303(boolean CS303) {
		this.CS303 = CS303;
	}
	
	public boolean getCS206() {
		return CS206;
	}
	public void setCS206(boolean CS206) {
		this.CS206 = CS206;
	}
	
	public boolean getMA101() {
		return MA101;
	}
	public void setMA101(boolean MA101) {
		this.MA101 = MA101;
	}
	
	public boolean getMA201() {
		return MA201;
	}
	public void setMA201(boolean MA201) {
		this.MA201 = MA201;
	}
	
	public boolean getMA301() {
		return MA301;
	}
	public void setMA301(boolean MA301) {
		this.MA301 = MA301;
	}
	
	public boolean getIT301() {
		return IT301;
	}
	public void setIT301(boolean IT301) {
		this.IT301 = IT301;
	}
	
	public boolean getIT303() {
		return IT303;
	}
	public void setIT303(boolean IT303) {
		this.IT303 = IT303;
	}
	
	public boolean getHS101() {
		return HS101;
	}
	public void setHS101(boolean HS101) {
		this.HS101 = HS101;
	}

	public boolean getHS201() {
		return HS201;
	}
	public void setHS201(boolean HS201) {
		this.HS201 = HS201;
	}
	
	public boolean getEC201() {
		return EC201;
	}
	public void setEC201(boolean EC201) {
		this.EC201 = EC201;
	}
	
	
	@Override
	public String toString() {
	return "Student [studentId=" + studentId + ",Name=" + studentName + ",local Address=" + localAddress + "\npermanent Address=" + permanentAddress + ",age=" + age + ",Parent Name=" + parentName + "\nBoard Name=" + boardName12th + ",Percent=" + percent12th + ",Roll No.=" + rollNo12th + ",FamilyIncome=" + familyIncome + "/nDegree=" + degree + ",Current Sem." + currentSem + ",Father's Occ.=" + fatherOcc + ",Mother Occ.=" + motherOcc + ",Highesest Qualification=" + highestQualification +"]";	
	}
	
	
}        

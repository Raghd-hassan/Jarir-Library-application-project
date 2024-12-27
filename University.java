package university;
public class University {
String universtiyName;
University(String universityName){
    this.universtiyName=universityName;
}

    public String getUniverstiyName() {
        return universtiyName;
    }
 static class Department{
    String departmentName;
    int departmentProgram;

 Department(String departmentName,int departmentProgram){
     this.departmentName=departmentName;
     this.departmentProgram=departmentProgram;
 }
 void printStudentInformation(String StudentName, int StudentProgram){
     System.out.println("Student Name : "+ StudentName);
     System.out.println("Student Program : "+ StudentProgram);
 }
 }
 
  static class Deanship{
    String deanshipName;
    
 Deanship(String deanshipName){
     this.deanshipName=deanshipName;
 }
 void printStudentInformation(String StudentName){
     System.out.println("Student Name : "+ StudentName);
 }
 }
 
  class Student {
      String studentName;
      String studentID;
      double studentGBA;
      Student( String studentName,String studentID,double studentGBA){
          this.studentName=studentName;
          this.studentID=studentID;
          this.studentGBA=studentGBA;      
      }
       void printStudentInformation(String departmentName,String studentID ,double studentGPA){
     System.out.println("Department Name : "+ departmentName);
     System.out.println("Student ID : "+ studentID);
     System.out.println("Student GPA :"+ studentGPA);
     
 }
  }
  class facuItyMember{
      String memberName;
      String memberMajor;
      String memberDagree;
    facuItyMember(String memberName,String memberMajor,String memberDagree){
        this.memberName=memberName;
        this.memberMajor=memberMajor;
        this.memberDagree=memberDagree;        
  }
  void printMemberInformation(String memberName,String memberMajor,String memberDagree){
      System.out.println("Member Name : "+ memberName);
      System.out.println("Member Major : "+ memberMajor);
      System.out.println("Member Dagree : "+ memberDagree);
  }}
    public static void main(String[] args) {
      University university=new University("UMM AL-QURA University");
     System.out.println(university.getUniverstiyName()); 
     
      Department department=new Department("Computer Sciences",2113);
      department.printStudentInformation("Raghad", 2113);
      
      Deanship deanship=new Deanship("Admission and Registration");
      deanship.printStudentInformation("Maram Hassan ");
      
      University.Student student=university.new Student("Manal","135246",4.5);
      student.printStudentInformation("Mathematics","135246",4.5);
      
      University.facuItyMember FacuItyMember=university.new facuItyMember("D.Joud","680975","ph.D");
      FacuItyMember.printMemberInformation("D.Joud", " medicine", "ph.D");
    }}
    


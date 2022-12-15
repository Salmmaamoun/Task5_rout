
package pro1;

import pro1.Persom;

public class Student extends Persom{
    private int numCourse;
    private String []Courses;
    private int []grades;

    public Student(String name,String address) {
        super(name,address);
        this.numCourse = 0;
        this.Courses = new String[10];
        this.grades = new int[10];
        
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public String[] getCourses() {
        return Courses;
    }

    public void setCourses(String[] Courses) {
        this.Courses = Courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    
    public void addCourseGrade(String course,int grade){
        Courses[numCourse]=course;
        grades[numCourse]=grade;
        numCourse++;
    }
    public double getAverageGrade(){
        int sum=0;
        for (int i = 0; i < numCourse; i++) {
            sum=+grades[i];
            
        }
        return sum/numCourse;
    }
    public void printGrade(){
        for (int i = 0; i < numCourse; i++) {
            System.out.print(grades[i]+" ");
            
        }
        System.out.println("");
    }
    
    
}

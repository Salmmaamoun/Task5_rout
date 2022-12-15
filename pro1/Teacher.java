package pro1;

import pro1.Persom;

public class Teacher extends Persom {

    int numCourse = 0;
    String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[10];

    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourse; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                return false;
            }
        }
        courses[numCourse]=course;
        numCourse++;
        return true;
    }
    
    public boolean removeCourse(String course){
        int i;
        for ( i = 0; i < courses.length; i++) {
            String course1 = courses[i];
              if (courses[i].equalsIgnoreCase(course)) {
                break;
            }
        }
        if(i==numCourse){
            return false;
        }else{
            for (int j = i; j <numCourse; j++) {
                courses[j]=courses[j+1];
            }
            numCourse--;
            return  true;
        }
    }
    

}

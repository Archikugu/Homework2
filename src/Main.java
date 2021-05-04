
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ", "Programlama Mantığı ");

		Course course2 = new Course(2, "Yazılım Geliştirici Kampı", "Engin Demiroğ", " C# + Angular ");

		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Yazılım Geliştirici Kampı ";
		course3.instructor = "Engin Demiroğ";
		course3.detail = "Java + React ";

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.name + course.detail + course.instructor);

		}
		System.out.println("Kurs Sayısı: "+courses.length);
		System.out.println("-----------------------------------------------------------");
		
		Students student1= new Students(1,"Gökhan","Gök");
		Students student2= new Students(2,"Gökhan","Gök");
		
	    Students[]students= {student1,student2};
	    
	    for (Students student : students) {
			System.out.println("Öğrenci ismi "+ student.name+student.lastname );
		}
	    System.out.println("Öğrenci Sayısı "+students.length);
	    System.out.println("-----------------------------------------------------------");
	    
	    
	    StudentsManager studentsManager =new StudentsManager();
	    studentsManager.addToStudent(student1);
	    studentsManager.deleteStudent(student1);
	    
	    System.out.println("-----------------------------------------------------------");
	    
	    
	    CourseManager courseManager= new CourseManager();
	    courseManager.addToCourse(course3);
	    courseManager.deleteCourse(course1);
	    courseManager.uploadCourse(course2);
	    
	    
	

	}

}

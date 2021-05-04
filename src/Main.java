
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�", "Programlama Mant��� ");

		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Kamp�", "Engin Demiro�", " C# + Angular ");

		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Yaz�l�m Geli�tirici Kamp� ";
		course3.instructor = "Engin Demiro�";
		course3.detail = "Java + React ";

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.name + course.detail + course.instructor);

		}
		System.out.println("Kurs Say�s�: "+courses.length);
		System.out.println("-----------------------------------------------------------");
		
		Students student1= new Students(1,"G�khan","G�k");
		Students student2= new Students(2,"G�khan","G�k");
		
	    Students[]students= {student1,student2};
	    
	    for (Students student : students) {
			System.out.println("��renci ismi "+ student.name+student.lastname );
		}
	    System.out.println("��renci Say�s� "+students.length);
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

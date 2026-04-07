class University 
{
//properties
    String universityName;
    String location;
    int numberOfStudents;
    int numberOfProfessors;
    String chancellor;
    double fee;
    String accreditation;
    boolean hasLibrary;
    boolean hasHostel;
    int establishedYear;

    static String country = "India";
    static String type = "Education";

//behaviour
    public String conductLecture(String subject)
	{ 
		System.out.println("Lecture: "+subject); 
		return subject;
	}
    public int admitStudent(int count)
	{ 
		System.out.println("Admitted: "+count); 
		return count;
	}
    public String assignProfessor(String name)
	{ 
		System.out.println("Professor: "+name); 
		return name; 
	}
    public double collectFee(double fee)
	{ System.out.println("Fee: "+fee); 
	return fee; 
	}
    public boolean openLibrary(boolean status)
	{ 
		System.out.println("Library: "+status);
		return status; 
	}
    public boolean conductExam(boolean status)
	{ 
		System.out.println("Exam: "+status); 
		return status; 
	}
    public String announceHoliday(String holiday)
	{
		System.out.println("Holiday: "+holiday);
		return holiday;
	}
    public int totalStudents(int count)
	{ 
		System.out.println("Students: "+count); 
		return count; 
	}
    public String organizeEvent(String event)
	{ 
		System.out.println("Event: "+event); 
		return event; 
	}
    public boolean maintainDiscipline(boolean status)
	{ 
		System.out.println("Discipline: "+status);
		return status; 
	}
}
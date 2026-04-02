class HospitalRunner
{
	public static void main(String[] args)
	{
		Hospital h1 = new Hospital("Apollo Hospital","Dr. Ramesh","Bangalore","Apollo Group","Multi-Speciality");
		h1.displayHospitalDetails();
		
		Hospital h2 = new Hospital("Fortis Hospital","Dr. Meena","Chennai","Fortis Ltd","Private");
		h2.displayHospitalDetails();
		
		Hospital h3 = new Hospital("Manipal Hospital","Dr. Suresh","Bangalore","Manipal Group","Multi-Speciality");
		h3.displayHospitalDetails();
		
		Hospital h4 = new Hospital("Narayana Health","Dr. Anil","Hyderabad","Narayana Group","Cardiac");
		h4.displayHospitalDetails();
		
		Hospital h5 = new Hospital("Aster Hospital","Dr. Priya","Kochi","Aster DM Healthcare","Private");
		h5.displayHospitalDetails();
		
		Hospital h6 = new Hospital("KIMS Hospital","Dr. Reddy","Hyderabad","KIMS Group","Multi-Speciality");
		h6.displayHospitalDetails();
		
		Hospital h7 = new Hospital("Global Hospital","Dr. Vinay","Mumbai","Global Group","Speciality");
		h7.displayHospitalDetails();
		
		Hospital h8 = new Hospital("Rainbow Hospital","Dr. Kavya","Bangalore","Rainbow Group","Children");
		h8.displayHospitalDetails();
		
		Hospital h9 = new Hospital("Columbia Asia","Dr. Arjun","Pune","Columbia Group","Private");
		h9.displayHospitalDetails();
		
		Hospital h10 = new Hospital("Care Hospital","Dr. Nikhil","Delhi","Care Group","General");
		h10.displayHospitalDetails();
	}
}
package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions

	//Map<String, String> database = new HashMap <>();
	private final Map<String, Student> database;
	public UniversityDatabase() {
		this.database=null;
	}

	public void addStudent(String accountName, Student student) {
		database.put(accountName,student);
		// TODO
	}

	public int getStudentCount() {
		int size= database.size();
		// TODO
		return size;
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		Student s = database.get(accountName);
		if(s!=null) {
			return s.getFullName();
			//return getFul;
		}
		else{
			return null;

		}
	}

	public double getTotalBearBucks() {
		// TODO
		for (String name : database.keySet()) {
			if(database.get(name)!=null) {
				
				return database.get(name).getBearBucksBalance();
				//return getFul;
			}
			else{
				return 0;

			}
		}
		return 0;
		/*
		for(int i=0; i<database.size();i++) {
		Student s = database.get(i);
		if(s!=null) {
			return s.getBearBucksBalance();
			//return getFul;
		}
		else{
			return 0;

		}
		}
		//return 0.0;
		 * */
		 
	}
}

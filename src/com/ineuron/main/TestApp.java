package com.ineuron.main;

import com.ineuron.bean.Branch;
import com.ineuron.bean.Students;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch branch = new Branch("SDE", "G7ds");
		
		Students s1= new Students("sagar", "s17", branch);
		Students s2= new Students("jams", "j47", branch);
		Students s3= new Students("gosling", "g12", branch);
		
//		Students[] student = new Students[3];
//		
//		student[0]=s1;
//		student[1]=s2;
//		student[2]=s3;
		
		
		
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		
	}

}

package com.ineuron.bean;

public class Students {
	
	private String sName;
	private String sId;
	Branch branch;
	
	
	public Students(String sName, String sId, Branch branch) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.branch = branch;
	}
	
	
   


	public void getStudentDetails() {
    	
    	System.out.println("Student details:");
    	
    	System.out.println("Student name::" + sName);
    	System.out.println("Student Id::" + sId);
    	System.out.println("Student BranchName::"+ branch.bName);
    	System.out.println("Student BranchId ::"+ branch.bId);
    	System.out.println();
    	
    }

}

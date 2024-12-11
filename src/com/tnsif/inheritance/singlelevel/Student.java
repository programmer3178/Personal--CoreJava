package com.tnsif.inheritance.singlelevel;

/**
 * @author sys
 */
public class Student extends Citizen {

    private int usn;
    private String collegename;

    public Student() {
    }

    public Student(String name, long aadharNo, String city, long phNo, int usn, String collegename) {
        super(name, aadharNo, city, phNo);
        this.usn = usn;
        this.collegename = collegename;
    }

    Student(String shriteja, int i, String bangalore, long l, String sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    @Override
    public String toString() {
        return "Student[" + "usn=" + usn + ", collegename=" + collegename + ",Name="+getName()+ ",AadharNo="+getAadharNo()+ ",city="+getCity()+ ",PhoneNo="+getPhNo()+']';
    }

}

package afs.api.RESTProject.cxfrestservice.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="school")
public class School {

	private Long id;
	private String schoolName;
	private String address;
	private ArrayList<Award> listOfAwards;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Award> getListOfAwards() {
		return listOfAwards;
	}
	public void setListOfAwards(ArrayList<Award> listOfAwards) {
		this.listOfAwards = listOfAwards;
	}
	
}

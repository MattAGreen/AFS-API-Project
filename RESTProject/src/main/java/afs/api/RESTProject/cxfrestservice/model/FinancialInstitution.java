package afs.api.RESTProject.cxfrestservice.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="financialInstitution")
public class FinancialInstitution {

	private Long id;
	private String fIName;
	private String fIAdresss;
	private ArrayList<Grant> listOfGrants;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfIName() {
		return fIName;
	}
	public void setfIName(String fIName) {
		this.fIName = fIName;
	}
	public String getfIAdresss() {
		return fIAdresss;
	}
	public void setfIAdresss(String fIAdresss) {
		this.fIAdresss = fIAdresss;
	}
	public ArrayList<Grant> getListOfGrants() {
		return listOfGrants;
	}
	public void setListOfGrants(ArrayList<Grant> listOfGrants) {
		this.listOfGrants = listOfGrants;
	}
	
	
	
}

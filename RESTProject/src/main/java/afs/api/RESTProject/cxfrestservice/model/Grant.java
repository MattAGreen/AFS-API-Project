package afs.api.RESTProject.cxfrestservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="grant")
public class Grant {

	private Long id;
	private String grantName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrantName() {
		return grantName;
	}
	public void setGrantName(String grantName) {
		this.grantName = grantName;
	}
	public Long getGrantAmount() {
		return grantAmount;
	}
	public void setGrantAmount(Long grantAmount) {
		this.grantAmount = grantAmount;
	}
	public Long getSchoolOwnerId() {
		return schoolOwnerId;
	}
	public void setSchoolOwnerId(Long schoolOwnerId) {
		this.schoolOwnerId = schoolOwnerId;
	}
	private Long grantAmount;
	private Long schoolOwnerId;
	
	
}

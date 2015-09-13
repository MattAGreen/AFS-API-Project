package afs.api.RESTProject.cxfrestservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="award")
public class Award {
	
	private Long id;
	private String awardName;
	private Long awardAmount;
	private Long awardOwner;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAwardName() {
		return awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}
	public Long getAwardAmount() {
		return awardAmount;
	}
	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}
	public Long getAwardOwner() {
		return awardOwner;
	}
	public void setAwardOwner(Long awardOwner) {
		this.awardOwner = awardOwner;
	}
	
	
}

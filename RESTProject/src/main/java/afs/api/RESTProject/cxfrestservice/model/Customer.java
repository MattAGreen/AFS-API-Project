package afs.api.RESTProject.cxfrestservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="customer")
public class Customer {
	
	private Long id;
	private String customerName;
	private String address;
	private boolean hasAward;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isHasAward() {
		return hasAward;
	}
	public void setHasAward(boolean hasAward) {
		this.hasAward = hasAward;
	}

}

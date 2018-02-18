package corp.telecomservice.model;

import org.springframework.stereotype.Component;

public class PhoneAccount {
	private long phoneAccountId;
	private String firstName;
	private String lastName;
	private PlanType planType;

	public long getPhoneAccountId() {
		return phoneAccountId;
	}

	public void setPhoneAccountId(long phoneAccountId) {
		this.phoneAccountId = phoneAccountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PlanType getPlanType() {
		return planType;
	}

	public void setPlanType(PlanType planType) {
		this.planType = planType;
	}

}

package corp.telecomservice.model;

public class PhoneAccountModel {
	
	private long phoneAccountId;
	
	private String planType;
	
	private int availableMinutes;
	
	private int numberOfConnection;

	public PhoneAccountModel() {
		// no-ope
	}

	public long getPhoneAccountId() {
		return phoneAccountId;
	}

	public void setPhoneAccountId(long phoneAccountId) {
		this.phoneAccountId = phoneAccountId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public int getAvailableMinutes() {
		return availableMinutes;
	}

	public void setAvailableMinutes(int availableMinutes) {
		this.availableMinutes = availableMinutes;
	}

	public int getNumberOfConnection() {
		return numberOfConnection;
	}

	public void setNumberOfConnection(int numberOfConnection) {
		this.numberOfConnection = numberOfConnection;
	}
}

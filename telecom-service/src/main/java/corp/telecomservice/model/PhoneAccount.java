package corp.telecomservice.model;

public class PhoneAccount {
	private long phoneAccountId;
	private PlanType planType;
	private int availableMinutes;
	private int numberOfConnection;

	public PhoneAccount(long phoneAccountId, PlanType planType, int availableMinutes, int numberOfConnection) {
		super();
		this.phoneAccountId = phoneAccountId;
		this.planType = planType;
		this.availableMinutes = availableMinutes;
		this.numberOfConnection = numberOfConnection;
	}

	public long getPhoneAccountId() {
		return phoneAccountId;
	}

	public void setPhoneAccountId(long phoneAccountId) {
		this.phoneAccountId = phoneAccountId;
	}

	public PlanType getPlanType() {
		return planType;
	}

	public void setPlanType(PlanType planType) {
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

package corp.telecomservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE_ACCOUNT")
public class PhoneAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PH_ACC_ID")
	private long phoneAccountId;

	@Enumerated(EnumType.STRING)
	@Column(name = "PLAN_TYPE", unique = true)
	private PlanType planType;

	@Column(name = "AVAILABLE_MINUTES", nullable = false)
	private int availableMinutes;

	@Column(name = "NO_OF_CONNECTION", nullable = false)
	private int numberOfConnection;

	public PhoneAccount() {
		// no-ope
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

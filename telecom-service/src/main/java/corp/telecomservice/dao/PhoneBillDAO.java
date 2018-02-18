package corp.telecomservice.dao;

import org.springframework.stereotype.Component;

import corp.telecomservice.utility.DBUtility;

@Component
public class PhoneBillDAO {

	public double getGoldPlanRate() {
		return DBUtility.GOLD_PLAN_RATE;
	}

	public double getSilverPlanRate() {
		return DBUtility.SILVER_PLAN_RATE;
	}

	public double getGoldPlanRateAddtionalLine() {
		return DBUtility.GOLD_PLAN_RATE_ADDTIONAL_LINE;
	}

	public double getSilverPlanRateAdditionalLine() {
		return DBUtility.SILVER_PLAN_RATE_ADDITIONAL_LINE;
	}
}

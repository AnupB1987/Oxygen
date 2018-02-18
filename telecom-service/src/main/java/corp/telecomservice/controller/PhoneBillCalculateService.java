package corp.telecomservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corp.telecomservice.dao.PhoneBillDAO;
import corp.telecomservice.exeption.InvalidAdditionalLineException;
import corp.telecomservice.exeption.PlanNotFoundExeption;
import corp.telecomservice.model.PlanType;

@Service
public class PhoneBillCalculateService {
	@Autowired
	private PhoneBillDAO phoneBillDAO;

	public double getPlanRate(PlanType planType) throws PlanNotFoundExeption {
		if (planType.equals(PlanType.GOLD)) {
			return phoneBillDAO.getGoldPlanRate();
		} else if (planType.equals(PlanType.SILVER)) {
			return phoneBillDAO.getSilverPlanRate();
		} else {
			throw new PlanNotFoundExeption("Not a valid plan");
		}
	}

	public double getPlanRate(PlanType planType, int additionalLines)
			throws PlanNotFoundExeption, InvalidAdditionalLineException {
		if (additionalLines < 3) {
			if (planType.equals(PlanType.GOLD)) {
				return phoneBillDAO.getGoldPlanRate() + (additionalLines * phoneBillDAO.getGoldPlanRateAddtionalLine());
			} else if (planType.equals(PlanType.SILVER)) {
				return phoneBillDAO.getSilverPlanRate()
						+ (additionalLines * phoneBillDAO.getSilverPlanRateAdditionalLine());
			} else {
				throw new PlanNotFoundExeption("Not a valid plan");
			}
		} else {
			throw new InvalidAdditionalLineException("Not a valid  additional line");
		}
	}

	private void calculateDiscount() {

	}
}

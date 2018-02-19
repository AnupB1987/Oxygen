package corp.telecomservice.service;

import org.springframework.stereotype.Service;

import corp.telecomservice.exeption.PlanNotFoundExeption;
import corp.telecomservice.model.PhoneAccount;
import corp.telecomservice.model.PlanType;

@Service
public class PhoneBillCalculateService {

	public double getPhoneBill(PhoneAccount phoneAccount) throws PlanNotFoundExeption {
		if (phoneAccount.getPlanType().equals(PlanType.GOLD)) {
			return 49.95;
		} else if (phoneAccount.getPlanType().equals(PlanType.SILVER)) {
			return 29.95;
		} else {
			throw new PlanNotFoundExeption("Not a valid plan");
		}
	}

}

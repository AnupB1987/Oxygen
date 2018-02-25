package corp.telecomservice.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import corp.telecomservice.entity.PhoneAccount;
import corp.telecomservice.entity.PlanType;
import corp.telecomservice.exeption.PlanNotFoundExeption;

public class PhoneBillCalculateServiceTest {
	private PhoneBillCalculateService service;

	@Before
	public void startUp() {
		service = new PhoneBillCalculateService();
	}

	// Expected 49.95 with gold plan
	@Test
	public void testGetPhoneBill_GoldPlan() throws PlanNotFoundExeption {
		Assert.assertEquals("Exptected", 49.95, service.getPhoneBill(new PhoneAccount(1, PlanType.GOLD, 900, 1)), 0.01);
	}

	// Expected 29.95 with gold plan
	@Test
	public void testGetPhoneBill_SilverPlan() throws PlanNotFoundExeption {
		Assert.assertEquals("Expected", 29.95, service.getPhoneBill(new PhoneAccount(3, PlanType.SILVER, 999, 3)),
				0.01);
	}
}

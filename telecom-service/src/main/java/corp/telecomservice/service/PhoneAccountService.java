package corp.telecomservice.service;

import java.util.List;

import corp.telecomservice.model.PhoneAccountModel;

public interface PhoneAccountService {

	// throw any custom exceptions
	public PhoneAccountModel getPhoneAccountByPlanType(String planType);
	public void saveAccountByPlanType(PhoneAccountModel model);
	public List<PhoneAccountModel> getPhoneAccountByMaxConnection(String maxConn);
}

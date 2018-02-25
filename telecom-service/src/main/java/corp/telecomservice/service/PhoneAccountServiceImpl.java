package corp.telecomservice.service;

import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import corp.telecomservice.controller.WelcomeController;
import corp.telecomservice.entity.PhoneAccount;
import corp.telecomservice.entity.PlanType;
import corp.telecomservice.model.PhoneAccountModel;
import corp.telecomservice.repository.PhoneAccountRepository;

/**
 * @author Sud
 * add ur logic, I have only focus on Spring Data
 */
@Service
public class PhoneAccountServiceImpl implements PhoneAccountService {

	private static final Logger LOGGER = Logger.getLogger(WelcomeController.class);
	
	@Autowired
	private PhoneAccountRepository repository;
	
	/* 
	 * add ur logic, I have only focus on Spring Data
	 */
	@Transactional(readOnly=true)
	@Override
	public PhoneAccountModel getPhoneAccountByPlanType(String planType) {
		try {
			PhoneAccount acc = repository.findByPlanType(PlanType.GOLD);
			if(null != acc) {
				LOGGER.info(acc.getAvailableMinutes());
				LOGGER.info(acc.getNumberOfConnection());
			}
		} catch (Exception e) {
			LOGGER.error("Exception in PhoneAccountServiceImpl, message :"+e.getMessage());
		}
		return null;
	}

	@Transactional
	@Override
	public void saveAccountByPlanType(PhoneAccountModel model) {
		PhoneAccount acc = new PhoneAccount();
		acc.setAvailableMinutes(model.getAvailableMinutes());
		acc.setNumberOfConnection(model.getNumberOfConnection());
		//add ur logic for enum
		acc.setPlanType(PlanType.GOLD);
		repository.save(acc);
	}

	@Transactional(readOnly=true)
	@Override
	public List<PhoneAccountModel> getPhoneAccountByMaxConnection(String maxConn) {
		
		int connSize = Integer.parseInt(maxConn);
		try {
			List<PhoneAccount> acc = repository.findByNumberOfConnectionGreaterThan(connSize);
			// Create Consumer instance
			Consumer<PhoneAccount> action = new Consumer<PhoneAccount>(){

				@Override
				public void accept(PhoneAccount account) {
					LOGGER.info(account.getAvailableMinutes());
					LOGGER.info(account.getNumberOfConnection());
					LOGGER.info(account.getPlanType());
				}
				
			};
			if(null != acc) {
				acc.forEach(action);
			}
			
		} catch (Exception e) {
			LOGGER.error("Exception in PhoneAccountServiceImpl, message :"+e.getMessage());
		}
		
		return null;
	}

}

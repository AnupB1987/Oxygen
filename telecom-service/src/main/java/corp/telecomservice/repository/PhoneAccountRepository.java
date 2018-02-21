package corp.telecomservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import corp.telecomservice.entity.PhoneAccount;
import corp.telecomservice.entity.PlanType;

@Repository
public interface PhoneAccountRepository extends CrudRepository<PhoneAccount, Long>{

	public PhoneAccount findByPlanType(PlanType planType) throws Exception;
	public List<PhoneAccount> findByNumberOfConnectionGreaterThan(int numberOfConnection) throws Exception;
	
}

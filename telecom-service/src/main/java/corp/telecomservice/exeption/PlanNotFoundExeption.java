package corp.telecomservice.exeption;

public class PlanNotFoundExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlanNotFoundExeption(String msg) {
		super(msg);
	}
}

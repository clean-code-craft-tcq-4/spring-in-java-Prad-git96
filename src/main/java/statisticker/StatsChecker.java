package statisticker;

import java.util.Arrays;
import java.util.Iterator;

public class StatsChecker {
	public EmailAlert emailAlert;
	public LEDAlert ledAlert;
	float maxThreshold;
	
	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		
		for (IAlerter iAlerter : alerters) {
			if(iAlerter.getClass().equals(EmailAlert.class)) {
				this.emailAlert	=(EmailAlert) iAlerter;
			}
			if(iAlerter.getClass().equals(LEDAlert.class)) {
				this.ledAlert	=(LEDAlert) iAlerter;
			}
		}
		
		this.maxThreshold=maxThreshold;
		
}

	public void checkAndAlert(Float[] numbers) {
        Statistics.Stats s = Statistics.getStatistics(Arrays.asList(numbers));
        if(s.max>maxThreshold) {
        	emailAlert.emailSent=true;
        	ledAlert.ledGlows=true;
        }
	}

}

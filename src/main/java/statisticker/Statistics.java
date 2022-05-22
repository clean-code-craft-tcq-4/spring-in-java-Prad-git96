package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats s;
	
	 class Stats {

		public Float average;
		public Float min;
		public Float max;
		public Float getAverage() {
			return average;
		}
		public void setAverage(Float average) {
			this.average = average;
		}
		public Float getMin() {
			return min;
		}
		public void setMin(Float min) {
			this.min = min;
		}
		public Float getMax() {
			return max;
		}
		public void setMax(Float max) {
			this.max = max;
		}
		
		

	}

	public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
		Float min=numbers.get(0);
		Float max=numbers.get(0);
		Float sum=numbers.get(0);
		int size= numbers.size();
	
		for (int i=1 ;i<=size ; i++) {
			if(numbers.get(i)< min) {
				min=numbers.get(i);
			}else if(numbers.get(i)> max){
				max=numbers.get(i);
			}
			sum =sum +numbers.get(i);
		}
		s.setAverage( sum/size);
		s.setMax(max);
		s.setMin(min);		
		return s;
    }
}

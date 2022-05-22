package statisticker;

import java.util.List;

public class Statistics 
{
    	
	 class Stats {

		public Float average=Float.NaN;
		public Float min=Float.NaN;
		public Float max=Float.NaN;
		
		

	}

	public static Stats getStatistics(List<Float> numbers) {
		Statistics statistics= new Statistics();
		Statistics.Stats stats= statistics.new Stats();
        //implement the computation of statistics here
		if(!numbers.isEmpty()) {
			Float min=numbers.get(0);
			Float max=numbers.get(0);
			Float sum=numbers.get(0);
			int size= numbers.size();
		
			for (int i=1 ;i<size ; i++) {
				if(numbers.get(i)< min) {
					min=numbers.get(i);
				}else if(numbers.get(i)> max){
					max=numbers.get(i);
				}
				sum =sum +numbers.get(i);
			}
			stats.average= sum/size;
			stats.max=max;
			stats.min=min;		
			return stats;
		}
		return stats;
    }
}

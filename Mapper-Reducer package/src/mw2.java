/*
 * omada17
 * Kassari Anastasia 3130088
 * Kourli Vasileia 3130101
 * Stavrinos Michail Taxiarchis 3130193
 */

import omada17.newyorkapp.*;
public class mw2 {

	public static void main(String[] args) {
	
		while(true) 
		{
			MapWorker mp = new MapWorker("MapWorker2",Constants.MAP_PORT[1]);
			mp.initialize();
			mp.waitForTasksThread();
			System.out.println("\n------------------------------\n");
		}
		

		

	}

}

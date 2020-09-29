package LabSheet2;
/* ComputerData.java
 * By: Faun Schutz
 * Start: 25/08/2020
 * Finish: 25/08/2020
 *
 * This program processes the details of an arbitrary number of computers and has a user-defined method
 * to determine the average hard-disk space. It also validates the hard-disk space value */

import javax.swing.JOptionPane;

public class ComputerData {
	public static void main(String args[]) 
			{
				float price, cheapest=0, dearest=0;
				int hardDiskSpace=0,numProcessed=0,totalDiskSpace=0,i=0;
				String serialNumber,processorType,processorTypeCheapest = "",hardDiskSpaceAsString,
					   priceAsString;
			    boolean valid;
									
				serialNumber = JOptionPane.showInputDialog("Please enter the serial number " 
						       + "(<CR> to exit)");
							 		  
			    while(!serialNumber.equals(""))
					 {

					    	hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the "
					    							+ "hard-disk space");
						    valid = false;
					    						    							
					    	while(!valid)
					    	  {
					    	  	  for(i=0; i < hardDiskSpaceAsString.length();i++)
					    	  	  		if(!Character.isDigit(hardDiskSpaceAsString.charAt(i)))
					    	  		 			break;
					    	  		
					    	  	  if(i < hardDiskSpaceAsString.length())
					    	  	    	hardDiskSpaceAsString = JOptionPane.showInputDialog(
					    	  	    		"Invalid! Please re-enter hard-disk space");
					    	  	  else
					    	  	    {
					    	  	    	hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);
					    	  	    	
					    	  	    	if (hardDiskSpace > 50 && hardDiskSpace < 5000)
					    	  	    		valid = true;
					    	  	    	else
					    	  	    	  	hardDiskSpaceAsString = JOptionPane.showInputDialog(
					    	  	    	  		"Invalid! Please re-enter hard-disk space");
					    	  	    }
					    	    }
					    													 
						    processorType = JOptionPane.showInputDialog("Please enter the " +
						    				"processor type ");
				
							priceAsString = JOptionPane.showInputDialog("Please enter the price ");
							
							price = Float.parseFloat(priceAsString);

					    	numProcessed++;
					    
					    	if(numProcessed == 1)
					    		{
					    	 		cheapest = price;
					    			dearest = price;
					    			processorTypeCheapest = processorType;
					    		}
					    	else if(price<cheapest)
					    		{
					    			cheapest = price;
					    			processorTypeCheapest = processorType;
					    		}
					    	else if(price>dearest)
					    	   		dearest = price;

					     		
					    	totalDiskSpace+=hardDiskSpace;
					   
					    	serialNumber = JOptionPane.showInputDialog("Please enter the serial "
					    				   + "number (<CR> to exit)");					    				   
					    }
				
				if(numProcessed > 0)
					JOptionPane.showMessageDialog(null,"\n\nThe average disk space available on "
					                              + "the computers processed is: " + String.format("%.0f",
					                              averageDiskSpace(totalDiskSpace,numProcessed))
					                              + " GB\nThe price range of the computers is from €" + String.format("%.2f",
					                              cheapest) + " to €" + String.format("%.2f",dearest) + "\nThe processor type "
									              + "on the cheapest computer is " + processorTypeCheapest
							                      ,"Computer Stats",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"No data entered!","Computer Data",
							                     JOptionPane.INFORMATION_MESSAGE);
;
			    System.exit(0);				  				     						  					  
		}
		
	public static float averageDiskSpace(int totalDiskSpace,int numProcessed)
		{
			return (float)totalDiskSpace/numProcessed;
		}
}
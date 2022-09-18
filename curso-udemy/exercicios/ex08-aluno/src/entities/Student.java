package entities;

public class Student {
      public String name;
      public double thrirtd1;
      public double thrirtd2;
      public double thrirtd3;
      public String pass;
      public double missing;
      
      public double allThrirtds() {
    	 return thrirtd1 + thrirtd2 + thrirtd3;
      }
      
      public String passYear() {
    	  
    	  if (allThrirtds() >= 60.00) {
             pass = "PASS";
    	  }
    	  else {
    		  pass = "FAILED";
    	  }
		return pass;
	  }
      
      public double missing() {
    	  if (allThrirtds() < 60) {
    		  missing = 60.00 - allThrirtds();
    	  }
    	  return missing;
      }
      
    
}

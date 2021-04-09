package Stepdefinitions2;

public class RandomString {
	

	
	    static String getAlphaNumericString(int n)
	    {
	  
	        
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz";
	  
	        
	        StringBuilder sb = new StringBuilder(n);
	  
	        for (int i = 0; i < n; i++) {
	  
	            
	            int index
	                = (int)(AlphaNumericString.length()
	                        * Math.random());
	  
	           
	            sb.append(AlphaNumericString
	                          .charAt(index));
	        }
	  
	        return sb.toString();
	    }
	  
	    public static void main(String[] args)
	    {
	  
	        
	        int n = 20;
	  
	        
	        System.out.println(RandomString
	                               .getAlphaNumericString(n));
	    }
	}



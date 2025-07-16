package strings_program;

public class TomorrowToDollarPrgm {
	
	    public static void main(String[] args) {
	        String str = "tomorrowomO";
	        String result = "";
	        
	        int count = 1;  
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if (ch == 'o' || ch =='O') {
	                for (int j = 0; j < count; j++) {
	                    result = result + "$";
	                }
	                count++;  
	            } else {
	                result = result + ch;
	            }
	        }
	        
	        System.out.println(result);  
	    }
	}


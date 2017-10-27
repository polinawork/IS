package task2_hexadecimalToDecimal;

public class HexadecimalToDecimal{
	public static int convert (String str){
		int res = 0;
        char cur = '0';
        int curInt = 0;
        int pow = str.length()-1;
        for(int i=0; i<str.length(); ++i){
            cur = str.charAt(i);
            if(cur =='0') {
            	curInt=0;
            }
            else if(cur=='1'){
            	curInt=1;
            }
            else if(cur=='2'){
            	curInt=2;
            }
            else if(cur=='3'){
            	curInt=3;
            }
            else if(cur=='4'){
            	curInt=4;
            }
            else if(cur=='5'){
            	curInt=5;
            }
            else if(cur=='6'){
            	curInt=6;
            }
            else if(cur=='7'){
            	curInt=7;
	        }
	        else if(cur=='8'){
	        	curInt=8;
	        }
	        else if(cur=='9'){
	        	curInt=9;
	        }
	        else if(cur=='A'){
	        	curInt=10;
	        }
	        else if(cur=='B'){
	        	curInt=11;
	        }
	        else if(cur=='C'){
	        	curInt=12;
	        }
	        else if(cur=='D'){
	        	curInt=13;
	        }
	        else if(cur=='E'){
	        	curInt=14;
	        }
	        else if(cur=='F'){
	        	curInt=15;
	        }    
            res += curInt * Math.pow(16, pow);
            --pow;
        }
        return res;
	}
}


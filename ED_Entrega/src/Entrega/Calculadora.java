package Entrega;

public class Calculadora {

	int num1;
	int num2;
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public Calculadora(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * 
	 */
	public Calculadora() {

		
	}
	

	/**
	 * 
	 * @return int 
	 */
	public int resta() {
		
		int result;
		if (resta2()) {
			
			result = num1 - num2;
		
		}
		
		else {
			
			result = num2 - num1;
			
		}
		
		return result;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean resta2() {
		
		boolean valid = true;
		
		if (num1>=num2) { valid = true; }
		
		else {
			valid = false;
		}
		
		return valid;
	
	}
	
	/**
	 * 
	 * @return integer
	 */
	public Integer divide2() {
		
		Integer resultado = 0;
		if(num2==0) {
			resultado = null;
		}
		resultado = num1/num2;
		
		return resultado;
	}
}

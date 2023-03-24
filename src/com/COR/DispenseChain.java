package com.COR;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(int cur);

}

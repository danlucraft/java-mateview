
package com.redcareditor.mate;

public class Scope {
	public MateText mateText;
	public String name;
	public Pattern pattern;
	
	public boolean isOpen;
	
	public Scope(MateText mt, String n) {
		mateText = mt;
		name = n;
	}
	
	public void clearAfter(int lineIx, int something) {
		
	}
	
	public String pretty(int indent) {
		return "";
	}
}

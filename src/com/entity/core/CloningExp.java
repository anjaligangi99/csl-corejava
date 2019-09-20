package com.entity.core;

public class CloningExp implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloningExp cloningExp = new CloningExp();
		CloningExp cloningExp2 = (CloningExp)cloningExp.clone();
		System.out.println(cloningExp.hashCode()+" "+cloningExp2.hashCode());
	}

}

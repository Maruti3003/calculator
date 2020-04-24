package com.cal.mj;

public class Calculators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
        add addObject=new add();
        //Addition
        int c=addObject.add(a, b);
        System.out.println("Addition is "+c);
      //substraction
        sub subObject=new sub();
        int c1=subObject.sub(a, b);
        System.out.println("sub is "+c1);

      //multiplication
        mul mulObject=new mul();
        int m=mulObject.mul(a, b);
        System.out.println("mul is "+m);

      //Division
        double par1=23;
        		double par2=7;
        div divObject=new div();
        double d=divObject.div(par1, par2);
        System.out.println("div is "+d);

        
        
        
 
				
				

	}

}

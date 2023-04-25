package com.jspiders.builderpattern.Main;

import com.jspiders.builderpattern.builder.MobileBuilder;
import com.jspiders.builderpattern.object.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile=new MobileBuilder().brand("samsung").price(10000.00).model("s4").getMobile();
			System.out.println(mobile);	
	}

}

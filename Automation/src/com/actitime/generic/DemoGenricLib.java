package com.actitime.generic;

import java.io.IOException;


public class DemoGenricLib {

	public static void main(String[] args) throws IOException {
		 FileLib f=new FileLib();
			String un = f.getPropertyData("password");
			System.out.println(un);


	}

}
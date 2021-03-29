package com.vti.fontend.Inheritance;

import com.vti.entity.Canbo.*;
import com.vti.backend.QLCB;
public class Question2 {
	public static void main (String[] args) {
		QLCB qlcb = new QLCB();
		qlcb.addCanBo();
		qlcb.showInfoCanBo();
		qlcb.findCanBo();
		qlcb.deleteCanBo();
	}

}

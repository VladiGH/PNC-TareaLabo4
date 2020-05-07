package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message = "No puedes agregar un producto, eres un robot. Por favor, regresa con el botón.")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
}

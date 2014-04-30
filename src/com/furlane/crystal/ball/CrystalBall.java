package com.furlane.crystal.ball;

import java.util.Random;

public class CrystalBall {
	//Member variables(properties about the object)
	public String [] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answe now",
			"It is hard to say" };
	
	//Methods (abilities: things the object can do)
	public String getAnAnswer(){
		Random randomGenerator = new Random();
		return mAnswers[randomGenerator.nextInt(mAnswers.length)];
	}
}
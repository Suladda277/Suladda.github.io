package event;

import character.Dragon;
import character.Wave;

public class Event {
	public static boolean checkHit (Dragon dragon,Wave wave) {
		if(dragon.x+dragon.dragonSize>wave.x && dragon.x < wave.x) {
			if(dragon.y+dragon.dragonSize>=wave.y-wave.height) {
				//System.out.println("HIT AT [Y] !!!!!!");
				return true;
				
			}}
		return false;
		
	}

}

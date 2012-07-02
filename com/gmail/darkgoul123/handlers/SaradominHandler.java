package com.gmail.darkgoul123.handlers;

import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.node.SceneObject;

import com.gmail.darkgoul123.interfaces.EnvironmentImpl;
import com.gmail.darkgoul123.interfaces.SaradominImpl;

public class SaradominHandler implements SaradominImpl, EnvironmentImpl {

	public SaradominHandler() {
		Tile myLocation = Players.getLocal().getLocation();
		SceneObject portal = SceneEntities.getNearest(saradominPortalId);
		if(castleArea.contains(myLocation)) {
			GuthixHandler.enterPortal(portal);
		} else {
			new GuthixHandler();
		}
	}

}

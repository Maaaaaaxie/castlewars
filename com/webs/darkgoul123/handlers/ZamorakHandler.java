package com.webs.darkgoul123.handlers;

import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.node.SceneObject;

import com.webs.darkgoul123.interfaces.EnvironmentImpl;
import com.webs.darkgoul123.interfaces.ZamorakImpl;

public class ZamorakHandler implements ZamorakImpl, EnvironmentImpl {

	public static void handle() {
		Tile myLocation = Players.getLocal().getLocation();
		SceneObject portal = SceneEntities.getNearest(zamorakPortalId);
		if(Widgets.get(985).getChild(2).isOnScreen()) {
			Walking.walk(portal);
		}
		if(castleArea.contains(myLocation)) {
			GuthixHandler.enterPortal(portal);
		} else {
			GuthixHandler.handle();
		}
	}

}

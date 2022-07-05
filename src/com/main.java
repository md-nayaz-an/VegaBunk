package com;

import javafx.application.*;

import javafx.scene.*;
import javafx.stage.*;

import scenes.loginScene;

public class main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(final Stage myStage) throws Exception {
		myStage.setTitle("VegaBunk");
		
		loginScene l = new loginScene();
		Scene login = l.loadScene(myStage);
		myStage.setScene(login);
		

		
		myStage.show();
	}
}
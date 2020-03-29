sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"sap/m/MessageToast",
	"sap/ui/model/json/JSONModel"
], function (Controller, MessageToast, JSONModel) {
	"use strict";

	return Controller.extend("Quickstart.App", {
		onPress : function () {
			MessageToast.show("Welcome to Emina's resume!");
			this.byId("app").to(this.byId("intro"));
		},

		onInit : function () {
			this.getView().setModel(new JSONModel({
					features: [
						"Summary",
						"Experience",
						"Education",
						"Languages",
						"Skills",
						"Personnal"
					]
				})
			);
		},

		onChange: function (oEvent) {
			var bState = oEvent.getParameter("state");
			this.byId("ready").setVisible(bState);
		}
	});

});
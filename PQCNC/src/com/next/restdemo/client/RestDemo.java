package com.next.restdemo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.next.restdemo.client.screeen.HomeFooter;
import com.next.restdemo.client.screeen.HomeWidget;
import com.next.restdemo.client.screeen.TopPanel;

public class RestDemo implements EntryPoint {
	
	public void onModuleLoad() {
		VerticalPanel vp = new VerticalPanel();
		vp.setWidth("100%");
		vp.add(new TopPanel());
		vp.add(new HomeWidget());
		vp.add(new HomeFooter());
		RootPanel.get().add(vp);
	}
}

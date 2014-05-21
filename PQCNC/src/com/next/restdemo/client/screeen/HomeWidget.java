package com.next.restdemo.client.screeen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HomeWidget extends Composite {

	private static HomeWidgetUiBinder uiBinder = GWT
			.create(HomeWidgetUiBinder.class);

	interface HomeWidgetUiBinder extends UiBinder<Widget, HomeWidget> {
	}

	public HomeWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	@UiField
//	Button button;

	public HomeWidget(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
//		button.setText(firstName);
	}

//	@UiHandler("button")
//	void onClick(ClickEvent e) {
//		Window.alert("Hello!");
//	}
//
//	public void setText(String text) {
//		button.setText(text);
//	}
//
//	public String getText() {
//		return button.getText();
//	}

}

package com.next.restdemo.client.screeen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class TopPanel extends Composite {

//	private HashMap<String, MenuSignature> initalizedMenuMap = new HashMap<String, MenuSignature>();
//	private HashMap<String, MenuSignature> menuMap = new HashMap<String, MenuSignature>();
//	
	
	private static TopPanelUiBinder uiBinder = GWT
			.create(TopPanelUiBinder.class);
	
	interface TopPanelUiBinder extends UiBinder<Widget, TopPanel> {
	}

//	@UiField
//	Anchor signOutLink, contactLink, callLogLink, messageLink,
//		   browserLink,changeDeviceLink, locationLink;
//	@UiField
//	Label userName;//,contactLabel,messageLabel,callLogsLabel,browserHistoryLabel;//,signOutLabel,changeDeviceLabel;
	
//	private LoginServiceAsync loginServiceAsync = GWT.create(LoginService.class);
//	
//	private TopPanelLabels topPanelLabels = (TopPanelLabels) GWT.create(TopPanelLabels.class);
	
	public TopPanel() {
		
//		ContactManager contactManager = new ContactManager();
//		CallLogsReport logsReport = new CallLogsReport();
//		MessageReport messageReport = new MessageReport();
//		BrowserHistoryReport browserHistoryReport = new BrowserHistoryReport();
//		LocationManager locationManager = new LocationManager();
//		
//		menuMap.put("Contact", contactManager);
//		menuMap.put("Call", logsReport);
//		menuMap.put("Message", messageReport);
//		menuMap.put("BrowserHistory", browserHistoryReport);
//		menuMap.put("Location", locationManager);
//		
		initWidget(uiBinder.createAndBindUi(this));
//		loginServiceAsync.getUserName(new AsyncCallback<String>() {
//			
//			@Override
//			public void onSuccess(String result) {
//				userName.setText("Welcome "+result);				
//			}
//			
//			@Override
//			public void onFailure(Throwable caught) {
//				
//			}
//		});
//
//		loginServiceAsync.getDeviceFromEmail(new AsyncCallback<List<UserBean>>() {
//			
//			@Override
//			public void onSuccess(List<UserBean> result) {
//				if(result.size()>1){
//					changeDeviceLink.setVisible(true);
//				}
//			}
//			
//			@Override
//			public void onFailure(Throwable caught) {
//								
//			}
//		});
		
//		changeDeviceLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				RootPanel.get("mainContainer").clear();
//				RootPanel.get().clear();
//				RootPanel.get("mainContainer").add(new DeviceSelectionUI());
//			}
//		});
//		
//		signOutLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//
//				loginServiceAsync.logout(new AsyncCallback<Void>() {
//					
//					@Override
//					public void onSuccess(Void result) {
//						RootPanel.get("mainContainer").clear();
//						RootPanel.get().clear();
//						RootPanel.get("mainContainer").add(new LoginUI());
//					}
//					
//					@Override
//					public void onFailure(Throwable caught) {
//						Window.alert("Unable To Logout Try Again...");
//					}
//				});				
//			}
//		});	
//		
//		contactLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				String menuText = "Contact";//newTreeItem.getText();
//				MenuSignature menuSign = menuMap.get(menuText);
//			    if (!initalizedMenuMap.containsKey(menuText)) {
//			    	initalizedMenuMap.put(menuText, menuSign);
//			    	menuSign.initUI();
//			    }
//			    AppsServiceStaticData.AUI.loadWidget(menuSign.getWidget());			
//			}
//		});		
//		
//		callLogLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//			
//				String menuText = "Call";//newTreeItem.getText();
//				MenuSignature menuSign = menuMap.get(menuText);
//			    if (!initalizedMenuMap.containsKey(menuText)) {
//			    	initalizedMenuMap.put(menuText, menuSign);
//			    	menuSign.initUI();
//			    }
//			    AppsServiceStaticData.AUI.loadWidget(menuSign.getWidget());				
//			}
//		});
//		
//		messageLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				String menuText = "Message";
//				MenuSignature menuSign = menuMap.get(menuText);
//			    if (!initalizedMenuMap.containsKey(menuText)) {
//			    	initalizedMenuMap.put(menuText, menuSign);
//			    	menuSign.initUI();
//			    }
//			    AppsServiceStaticData.AUI.loadWidget(menuSign.getWidget());
//			}
//		});
//		
//		browserLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				String menuText = "BrowserHistory";
//				MenuSignature menuSign = menuMap.get(menuText);
//			    if (!initalizedMenuMap.containsKey(menuText)) {
//			    	initalizedMenuMap.put(menuText, menuSign);
//			    	menuSign.initUI();
//			    }
//			    AppsServiceStaticData.AUI.loadWidget(menuSign.getWidget());
//			}
//		});
//		
//		locationLink.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				String menuText = "Location";
//				MenuSignature menuSign = menuMap.get(menuText);
//			    if (!initalizedMenuMap.containsKey(menuText)) {
//			    	initalizedMenuMap.put(menuText, menuSign);
//			    	menuSign.initUI();
//			    }
//			    AppsServiceStaticData.AUI.loadWidget(menuSign.getWidget());				
//			}
//		});
//		
//		contactLink.setText(topPanelLabels.contacts());
//		callLogLink.setText(topPanelLabels.callLog());
//		messageLink.setText(topPanelLabels.message());
//		browserLink.setText(topPanelLabels.browserHistory());
//		changeDeviceLink.setText(topPanelLabels.changeDevice());
//		signOutLink.setText(topPanelLabels.signOut());
//		signOutLink.setStyleName("green");
//		changeDeviceLink.setStyleName("yellow");
	}
}

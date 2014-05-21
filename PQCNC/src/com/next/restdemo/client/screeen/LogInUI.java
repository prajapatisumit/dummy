package com.next.restdemo.client.screeen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.next.restdemo.client.service.LogInService;
import com.next.restdemo.client.service.LogInServiceAsync;

public class LogInUI extends Composite {

	private static UserUIUiBinder uiBinder = GWT.create(UserUIUiBinder.class);
	private static LogInServiceAsync logInSessionServiceAsync = GWT.create(LogInService.class);

	interface UserUIUiBinder extends UiBinder<Widget, LogInUI> {
	}

	@UiField
	TextBox userName,password;
	
	@UiField
	Button buttonLogin;
	
	@UiField
	Label userNameError,passwordError;
	
	public LogInUI() {
		initWidget(uiBinder.createAndBindUi(this));
		userNameError.setText("");
		passwordError.setText("");
	}

	public LogInUI(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("buttonLogin")
	public void onLogInClick(ClickEvent ce){
		if(isValid()){
			logInSessionServiceAsync.verifyLogin(userName.getText(), password.getText(), new AsyncCallback<String>() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void onSuccess(String result) {
					if(result != null) {
						JSONValue jsonValue = JSONParser.parse(result);
						JSONObject jobj = jsonValue.isObject();
						int responseCode = Integer.parseInt(jobj.get("responseCode").isString().stringValue());
						
						if(responseCode == 0) {
							Window.alert("Authantication Fail");
						} else {
							String firstName = jobj.get("firstName").isString().stringValue();
							String lastName = jobj.get("lastName").isString().stringValue();
							Window.alert("Sucessfully Login\nFirst Name : "+firstName+"\nLast Name : "+lastName);
						}
						
					} else
						Window.alert("Error Occured !!");
				}
				
				@Override
				public void onFailure(Throwable caught) {
					Window.alert("Fail");
				}
			});
		}
	}
	
	private boolean isValid() {
		boolean flag = true;
		
		if(userName.getText().isEmpty()){
			userNameError.setText("Enter UserName");
			flag = false;
		}
		if(password.getText().isEmpty()){
			passwordError.setText("Enter Password");
			flag = false;
		}
		
		return flag;
	}
	
}

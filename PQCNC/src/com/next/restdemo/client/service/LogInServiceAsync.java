package com.next.restdemo.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of LogInService.
 */
public interface LogInServiceAsync {
	void verifyLogin(String userId, String userPwd,
			AsyncCallback<String> callback);
}

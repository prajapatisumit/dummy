package com.next.restdemo.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the Login service.
 */
@RemoteServiceRelativePath("Login")
public interface LogInService extends RemoteService {
	String verifyLogin(String userId, String userPwd);
}

package com.next.restdemo.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.next.restdemo.client.service.LogInService;
import com.next.restdemo.shared.Constants;

/**
 * The server side implementation of the Login service.
 */
@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LogInService {

	@Override
	public String verifyLogin(String userId, String userPwd) {
		try {
			String referenceString = Constants.LOGIN_SERVICE + "?userId=" + userId + "&userPwd=" + userPwd;
			URL url = new URL(referenceString);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			return sb.toString();
			
		} catch (MalformedURLException e) {
			return null;
		}catch (IOException e) {
			return null;
		}
	}
	
}

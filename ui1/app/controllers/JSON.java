package controllers;

import play.*;
import play.data.validation.Required;
import play.libs.F.Promise;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.mvc.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

import json.JSONUser;
import org.apache.commons.codec.digest.DigestUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.sun.mail.handlers.message_rfc822;

public class JSON extends Controller {

	public static void register() {
		JSONUser user = new JSONUser();
		user.login = "login";
		user.name = "name";
		user.password = "pwd";
		
		Gson gson = new Gson();
		String gson1 =  gson.toJson(user);
        
        System.out.println(gson1);
        
        Promise<HttpResponse> res = WS.url(
    	    "http://localhost:8080/uis-api/rest/users/s"
    	).setParameter("user", "user")
    	 .getAsync();
        
		HttpResponse json = null;
		try {
			json = res.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		renderJSON(json.toString());
	}
	public static void register12() {
		renderJSON("12");
	}
}

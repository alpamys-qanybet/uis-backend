package controllers;

import play.*;
import play.i18n.Lang;
import play.libs.Crypto;
import play.mvc.*;

import java.util.*;

import controllers.Secure.Security;

import models.*;

@With(Secure.class)
public class Application extends Controller {
	
	@Before
    static void setConnectedUser() {
        if(Security.isConnected()) {
//            User user = User.find("byEmail", Security.connected()).first();
            renderArgs.put("user", "email");
        }
    }
	
    public static void index() {
        render();
    }

    public static void changeLang(String lang) {
        session.put("lang", lang);
        Lang.change(lang);
        String url = flash.get("url");
        if(url == null) {
            url = Play.ctxPath + "/";
        }
        redirect(url);
    }
}
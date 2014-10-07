package controllers;

import controllers.Secure.Security;
import play.Play;
import play.i18n.Lang;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

public class Home extends Controller {

    @Before
    static void setdefaultLanguage() {
        Lang.change("ru");
    }


    public static void register() {
        System.out.println("register");
        render("Application/register.html");
    }
}
package models;

import play.data.validation.*;
import play.db.jpa.Blob;
import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "User_")
public class UserModel extends Model implements Serializable {
    @Email
    @Required
    @Unique
    public String user_email;

    public Date birthdate;
    public String gender;
    public String firstName;
    public String lastName;
    public String phone;
    public String info;
    public Level status = Level.STUDENT;

    public enum Level {
        STUDENT,
        PARENT,
        TEACHER
    }
    public boolean email_verified = false;
    public Blob photo;
    public Date create_date = new Date();
    public Date edit_date = new Date();
    public Date last_active_date = new Date();

    @Required
    @MinSize(2)
    @MaxSize(40)
    public String pwd;
    @Required
    @MinSize(2)
    @MaxSize(40)
    public String pwd1;

    public UserModel(String user_email, String pwd) {
        this.user_email = user_email;
        this.pwd = pwd;
        this.pwd1 = pwd1;
    }
    public static UserModel getUserByEmail(String email) {
        return find("byUser_email", email).first();
    }
    public static UserModel connect(String email, String pwd) {
        return find("byUser_emailAndPwd", email, pwd).first();
    }


}

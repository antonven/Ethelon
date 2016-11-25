package myapps.wycoco.com.ethelon.models;

import myapps.wycoco.com.ethelon.UserProfile;

/**
 * Created by dell on 11/26/2016.
 */

public class UserProfileModel {

    private int profImage;
    private String profName;
    private String profEmail;

    public UserProfileModel(){

    }

    public UserProfileModel(int profImage, String profName, String profEmail) {
        this.profImage = profImage;
        this.profName = profName;
        this.profEmail = profEmail;
    }

    public int getProfImage() {
        return profImage;
    }

    public void setProfImage(int profImage) {
        this.profImage = profImage;
    }

    public String getProfEmail() {
        return profEmail;
    }

    public void setProfEmail(String profEmail) {
        this.profEmail = profEmail;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
}

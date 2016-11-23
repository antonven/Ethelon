package myapps.wycoco.com.ethelon.models;


public class Volunteers {

    private String name;
    private String points;
    private int rankingImage;
    private int volunteerImage;
    private int badgeImage;

    public Volunteers(){

    }

    public Volunteers(String name, String points, int rankingImage, int badgeImage, int volunteerImage) {
        this.name = name;
        this.points = points;
        this.rankingImage = rankingImage;
        this.badgeImage = badgeImage;
        this.volunteerImage = volunteerImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getRankingImage() {
        return rankingImage;
    }

    public void setRankingImage(int rankingImage) {
        this.rankingImage = rankingImage;
    }

    public int getVolunteerImage() {
        return volunteerImage;
    }

    public void setVolunteerImage(int volunteerImage) {
        this.volunteerImage = volunteerImage;
    }

    public int getBadgeImage() {
        return badgeImage;
    }

    public void setBadgeImage(int badgeImage) {
        this.badgeImage = badgeImage;
    }
}

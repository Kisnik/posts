package domain;

public class PublicInfo {
    private int id;
    private int publicName;
    private int publicAvatarUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicName() {
        return publicName;
    }

    public void setPublicName(int publicName) {
        this.publicName = publicName;
    }

    public int getPublicAvatarUrl() {
        return publicAvatarUrl;
    }

    public void setPublicAvatarUrl(int publicAvatarUrl) {
        this.publicAvatarUrl = publicAvatarUrl;
    }
}

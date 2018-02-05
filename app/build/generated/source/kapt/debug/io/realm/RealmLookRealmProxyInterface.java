package io.realm;


public interface RealmLookRealmProxyInterface {
    public long realmGet$id();
    public void realmSet$id(long value);
    public String realmGet$uid();
    public void realmSet$uid(String value);
    public String realmGet$title();
    public void realmSet$title(String value);
    public int realmGet$privacy();
    public void realmSet$privacy(int value);
    public int realmGet$numItems();
    public void realmSet$numItems(int value);
    public int realmGet$numLikes();
    public void realmSet$numLikes(int value);
    public int realmGet$numComments();
    public void realmSet$numComments(int value);
    public int realmGet$numShares();
    public void realmSet$numShares(int value);
    public String realmGet$updatedAt();
    public void realmSet$updatedAt(String value);
    public String realmGet$createdAt();
    public void realmSet$createdAt(String value);
}

package io.realm;


public interface RealmItemRealmProxyInterface {
    public long realmGet$id();
    public void realmSet$id(long value);
    public String realmGet$uid();
    public void realmSet$uid(String value);
    public String realmGet$title();
    public void realmSet$title(String value);
    public RealmList<String> realmGet$images();
    public void realmSet$images(RealmList<String> value);
}

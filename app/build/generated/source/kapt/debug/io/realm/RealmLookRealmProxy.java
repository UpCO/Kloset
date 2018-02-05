package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.ProxyUtils;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class RealmLookRealmProxy extends com.upco.kloset.repository.local.entity.RealmLook
    implements RealmObjectProxy, RealmLookRealmProxyInterface {

    static final class RealmLookColumnInfo extends ColumnInfo {
        long idIndex;
        long uidIndex;
        long titleIndex;
        long privacyIndex;
        long numItemsIndex;
        long numLikesIndex;
        long numCommentsIndex;
        long numSharesIndex;
        long updatedAtIndex;
        long createdAtIndex;

        RealmLookColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmLook");
            this.idIndex = addColumnDetails("id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", objectSchemaInfo);
            this.privacyIndex = addColumnDetails("privacy", objectSchemaInfo);
            this.numItemsIndex = addColumnDetails("numItems", objectSchemaInfo);
            this.numLikesIndex = addColumnDetails("numLikes", objectSchemaInfo);
            this.numCommentsIndex = addColumnDetails("numComments", objectSchemaInfo);
            this.numSharesIndex = addColumnDetails("numShares", objectSchemaInfo);
            this.updatedAtIndex = addColumnDetails("updatedAt", objectSchemaInfo);
            this.createdAtIndex = addColumnDetails("createdAt", objectSchemaInfo);
        }

        RealmLookColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmLookColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmLookColumnInfo src = (RealmLookColumnInfo) rawSrc;
            final RealmLookColumnInfo dst = (RealmLookColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.uidIndex = src.uidIndex;
            dst.titleIndex = src.titleIndex;
            dst.privacyIndex = src.privacyIndex;
            dst.numItemsIndex = src.numItemsIndex;
            dst.numLikesIndex = src.numLikesIndex;
            dst.numCommentsIndex = src.numCommentsIndex;
            dst.numSharesIndex = src.numSharesIndex;
            dst.updatedAtIndex = src.updatedAtIndex;
            dst.createdAtIndex = src.createdAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(10);
        fieldNames.add("id");
        fieldNames.add("uid");
        fieldNames.add("title");
        fieldNames.add("privacy");
        fieldNames.add("numItems");
        fieldNames.add("numLikes");
        fieldNames.add("numComments");
        fieldNames.add("numShares");
        fieldNames.add("updatedAt");
        fieldNames.add("createdAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private RealmLookColumnInfo columnInfo;
    private ProxyState<com.upco.kloset.repository.local.entity.RealmLook> proxyState;

    RealmLookRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmLookColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.upco.kloset.repository.local.entity.RealmLook>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$uid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.uidIndex);
    }

    @Override
    public void realmSet$uid(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uid' to null.");
            }
            row.getTable().setString(columnInfo.uidIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'uid' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.uidIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row.getTable().setString(columnInfo.titleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$privacy() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.privacyIndex);
    }

    @Override
    public void realmSet$privacy(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.privacyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.privacyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numItems() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numItemsIndex);
    }

    @Override
    public void realmSet$numItems(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numItemsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numItemsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numLikes() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numLikesIndex);
    }

    @Override
    public void realmSet$numLikes(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numLikesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numLikesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numComments() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numCommentsIndex);
    }

    @Override
    public void realmSet$numComments(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numCommentsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numCommentsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numShares() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numSharesIndex);
    }

    @Override
    public void realmSet$numShares(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numSharesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numSharesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$updatedAt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.updatedAtIndex);
    }

    @Override
    public void realmSet$updatedAt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'updatedAt' to null.");
            }
            row.getTable().setString(columnInfo.updatedAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'updatedAt' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.updatedAtIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$createdAt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.createdAtIndex);
    }

    @Override
    public void realmSet$createdAt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
            }
            row.getTable().setString(columnInfo.createdAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.createdAtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmLook", 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("uid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("privacy", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numItems", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numLikes", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numComments", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numShares", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("updatedAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("createdAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmLookColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmLookColumnInfo(schemaInfo);
    }

    public static String getTableName() {
        return "class_RealmLook";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.upco.kloset.repository.local.entity.RealmLook createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.upco.kloset.repository.local.entity.RealmLook obj = null;
        if (update) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
            RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class), false, Collections.<String> emptyList());
                    obj = new io.realm.RealmLookRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.RealmLookRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmLook.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.RealmLookRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmLook.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final RealmLookRealmProxyInterface objProxy = (RealmLookRealmProxyInterface) obj;
        if (json.has("uid")) {
            if (json.isNull("uid")) {
                objProxy.realmSet$uid(null);
            } else {
                objProxy.realmSet$uid((String) json.getString("uid"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("privacy")) {
            if (json.isNull("privacy")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'privacy' to null.");
            } else {
                objProxy.realmSet$privacy((int) json.getInt("privacy"));
            }
        }
        if (json.has("numItems")) {
            if (json.isNull("numItems")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numItems' to null.");
            } else {
                objProxy.realmSet$numItems((int) json.getInt("numItems"));
            }
        }
        if (json.has("numLikes")) {
            if (json.isNull("numLikes")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numLikes' to null.");
            } else {
                objProxy.realmSet$numLikes((int) json.getInt("numLikes"));
            }
        }
        if (json.has("numComments")) {
            if (json.isNull("numComments")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numComments' to null.");
            } else {
                objProxy.realmSet$numComments((int) json.getInt("numComments"));
            }
        }
        if (json.has("numShares")) {
            if (json.isNull("numShares")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numShares' to null.");
            } else {
                objProxy.realmSet$numShares((int) json.getInt("numShares"));
            }
        }
        if (json.has("updatedAt")) {
            if (json.isNull("updatedAt")) {
                objProxy.realmSet$updatedAt(null);
            } else {
                objProxy.realmSet$updatedAt((String) json.getString("updatedAt"));
            }
        }
        if (json.has("createdAt")) {
            if (json.isNull("createdAt")) {
                objProxy.realmSet$createdAt(null);
            } else {
                objProxy.realmSet$createdAt((String) json.getString("createdAt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.upco.kloset.repository.local.entity.RealmLook createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.upco.kloset.repository.local.entity.RealmLook obj = new com.upco.kloset.repository.local.entity.RealmLook();
        final RealmLookRealmProxyInterface objProxy = (RealmLookRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("uid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$uid(null);
                }
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("privacy")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$privacy((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'privacy' to null.");
                }
            } else if (name.equals("numItems")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numItems((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numItems' to null.");
                }
            } else if (name.equals("numLikes")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numLikes((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numLikes' to null.");
                }
            } else if (name.equals("numComments")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numComments((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numComments' to null.");
                }
            } else if (name.equals("numShares")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numShares((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numShares' to null.");
                }
            } else if (name.equals("updatedAt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$updatedAt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$updatedAt(null);
                }
            } else if (name.equals("createdAt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$createdAt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$createdAt(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.upco.kloset.repository.local.entity.RealmLook copyOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmLook object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.upco.kloset.repository.local.entity.RealmLook) cachedRealmObject;
        }

        com.upco.kloset.repository.local.entity.RealmLook realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
            RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.RealmLookRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.upco.kloset.repository.local.entity.RealmLook copy(Realm realm, com.upco.kloset.repository.local.entity.RealmLook newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.upco.kloset.repository.local.entity.RealmLook) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.upco.kloset.repository.local.entity.RealmLook realmObject = realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmLook.class, ((RealmLookRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        RealmLookRealmProxyInterface realmObjectSource = (RealmLookRealmProxyInterface) newObject;
        RealmLookRealmProxyInterface realmObjectCopy = (RealmLookRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$privacy(realmObjectSource.realmGet$privacy());
        realmObjectCopy.realmSet$numItems(realmObjectSource.realmGet$numItems());
        realmObjectCopy.realmSet$numLikes(realmObjectSource.realmGet$numLikes());
        realmObjectCopy.realmSet$numComments(realmObjectSource.realmGet$numComments());
        realmObjectCopy.realmSet$numShares(realmObjectSource.realmGet$numShares());
        realmObjectCopy.realmSet$updatedAt(realmObjectSource.realmGet$updatedAt());
        realmObjectCopy.realmSet$createdAt(realmObjectSource.realmGet$createdAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.upco.kloset.repository.local.entity.RealmLook object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
        long tableNativePtr = table.getNativePtr();
        RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmLookRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmLookRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        }
        String realmGet$title = ((RealmLookRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.privacyIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$privacy(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numItemsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numItems(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numLikes(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numCommentsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numComments(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numSharesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numShares(), false);
        String realmGet$updatedAt = ((RealmLookRealmProxyInterface) object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        }
        String realmGet$createdAt = ((RealmLookRealmProxyInterface) object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
        long tableNativePtr = table.getNativePtr();
        RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmLook object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmLook) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmLookRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmLookRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            }
            String realmGet$title = ((RealmLookRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.privacyIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$privacy(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numItemsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numItems(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numLikes(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numCommentsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numComments(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numSharesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numShares(), false);
            String realmGet$updatedAt = ((RealmLookRealmProxyInterface) object).realmGet$updatedAt();
            if (realmGet$updatedAt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
            }
            String realmGet$createdAt = ((RealmLookRealmProxyInterface) object).realmGet$createdAt();
            if (realmGet$createdAt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmLook object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
        long tableNativePtr = table.getNativePtr();
        RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmLookRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmLookRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
        }
        String realmGet$title = ((RealmLookRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.privacyIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$privacy(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numItemsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numItems(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numLikes(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numCommentsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numComments(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numSharesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numShares(), false);
        String realmGet$updatedAt = ((RealmLookRealmProxyInterface) object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
        }
        String realmGet$createdAt = ((RealmLookRealmProxyInterface) object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmLook.class);
        long tableNativePtr = table.getNativePtr();
        RealmLookColumnInfo columnInfo = (RealmLookColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmLook.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmLook object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmLook) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmLookRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmLookRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmLookRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
            }
            String realmGet$title = ((RealmLookRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.privacyIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$privacy(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numItemsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numItems(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numLikes(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numCommentsIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numComments(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numSharesIndex, rowIndex, ((RealmLookRealmProxyInterface) object).realmGet$numShares(), false);
            String realmGet$updatedAt = ((RealmLookRealmProxyInterface) object).realmGet$updatedAt();
            if (realmGet$updatedAt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
            }
            String realmGet$createdAt = ((RealmLookRealmProxyInterface) object).realmGet$createdAt();
            if (realmGet$createdAt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
            }
        }
    }

    public static com.upco.kloset.repository.local.entity.RealmLook createDetachedCopy(com.upco.kloset.repository.local.entity.RealmLook realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.upco.kloset.repository.local.entity.RealmLook unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.upco.kloset.repository.local.entity.RealmLook();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.upco.kloset.repository.local.entity.RealmLook) cachedObject.object;
            }
            unmanagedObject = (com.upco.kloset.repository.local.entity.RealmLook) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        RealmLookRealmProxyInterface unmanagedCopy = (RealmLookRealmProxyInterface) unmanagedObject;
        RealmLookRealmProxyInterface realmSource = (RealmLookRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$uid(realmSource.realmGet$uid());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$privacy(realmSource.realmGet$privacy());
        unmanagedCopy.realmSet$numItems(realmSource.realmGet$numItems());
        unmanagedCopy.realmSet$numLikes(realmSource.realmGet$numLikes());
        unmanagedCopy.realmSet$numComments(realmSource.realmGet$numComments());
        unmanagedCopy.realmSet$numShares(realmSource.realmGet$numShares());
        unmanagedCopy.realmSet$updatedAt(realmSource.realmGet$updatedAt());
        unmanagedCopy.realmSet$createdAt(realmSource.realmGet$createdAt());

        return unmanagedObject;
    }

    static com.upco.kloset.repository.local.entity.RealmLook update(Realm realm, com.upco.kloset.repository.local.entity.RealmLook realmObject, com.upco.kloset.repository.local.entity.RealmLook newObject, Map<RealmModel, RealmObjectProxy> cache) {
        RealmLookRealmProxyInterface realmObjectTarget = (RealmLookRealmProxyInterface) realmObject;
        RealmLookRealmProxyInterface realmObjectSource = (RealmLookRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$privacy(realmObjectSource.realmGet$privacy());
        realmObjectTarget.realmSet$numItems(realmObjectSource.realmGet$numItems());
        realmObjectTarget.realmSet$numLikes(realmObjectSource.realmGet$numLikes());
        realmObjectTarget.realmSet$numComments(realmObjectSource.realmGet$numComments());
        realmObjectTarget.realmSet$numShares(realmObjectSource.realmGet$numShares());
        realmObjectTarget.realmSet$updatedAt(realmObjectSource.realmGet$updatedAt());
        realmObjectTarget.realmSet$createdAt(realmObjectSource.realmGet$createdAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmLook = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{uid:");
        stringBuilder.append(realmGet$uid());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{privacy:");
        stringBuilder.append(realmGet$privacy());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numItems:");
        stringBuilder.append(realmGet$numItems());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numLikes:");
        stringBuilder.append(realmGet$numLikes());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numComments:");
        stringBuilder.append(realmGet$numComments());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numShares:");
        stringBuilder.append(realmGet$numShares());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{updatedAt:");
        stringBuilder.append(realmGet$updatedAt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createdAt:");
        stringBuilder.append(realmGet$createdAt());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealmLookRealmProxy aRealmLook = (RealmLookRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRealmLook.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmLook.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRealmLook.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

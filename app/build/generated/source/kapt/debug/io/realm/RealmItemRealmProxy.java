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
public class RealmItemRealmProxy extends com.upco.kloset.repository.local.entity.RealmItem
    implements RealmObjectProxy, RealmItemRealmProxyInterface {

    static final class RealmItemColumnInfo extends ColumnInfo {
        long idIndex;
        long uidIndex;
        long titleIndex;
        long imagesIndex;

        RealmItemColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmItem");
            this.idIndex = addColumnDetails("id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", objectSchemaInfo);
            this.imagesIndex = addColumnDetails("images", objectSchemaInfo);
        }

        RealmItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmItemColumnInfo src = (RealmItemColumnInfo) rawSrc;
            final RealmItemColumnInfo dst = (RealmItemColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.uidIndex = src.uidIndex;
            dst.titleIndex = src.titleIndex;
            dst.imagesIndex = src.imagesIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(4);
        fieldNames.add("id");
        fieldNames.add("uid");
        fieldNames.add("title");
        fieldNames.add("images");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private RealmItemColumnInfo columnInfo;
    private ProxyState<com.upco.kloset.repository.local.entity.RealmItem> proxyState;
    private RealmList<String> imagesRealmList;

    RealmItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.upco.kloset.repository.local.entity.RealmItem>(this);
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
    public RealmList<String> realmGet$images() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (imagesRealmList != null) {
            return imagesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.imagesIndex, RealmFieldType.STRING_LIST);
            imagesRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return imagesRealmList;
        }
    }

    @Override
    public void realmSet$images(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("images")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.imagesIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmItem", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("uid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("images", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmItemColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmItemColumnInfo(schemaInfo);
    }

    public static String getTableName() {
        return "class_RealmItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.upco.kloset.repository.local.entity.RealmItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.upco.kloset.repository.local.entity.RealmItem obj = null;
        if (update) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
            RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class), false, Collections.<String> emptyList());
                    obj = new io.realm.RealmItemRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("images")) {
                excludeFields.add("images");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.RealmItemRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmItem.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.RealmItemRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmItem.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final RealmItemRealmProxyInterface objProxy = (RealmItemRealmProxyInterface) obj;
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
        // TODO implement logic for value list images.
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.upco.kloset.repository.local.entity.RealmItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.upco.kloset.repository.local.entity.RealmItem obj = new com.upco.kloset.repository.local.entity.RealmItem();
        final RealmItemRealmProxyInterface objProxy = (RealmItemRealmProxyInterface) obj;
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
            } else if (name.equals("images")) {
                // TODO implement logic for value list.
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

    public static com.upco.kloset.repository.local.entity.RealmItem copyOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.upco.kloset.repository.local.entity.RealmItem) cachedRealmObject;
        }

        com.upco.kloset.repository.local.entity.RealmItem realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
            RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.RealmItemRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.upco.kloset.repository.local.entity.RealmItem copy(Realm realm, com.upco.kloset.repository.local.entity.RealmItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.upco.kloset.repository.local.entity.RealmItem) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.upco.kloset.repository.local.entity.RealmItem realmObject = realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmItem.class, ((RealmItemRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        RealmItemRealmProxyInterface realmObjectSource = (RealmItemRealmProxyInterface) newObject;
        RealmItemRealmProxyInterface realmObjectCopy = (RealmItemRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$images(realmObjectSource.realmGet$images());
        return realmObject;
    }

    public static long insert(Realm realm, com.upco.kloset.repository.local.entity.RealmItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmItemRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmItemRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        }
        String realmGet$title = ((RealmItemRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }

        RealmList<java.lang.String> imagesList = ((RealmItemRealmProxyInterface) object).realmGet$images();
        if (imagesList != null) {
            OsList imagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.imagesIndex);
            for (java.lang.String imagesItem : imagesList) {
                if (imagesItem == null) {
                    imagesOsList.addNull();
                } else {
                    imagesOsList.addString(imagesItem);
                }
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmItem object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmItemRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmItemRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            }
            String realmGet$title = ((RealmItemRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }

            RealmList<java.lang.String> imagesList = ((RealmItemRealmProxyInterface) object).realmGet$images();
            if (imagesList != null) {
                OsList imagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.imagesIndex);
                for (java.lang.String imagesItem : imagesList) {
                    if (imagesItem == null) {
                        imagesOsList.addNull();
                    } else {
                        imagesOsList.addString(imagesItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmItemRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmItemRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
        }
        String realmGet$title = ((RealmItemRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }

        OsList imagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.imagesIndex);
        imagesOsList.removeAll();
        RealmList<java.lang.String> imagesList = ((RealmItemRealmProxyInterface) object).realmGet$images();
        if (imagesList != null) {
            for (java.lang.String imagesItem : imagesList) {
                if (imagesItem == null) {
                    imagesOsList.addNull();
                } else {
                    imagesOsList.addString(imagesItem);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmItem.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmItem object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmItemRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmItemRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmItemRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
            }
            String realmGet$title = ((RealmItemRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }

            OsList imagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.imagesIndex);
            imagesOsList.removeAll();
            RealmList<java.lang.String> imagesList = ((RealmItemRealmProxyInterface) object).realmGet$images();
            if (imagesList != null) {
                for (java.lang.String imagesItem : imagesList) {
                    if (imagesItem == null) {
                        imagesOsList.addNull();
                    } else {
                        imagesOsList.addString(imagesItem);
                    }
                }
            }

        }
    }

    public static com.upco.kloset.repository.local.entity.RealmItem createDetachedCopy(com.upco.kloset.repository.local.entity.RealmItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.upco.kloset.repository.local.entity.RealmItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.upco.kloset.repository.local.entity.RealmItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.upco.kloset.repository.local.entity.RealmItem) cachedObject.object;
            }
            unmanagedObject = (com.upco.kloset.repository.local.entity.RealmItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        RealmItemRealmProxyInterface unmanagedCopy = (RealmItemRealmProxyInterface) unmanagedObject;
        RealmItemRealmProxyInterface realmSource = (RealmItemRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$uid(realmSource.realmGet$uid());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());

        unmanagedCopy.realmSet$images(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$images().addAll(realmSource.realmGet$images());

        return unmanagedObject;
    }

    static com.upco.kloset.repository.local.entity.RealmItem update(Realm realm, com.upco.kloset.repository.local.entity.RealmItem realmObject, com.upco.kloset.repository.local.entity.RealmItem newObject, Map<RealmModel, RealmObjectProxy> cache) {
        RealmItemRealmProxyInterface realmObjectTarget = (RealmItemRealmProxyInterface) realmObject;
        RealmItemRealmProxyInterface realmObjectSource = (RealmItemRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$images(realmObjectSource.realmGet$images());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmItem = proxy[");
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
        stringBuilder.append("{images:");
        stringBuilder.append("RealmList<String>[").append(realmGet$images().size()).append("]");
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
        RealmItemRealmProxy aRealmItem = (RealmItemRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRealmItem.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRealmItem.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

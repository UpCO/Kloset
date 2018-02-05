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
public class RealmCommentRealmProxy extends com.upco.kloset.repository.local.entity.RealmComment
    implements RealmObjectProxy, RealmCommentRealmProxyInterface {

    static final class RealmCommentColumnInfo extends ColumnInfo {
        long idIndex;
        long uidIndex;
        long typeIndex;
        long contentIndex;
        long numLikesIndex;

        RealmCommentColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmComment");
            this.idIndex = addColumnDetails("id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", objectSchemaInfo);
            this.contentIndex = addColumnDetails("content", objectSchemaInfo);
            this.numLikesIndex = addColumnDetails("numLikes", objectSchemaInfo);
        }

        RealmCommentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmCommentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmCommentColumnInfo src = (RealmCommentColumnInfo) rawSrc;
            final RealmCommentColumnInfo dst = (RealmCommentColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.uidIndex = src.uidIndex;
            dst.typeIndex = src.typeIndex;
            dst.contentIndex = src.contentIndex;
            dst.numLikesIndex = src.numLikesIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(5);
        fieldNames.add("id");
        fieldNames.add("uid");
        fieldNames.add("type");
        fieldNames.add("content");
        fieldNames.add("numLikes");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private RealmCommentColumnInfo columnInfo;
    private ProxyState<com.upco.kloset.repository.local.entity.RealmComment> proxyState;

    RealmCommentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmCommentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.upco.kloset.repository.local.entity.RealmComment>(this);
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
    public int realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentIndex);
    }

    @Override
    public void realmSet$content(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'content' to null.");
            }
            row.getTable().setString(columnInfo.contentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'content' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.contentIndex, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmComment", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("uid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numLikes", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmCommentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmCommentColumnInfo(schemaInfo);
    }

    public static String getTableName() {
        return "class_RealmComment";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.upco.kloset.repository.local.entity.RealmComment createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.upco.kloset.repository.local.entity.RealmComment obj = null;
        if (update) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
            RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class), false, Collections.<String> emptyList());
                    obj = new io.realm.RealmCommentRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.RealmCommentRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmComment.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.RealmCommentRealmProxy) realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmComment.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final RealmCommentRealmProxyInterface objProxy = (RealmCommentRealmProxyInterface) obj;
        if (json.has("uid")) {
            if (json.isNull("uid")) {
                objProxy.realmSet$uid(null);
            } else {
                objProxy.realmSet$uid((String) json.getString("uid"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                objProxy.realmSet$content(null);
            } else {
                objProxy.realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("numLikes")) {
            if (json.isNull("numLikes")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numLikes' to null.");
            } else {
                objProxy.realmSet$numLikes((int) json.getInt("numLikes"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.upco.kloset.repository.local.entity.RealmComment createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.upco.kloset.repository.local.entity.RealmComment obj = new com.upco.kloset.repository.local.entity.RealmComment();
        final RealmCommentRealmProxyInterface objProxy = (RealmCommentRealmProxyInterface) obj;
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
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("content")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$content((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$content(null);
                }
            } else if (name.equals("numLikes")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numLikes((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numLikes' to null.");
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

    public static com.upco.kloset.repository.local.entity.RealmComment copyOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmComment object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.upco.kloset.repository.local.entity.RealmComment) cachedRealmObject;
        }

        com.upco.kloset.repository.local.entity.RealmComment realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
            RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.RealmCommentRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.upco.kloset.repository.local.entity.RealmComment copy(Realm realm, com.upco.kloset.repository.local.entity.RealmComment newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.upco.kloset.repository.local.entity.RealmComment) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.upco.kloset.repository.local.entity.RealmComment realmObject = realm.createObjectInternal(com.upco.kloset.repository.local.entity.RealmComment.class, ((RealmCommentRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        RealmCommentRealmProxyInterface realmObjectSource = (RealmCommentRealmProxyInterface) newObject;
        RealmCommentRealmProxyInterface realmObjectCopy = (RealmCommentRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectCopy.realmSet$content(realmObjectSource.realmGet$content());
        realmObjectCopy.realmSet$numLikes(realmObjectSource.realmGet$numLikes());
        return realmObject;
    }

    public static long insert(Realm realm, com.upco.kloset.repository.local.entity.RealmComment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
        long tableNativePtr = table.getNativePtr();
        RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmCommentRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmCommentRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((RealmCommentRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$numLikes(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
        long tableNativePtr = table.getNativePtr();
        RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmComment object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmComment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmCommentRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmCommentRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((RealmCommentRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$numLikes(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.upco.kloset.repository.local.entity.RealmComment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
        long tableNativePtr = table.getNativePtr();
        RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmCommentRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$uid = ((RealmCommentRealmProxyInterface) object).realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((RealmCommentRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$numLikes(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.upco.kloset.repository.local.entity.RealmComment.class);
        long tableNativePtr = table.getNativePtr();
        RealmCommentColumnInfo columnInfo = (RealmCommentColumnInfo) realm.getSchema().getColumnInfo(com.upco.kloset.repository.local.entity.RealmComment.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.upco.kloset.repository.local.entity.RealmComment object = null;
        while (objects.hasNext()) {
            object = (com.upco.kloset.repository.local.entity.RealmComment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmCommentRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((RealmCommentRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$uid = ((RealmCommentRealmProxyInterface) object).realmGet$uid();
            if (realmGet$uid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uidIndex, rowIndex, realmGet$uid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.uidIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((RealmCommentRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.numLikesIndex, rowIndex, ((RealmCommentRealmProxyInterface) object).realmGet$numLikes(), false);
        }
    }

    public static com.upco.kloset.repository.local.entity.RealmComment createDetachedCopy(com.upco.kloset.repository.local.entity.RealmComment realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.upco.kloset.repository.local.entity.RealmComment unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.upco.kloset.repository.local.entity.RealmComment();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.upco.kloset.repository.local.entity.RealmComment) cachedObject.object;
            }
            unmanagedObject = (com.upco.kloset.repository.local.entity.RealmComment) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        RealmCommentRealmProxyInterface unmanagedCopy = (RealmCommentRealmProxyInterface) unmanagedObject;
        RealmCommentRealmProxyInterface realmSource = (RealmCommentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$uid(realmSource.realmGet$uid());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$numLikes(realmSource.realmGet$numLikes());

        return unmanagedObject;
    }

    static com.upco.kloset.repository.local.entity.RealmComment update(Realm realm, com.upco.kloset.repository.local.entity.RealmComment realmObject, com.upco.kloset.repository.local.entity.RealmComment newObject, Map<RealmModel, RealmObjectProxy> cache) {
        RealmCommentRealmProxyInterface realmObjectTarget = (RealmCommentRealmProxyInterface) realmObject;
        RealmCommentRealmProxyInterface realmObjectSource = (RealmCommentRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$uid(realmObjectSource.realmGet$uid());
        realmObjectTarget.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectTarget.realmSet$content(realmObjectSource.realmGet$content());
        realmObjectTarget.realmSet$numLikes(realmObjectSource.realmGet$numLikes());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmComment = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{uid:");
        stringBuilder.append(realmGet$uid());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numLikes:");
        stringBuilder.append(realmGet$numLikes());
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
        RealmCommentRealmProxy aRealmComment = (RealmCommentRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRealmComment.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmComment.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRealmComment.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

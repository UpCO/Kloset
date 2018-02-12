package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(3);
        modelClasses.add(com.upco.kloset.repository.local.entity.RealmItem.class);
        modelClasses.add(com.upco.kloset.repository.local.entity.RealmLook.class);
        modelClasses.add(com.upco.kloset.repository.local.entity.RealmComment.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(3);
        infoMap.put(com.upco.kloset.repository.local.entity.RealmItem.class, io.realm.RealmItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.upco.kloset.repository.local.entity.RealmLook.class, io.realm.RealmLookRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.upco.kloset.repository.local.entity.RealmComment.class, io.realm.RealmCommentRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return io.realm.RealmItemRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return io.realm.RealmLookRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return io.realm.RealmCommentRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return io.realm.RealmItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return io.realm.RealmLookRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return io.realm.RealmCommentRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return io.realm.RealmItemRealmProxy.getTableName();
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return io.realm.RealmLookRealmProxy.getTableName();
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return io.realm.RealmCommentRealmProxy.getTableName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
                return clazz.cast(new io.realm.RealmItemRealmProxy());
            }
            if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
                return clazz.cast(new io.realm.RealmLookRealmProxy());
            }
            if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
                return clazz.cast(new io.realm.RealmCommentRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return clazz.cast(io.realm.RealmItemRealmProxy.copyOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmItem) obj, update, cache));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return clazz.cast(io.realm.RealmLookRealmProxy.copyOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmLook) obj, update, cache));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return clazz.cast(io.realm.RealmCommentRealmProxy.copyOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmComment) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            io.realm.RealmItemRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmItem) object, cache);
        } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            io.realm.RealmLookRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmLook) object, cache);
        } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            io.realm.RealmCommentRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmComment) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
                io.realm.RealmItemRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmItem) object, cache);
            } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
                io.realm.RealmLookRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmLook) object, cache);
            } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
                io.realm.RealmCommentRealmProxy.insert(realm, (com.upco.kloset.repository.local.entity.RealmComment) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
                    io.realm.RealmItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
                    io.realm.RealmLookRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
                    io.realm.RealmCommentRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            io.realm.RealmItemRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmItem) obj, cache);
        } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            io.realm.RealmLookRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmLook) obj, cache);
        } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            io.realm.RealmCommentRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmComment) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
                io.realm.RealmItemRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmItem) object, cache);
            } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
                io.realm.RealmLookRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmLook) object, cache);
            } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
                io.realm.RealmCommentRealmProxy.insertOrUpdate(realm, (com.upco.kloset.repository.local.entity.RealmComment) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
                    io.realm.RealmItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
                    io.realm.RealmLookRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
                    io.realm.RealmCommentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return clazz.cast(io.realm.RealmItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return clazz.cast(io.realm.RealmLookRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return clazz.cast(io.realm.RealmCommentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return clazz.cast(io.realm.RealmItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return clazz.cast(io.realm.RealmLookRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return clazz.cast(io.realm.RealmCommentRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmItem.class)) {
            return clazz.cast(io.realm.RealmItemRealmProxy.createDetachedCopy((com.upco.kloset.repository.local.entity.RealmItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmLook.class)) {
            return clazz.cast(io.realm.RealmLookRealmProxy.createDetachedCopy((com.upco.kloset.repository.local.entity.RealmLook) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.upco.kloset.repository.local.entity.RealmComment.class)) {
            return clazz.cast(io.realm.RealmCommentRealmProxy.createDetachedCopy((com.upco.kloset.repository.local.entity.RealmComment) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}

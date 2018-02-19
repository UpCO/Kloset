package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J>\u0010\u000b\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0018\u00010\fj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0018\u0001`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002\u00a8\u0006\u0014"}, d2 = {"Lcom/upco/kloset/repository/remote/RedirectionInfoDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/upco/kloset/model/entity/RedirectionInfo;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "readParametersMap", "Ljava/util/ArrayList;", "", "", "", "Lkotlin/collections/ArrayList;", "jsonObject", "Lcom/google/gson/JsonObject;", "Companion", "app_debug"})
public final class RedirectionInfoDeserializer implements com.google.gson.JsonDeserializer<com.upco.kloset.model.entity.RedirectionInfo> {
    private static final java.lang.String KEY_ERROR = "error";
    private static final java.lang.String KEY_MESSAGE = "message";
    private static final java.lang.String KEY_PARAMETERS = "parameters";
    private static final java.lang.String KEY_ITEMS = "items";
    public static final com.upco.kloset.repository.remote.RedirectionInfoDeserializer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.upco.kloset.model.entity.RedirectionInfo deserialize(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonElement json, @org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonDeserializationContext context) {
        return null;
    }
    
    private final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> readParametersMap(com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    public RedirectionInfoDeserializer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/upco/kloset/repository/remote/RedirectionInfoDeserializer$Companion;", "", "()V", "KEY_ERROR", "", "getKEY_ERROR", "()Ljava/lang/String;", "KEY_ITEMS", "getKEY_ITEMS", "KEY_MESSAGE", "getKEY_MESSAGE", "KEY_PARAMETERS", "getKEY_PARAMETERS", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getKEY_ERROR() {
            return null;
        }
        
        private final java.lang.String getKEY_MESSAGE() {
            return null;
        }
        
        private final java.lang.String getKEY_PARAMETERS() {
            return null;
        }
        
        private final java.lang.String getKEY_ITEMS() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
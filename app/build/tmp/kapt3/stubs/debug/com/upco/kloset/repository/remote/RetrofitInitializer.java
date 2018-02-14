package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/upco/kloset/repository/remote/RetrofitInitializer;", "", "()V", "URI", "", "responseBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "Lcom/upco/kloset/model/entity/RedirectionInfo;", "getResponseBodyConverter", "()Lretrofit2/Converter;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "service", "Lcom/upco/kloset/repository/remote/Service;", "getService", "()Lcom/upco/kloset/repository/remote/Service;", "createGsonConverter", "Lretrofit2/converter/gson/GsonConverterFactory;", "app_debug"})
public final class RetrofitInitializer {
    private static final java.lang.String URI = "http://192.168.0.101:8888/kloset/v1/";
    private static final retrofit2.Retrofit retrofit = null;
    public static final com.upco.kloset.repository.remote.RetrofitInitializer INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.repository.remote.Service getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Converter<okhttp3.ResponseBody, com.upco.kloset.model.entity.RedirectionInfo> getResponseBodyConverter() {
        return null;
    }
    
    private final retrofit2.converter.gson.GsonConverterFactory createGsonConverter() {
        return null;
    }
    
    private RetrofitInitializer() {
        super();
    }
}
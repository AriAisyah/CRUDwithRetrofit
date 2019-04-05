package com.aisyah.crudwithretrofit;

public class ConfigApi {

    public static final String BASE_URl = "http://192.168.100.9/serversiswa/";

    public static ApiService getApiService(){
        return RetrofitClient.getClient(BASE_URl).create(ApiService.class);
    }
}

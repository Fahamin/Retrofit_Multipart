package com.ffahim.retrofit_multipart;


import com.google.gson.JsonObject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebApi {
    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/")
    Call<JsonObject> sendOrderSync(@Header("Authorization") String authorization, @Body String body);

    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/")
    Call<JsonObject> sendVisitSync(@Header("Authorization") String authorization, @Body String body);

    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/ApiSyncUpNewOutlet")
    Call<JsonObject> sendNewOutletSync(@Header("Authorization") String authorization, @Body String body);

    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/ApiSyncUpLocation/")
    Call<JsonObject> sendOfflineData(@Body String body);

    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/ApiSyncUpNewOutlet/")
    Call<JsonObject> sendEditOutletSync(@Header("Authorization") String authorization, @Body String body);

    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/ApiSyncUpVisicooler/")
    Call<JsonObject> sendVisicoolerSync(@Header("Authorization") String authorization, @Body String body);


    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("/api/ApiSyncUpVisitDetail")
    Call<JsonObject> sendDamageSync(@Header("Authorization") String authorization, @Body String body);


    @FormUrlEncoded
    @POST("/api/PSRtoken")
    Call<JsonObject> getToken(@Field("username") String username,
                              @Field("password") String password,
                              @Field("grant_type") String grant_type);


    @Headers({"Content-Type: application/json; charset=utf-8"})
    @FormUrlEncoded
    @POST("/api/ApiCheckUser")
    Call<JsonObject> getLoginInfo(
            @FieldMap HashMap<String, String> param,
            @Header("Authorization") String authorization);


    @Headers({"Content-Type: application/json; charset=utf-8"})
    @GET("/api/ApiSyncPromotation?")
    Call<JsonObject> getOfferList(
            @Header("Authorization") String authorization,
            @Query("dbid") String id,
            @Query("psrid") String psrid,
            @Query("token") String token);


    @Headers({"Content-Type: application/json; charset=utf-8"})
    @GET("/api/ApiSyncPromotation/?")
    Call<JsonObject> getOutletList(
            @Header("Authorization") String authorization,
            @Query("dbid") String id,
            @Query("psrid") String psrid,
            @Query("token") String token);

}

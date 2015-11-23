package net.balbum.baby.lib.retrofit;

import net.balbum.baby.VO.AuthVo;
import net.balbum.baby.VO.CardListVo;
import net.balbum.baby.VO.LoginVo;
import net.balbum.baby.VO.ResponseVo;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by hyes on 2015. 11. 15..
 */
public interface TaskService {

    @POST("/api/user/login")
    void createLogin(@Body LoginVo task, Callback<AuthVo> cb);

//    @GET("/api/card")
//    void getCard(@Body GeneralCardVo)
//    @POST("/api/card")

    @Multipart
    @POST("/api/card")
    void createCard(@Part("image") TypedFile file, @Part("content") String content, Callback<ResponseVo> cb);
//    CardFormVo cardFormVo

    @GET("/api/card")
    void getCard(Callback<CardListVo> cb);

}

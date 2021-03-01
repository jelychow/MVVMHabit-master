package com.goldze.mvvmhabit.data.source.http.service;

import com.goldze.mvvmhabit.entity.DemoEntity;
import com.goldze.mvvmhabit.entity.LoginBean;
import com.google.gson.JsonObject;

import io.reactivex.Observable;
import me.goldze.mvvmhabit.http.BaseResponse;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by goldze on 2017/6/15.
 */

public interface DemoApiService {

    @POST("/v1/cash/register/login")
    Observable<LoginBean> doLogin(@Body JsonObject params);

    @POST("/v1/cash/register/logout")
    Observable<LoginBean> logout();

    //添加预约
    @POST("/mall/v1/cash/register/reservation/order/create")
    Observable<LoginBean> createReservation(@Body JsonObject params);

    //今日预约
    @GET("/v1/cash/register/reservation/order/detail")
    Observable<LoginBean> reservation(@Query("page") int page,@Query("size") int size);

    //预约单详情
    @GET("/v1/cash/register/reservation/order/detail")
    Observable<LoginBean> detail(@Query("id") String id);

    //获取美容师服务时间段
    @GET("/mall/v1/cash/register/reservation/beautician/service/period")
    Observable<LoginBean> period(@Query("appointment_date") String appointment_date,@Query("beautician_id") String beautician_id);

    //全部美容师
    @GET("/mall/v1/cash/register/reservation/beautician/all")
    Observable<LoginBean> all();

    //创建订单
    @POST("/mall/v1/cash/register/order/create")
    Observable<LoginBean> createOrder(@Body JsonObject params);

    //会员已购项目
    @GET("/mall/v1/cash/register/member/goods/show")
    Observable<LoginBean> allBuyGoods(@Query("member_id") String member_id);

    //会员列表
    @GET("/mall/v1/cash/register/member/show")
    Observable<LoginBean> detail(@Query("mobile") String mobile,@Query("page") String page,@Query("size") String size);


    //首页统计
    @GET("/mall/v1/cash/register/home")
    Observable<LoginBean> home();

    //全部商品
    @GET("/mall/v1/cash/register/reservation/goods/all")
    Observable<LoginBean> allGoods();

    //商品列表
    @GET("/mall/v1/cash/register/goods/show")
    Observable<LoginBean> allGoods(@Query("category_id") String category_id,@Query("status") String status,@Query("page") String page,@Query("size") String size);

    //商品分类
    @GET("/mall/v1/cash/register/goods/category/show")
    Observable<LoginBean> getCategory(@Query("mobile") String mobile,@Query("page") String page,@Query("size") String size);



    @GET("action/apiv2/banner?catalog=1")
    Observable<BaseResponse<DemoEntity>> demoGet();

    @FormUrlEncoded
    @POST("action/apiv2/banner")
    Observable<BaseResponse<DemoEntity>> demoPost(@Field("catalog") String catalog);
}

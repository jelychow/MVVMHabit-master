package com.goldze.mvvmhabit.entity;

import java.util.List;

/**
 * Created by z2 on 2/27/21.
 * company
 */
public class LoginBean {


    /**
     * code : 2000
     * data : {"storeId":1,"storeName":"吴中店","merchantId":1,"number":"77777","from":"PostmanRuntime/7.26.8:127.0.0.1","token":"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2MDM5YmU4MGI2ODcxIiwiaWF0IjoxNjE0Mzk3MDU2LCJuYmYiOjE2MTQzOTcwNTYsImV4cCI6MTYxNDQ4MzQ1Niwic3RvcmVJZCI6MSwic3RvcmVOYW1lIjoiXHU1NDM0XHU0ZTJkXHU1ZTk3IiwibWVyY2hhbnRJZCI6MSwibnVtYmVyIjoiNzc3NzciLCJmcm9tIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuODoxMjcuMC4wLjEifQ.23cnJA6Qi1qZcUHs6sE1ZxNYHaGdaTUAlH-4DLHUvK8","expire":86400}
     * other : []
     * message : 登录成功
     */

    @com.google.gson.annotations.SerializedName("code")
    private int code;
    @com.google.gson.annotations.SerializedName("data")
    private DataDTO data;
    @com.google.gson.annotations.SerializedName("message")
    private String message;
    @com.google.gson.annotations.SerializedName("other")
    private List<?> other;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<?> getOther() {
        return other;
    }

    public void setOther(List<?> other) {
        this.other = other;
    }

    public static class DataDTO {
        /**
         * storeId : 1
         * storeName : 吴中店
         * merchantId : 1
         * number : 77777
         * from : PostmanRuntime/7.26.8:127.0.0.1
         * token : Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2MDM5YmU4MGI2ODcxIiwiaWF0IjoxNjE0Mzk3MDU2LCJuYmYiOjE2MTQzOTcwNTYsImV4cCI6MTYxNDQ4MzQ1Niwic3RvcmVJZCI6MSwic3RvcmVOYW1lIjoiXHU1NDM0XHU0ZTJkXHU1ZTk3IiwibWVyY2hhbnRJZCI6MSwibnVtYmVyIjoiNzc3NzciLCJmcm9tIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuODoxMjcuMC4wLjEifQ.23cnJA6Qi1qZcUHs6sE1ZxNYHaGdaTUAlH-4DLHUvK8
         * expire : 86400
         */

        @com.google.gson.annotations.SerializedName("storeId")
        private int storeId;
        @com.google.gson.annotations.SerializedName("storeName")
        private String storeName;
        @com.google.gson.annotations.SerializedName("merchantId")
        private int merchantId;
        @com.google.gson.annotations.SerializedName("number")
        private String number;
        @com.google.gson.annotations.SerializedName("from")
        private String from;
        @com.google.gson.annotations.SerializedName("token")
        private String token;
        @com.google.gson.annotations.SerializedName("expire")
        private int expire;

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public int getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(int merchantId) {
            this.merchantId = merchantId;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getExpire() {
            return expire;
        }

        public void setExpire(int expire) {
            this.expire = expire;
        }
    }
}


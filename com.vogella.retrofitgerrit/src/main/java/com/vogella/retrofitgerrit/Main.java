package com.vogella.retrofitgerrit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.http.GET;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start("AliciaCarmonaLopez");



        // @GET("users")
        // Observable<List<User>> getUsers();
    }
}

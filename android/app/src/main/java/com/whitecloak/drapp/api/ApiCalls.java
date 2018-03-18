package com.whitecloak.drapp.api;

import com.whitecloak.drapp.models.Dispute;
import com.whitecloak.drapp.models.Product;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by kimnicolemontano on 2017/11/11.
 */

public interface ApiCalls {

    @GET(".")
    Observable<Response<Product>> getProduct();

    @GET("Milestone")
    Observable<Response<List<Dispute>>> getDispute();
}

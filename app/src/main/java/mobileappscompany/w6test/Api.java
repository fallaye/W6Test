package mobileappscompany.w6test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;

/**
 * Created by fallaye on 1/12/18.
 */

public interface Api {

    String BASE_URL = "http://iwg-prod-web-interview.azurewebsites.net/stem/";


    @GET("v1/funds")
    Call<List<Stem>> getStems();

    @PUT("v1/query")
    void addStem();

}

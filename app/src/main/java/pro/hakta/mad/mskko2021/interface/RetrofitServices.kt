package pro.hakta.mad.mskko2021.`interface`

import pro.hakta.mad.mskko2021.model.User
import pro.hakta.mad.mskko2021.model.UserRequest
import pro.hakta.mad.mskko2021.response.FeelingsResponse
import pro.hakta.mad.mskko2021.response.QuotesResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST


interface RetrofitServices {
    @Headers("Content-Type: application/json")
    @GET("quotes")
    fun getQuotes(): Call<MutableList<QuotesResponse>>

    @Headers("Content-Type: application/json")
    @GET("feelings")
    fun getFeelings(): Call<MutableList<FeelingsResponse>>

    @Headers("Content-Type: application/json")
    @POST("user/login")
    fun login(@Body user: UserRequest): Call<MutableList<User>>
}
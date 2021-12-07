package pro.hakta.mad.mskko2021.common

import pro.hakta.mad.mskko2021.`interface`.RetrofitServices
import pro.hakta.mad.mskko2021.retrofit.RetrofitClient

object Common {
    private const val BASE_URL = "http://mskko2021.mad.hakta.pro/api/"

    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}
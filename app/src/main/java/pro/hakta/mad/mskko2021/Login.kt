package pro.hakta.mad.mskko2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import pro.hakta.mad.mskko2021.`interface`.RetrofitServices
import pro.hakta.mad.mskko2021.common.Common
import pro.hakta.mad.mskko2021.model.User
import pro.hakta.mad.mskko2021.model.UserRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login : AppCompatActivity() {
    private lateinit var mService: RetrofitServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mService = Common.retrofitService
    }

    fun signIn(view: View) {
        val email = view.findViewById<EditText>(R.id.et_email).text.toString()
        val password = view.findViewById<EditText>(R.id.et_password).text.toString()

        val user = UserRequest(email, password)

        mService.login(user).enqueue(object : Callback<MutableList<User>> {
            override fun onFailure(call: Call<MutableList<User>>, t: Throwable) {}

            override fun onResponse(
                call: Call<MutableList<User>>,
                response: Response<MutableList<User>>
            ) {
                val userResponse = response.body() as MutableList<User>

                userResponse[0].id?.let { Log.i("ID", it.toString()) }
                userResponse[0].email?.let { Log.i("Email", it) }
                userResponse[0].nickName?.let { Log.i("Nickname", it) }
                userResponse[0].avatar?.let { Log.i("Avatar", it) }
                userResponse[0].token?.let { Log.i("Token", it) }
            }
        })
    }

    fun register(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun goToProfile(view: View) {

    }

}
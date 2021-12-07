package pro.hakta.mad.mskko2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Mskko2021)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun register(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}
package com.sriyank.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val log1 = findViewById<Button>(R.id.login1)
        log1.setOnClickListener {
            val intent = Intent(this, login_activity::class.java)
            startActivity(intent)


        val signup = findViewById<Button>(R.id.signUpbtn)
        signup.setOnClickListener {
            val intent = Intent(this, signup_activity::class.java)
            startActivity(intent)
        }



    }
}

}
package uz.nabijonov.otabek.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_log.setOnClickListener {
            val intent3 = Intent(this, HomeActivity::class.java)
            startActivity(intent3)
        }

        tv_forgotPword.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        tv_newUser.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            startActivity(intent2)
        }


    }
}
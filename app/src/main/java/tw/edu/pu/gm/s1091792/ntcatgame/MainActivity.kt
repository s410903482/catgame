package tw.edu.pu.gm.s1091792.ntcatgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this, MusicService::class.java).also { intent ->
            startService(intent)
        }
    }

    fun swac(view: View){
        val intent = Intent(this, SignInActivity::class.java )
        startActivity(intent)
    }

}
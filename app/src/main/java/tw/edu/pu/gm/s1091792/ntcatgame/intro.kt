package tw.edu.pu.gm.s1091792.ntcatgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro)

        Intent(this, MusicService::class.java).also { intent ->
            startService(intent)
        }
    }

    fun swac1(view: View){
        val intent = Intent(this, page1::class.java )
        startActivity(intent)
    }
}
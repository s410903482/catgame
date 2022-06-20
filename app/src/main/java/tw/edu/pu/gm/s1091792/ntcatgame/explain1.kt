package tw.edu.pu.gm.s1091792.ntcatgame

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class explain1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explain1);

        Intent(this, MusicService::class.java).also { intent ->
            startService(intent)
        }
    }

    fun swac(view: View){
        val intent = Intent(this, page2::class.java )
        startActivity(intent)
    }

}
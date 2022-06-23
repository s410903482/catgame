package tw.edu.pu.gm.s1091792.ntcatgame

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import tw.edu.pu.gm.s1091792.ntcatgame.databinding.Page1Binding

class page1 : AppCompatActivity(), View.OnTouchListener {

    lateinit var binding: Page1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.page1);

        binding = Page1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setOnTouchListener(this)
        binding.imageView2.setOnTouchListener(this)

        Intent(this, MusicService::class.java).also { intent ->
            startService(intent)
        }
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        if (event?.action == MotionEvent.ACTION_MOVE){
            v?.x = event.rawX- v!!.width/2
            v?.y = event.rawY- v!!.width/2
        }
        return true
    }

    fun swac(view: View){
        val intent = Intent(this, explain1::class.java )
        startActivity(intent)
    }

}
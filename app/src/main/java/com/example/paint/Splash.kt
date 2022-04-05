package com.example.paint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text


class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val midAnim = AnimationUtils.loadAnimation(this, R.anim.middle_animation)
        val botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val imageAnim = AnimationUtils.loadAnimation(this, R.anim.image_anim)

        val topText = findViewById<TextView>(R.id.TopTextView)
        val midText = findViewById<TextView>(R.id.MiddleTextView)
        val botText = findViewById<TextView>(R.id.BottomTextView)
        val image = findViewById<ImageView>(R.id.image)
        topText.startAnimation(topAnim)
        midText.startAnimation(midAnim)
        botText.startAnimation(botAnim)
        image.startAnimation(imageAnim)

        val splashScreentTime = 4000
        val homeIntent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent)
                finish()
        },splashScreentTime.toLong())


    }
}
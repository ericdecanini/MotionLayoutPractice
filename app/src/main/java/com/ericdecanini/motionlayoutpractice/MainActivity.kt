package com.ericdecanini.motionlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onResume() {
    super.onResume()
    val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
    Handler().postDelayed( {
      motionLayout.transitionToEnd()
    }, 2000)


    Handler().postDelayed({
      motionLayout.transitionToStart()
    }, 6000)
  }
}

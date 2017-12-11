package net.simplifiedcoding.kotlinrecyclerviewexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by kennethfernandez on 12/8/17.
 */
class PanCakes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pan_cakes)
        var btn_new_activity = findViewById(R.id.buttreturn)
        btn_new_activity.setOnClickListener {
            val intent = Intent(this@PanCakes, MainActivity::class.java)
            startActivity(intent)

        }


       }








}
package net.simplifiedcoding.kotlinrecyclerviewexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by kennethfernandez on 12/6/17.
 */
class RagiSamosa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ragi_samosa)

        var btn_new_activity = findViewById(R.id.buttreturn4)
        btn_new_activity.setOnClickListener {
            val intent = Intent(this@RagiSamosa, MainActivity::class.java)
            startActivity(intent)
        }
    }


}
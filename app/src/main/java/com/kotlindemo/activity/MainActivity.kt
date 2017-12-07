package com.kotlindemo.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlindemo.R
import com.kotlindemo.utlis.NetworkAvailablity.instance
import com.kotlindemo.utlis.SharePreferenceUtility
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // var button: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finish();

        txtHello.setOnClickListener {
            // val intent = Intent(this, HomeActivity::class.java)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        if (instance.checkNetworkStatus(this)) {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        }

        txtName.text = "kotlin is working fine";

        //Calling functions uses the traditional approach

        val result = double(2)

        val a = 1
        val b = 1

        SharePreferenceUtility.getInstance(this).getBoolean("dfsdf");
    }


    /**
     * Functions in Kotlin are declared using the fun keyword
     */

    fun double(x: Int): Int {
        return 2 * x
    }

    override fun onStart() {
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}

package com.kotlindemo.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlindemo.R
import com.kotlindemo.utlis.UserInterface
import kotlinx.android.synthetic.main.activity_home_activity.*

class HomeActivity : AppCompatActivity(), UserInterface {



    val nullableList: List<Int?> = listOf(1, 2, null, 4, 54, 34, null, 12, null, 65, null, 90, null, 34)
    val intList: List<Int> = nullableList.filterNotNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_activity)

        listSize.text = intList.size.toString();


    }

    override fun onStart() {
        super.onStart()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }


    override fun get(i: Int?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getA(i: Int?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getB(i: Int?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

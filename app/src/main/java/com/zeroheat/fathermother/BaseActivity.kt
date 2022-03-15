package com.zeroheat.fathermother

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeroheat.fathermother.api.APIList
import com.zeroheat.fathermother.api.ServerAPI

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext: Context

    lateinit var apiList: APIList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this

//        val retrofit = ServerAPI.getRetrofit(mContext)
//        apiList = retrofit.create(APIList::class.java)

    }


    abstract fun setupEvents()
    abstract fun setValues()

}
package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewNumbers(100)


    }
    fun viewNumbers(finum:Int):List<BigInteger>{
        rvNumbers=findViewById(R.id.rvnumbers)
        var first=BigInteger.ZERO
        var second=BigInteger.ONE

        var numbers= MutableList<BigInteger>(finum,{java.math.BigInteger.ZERO})
        var numbersAdapter=RecyclerViewNumbers(numbers)
        numbers[0]=first
        numbers[1]=second
        for( x in 1..finum){
            var addfibonnachiNumbers=first+second
            first=second
            second=addfibonnachiNumbers
            numbers[x-1]=first


        }
        rvNumbers.layoutManager=LinearLayoutManager(baseContext,LinearLayoutManager.HORIZONTAL,false)
        rvNumbers.adapter=numbersAdapter
        return numbers

    }

}
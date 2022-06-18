package com.example.customcheckboxkot16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mcheckboxjava:CheckBox
    private lateinit var mcheckboxkotlin:CheckBox
    private lateinit var mSubmitbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mcheckboxjava=findViewById(R.id.checkBox)
        mcheckboxkotlin=findViewById(R.id.checkBox2)
        mSubmitbtn=findViewById(R.id.button)
        mSubmitbtn.setOnClickListener {
            val sb:StringBuilder=StringBuilder("")
            if (mcheckboxjava.isChecked){
                val str1=mcheckboxjava.text.toString()
                sb.append(str1)
            }
            if (mcheckboxkotlin.isChecked){
                val str2=mcheckboxkotlin.text.toString()
                sb.append("\n"+str2)
            }
            if (sb.toString() != ""){
                Toast.makeText(this@MainActivity,sb,Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this@MainActivity,"nothing selected",Toast.LENGTH_LONG).show()
            }

        }
    }
}
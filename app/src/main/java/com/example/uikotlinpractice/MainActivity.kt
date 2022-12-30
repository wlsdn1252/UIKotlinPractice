package com.example.uikotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {
            //입력된 내용을 변수에 저장(get)
            val inputContent = contentEdt.text.toString()

            // 저장해둔 입력값을 텍스트뷰의 내용에 반영(set)
            resultTxt.text = inputContent
        }

    }
}
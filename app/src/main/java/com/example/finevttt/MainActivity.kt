package com.example.finevttt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        // 검색 버튼을 찾습니다.
        val searchButton = findViewById<Button>(R.id.search_btn)

        // 검색 버튼에 클릭 리스너를 추가합니다.
        searchButton.setOnClickListener { // 클릭 시 실행할 코드를 작성합니다.
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent)
        }
    }
}
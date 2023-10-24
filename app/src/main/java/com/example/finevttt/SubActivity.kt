package com.example.finevttt

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // 이미지 클릭 시 토스트 메시지
        val imageView = findViewById<ImageView>(R.id.imgShowToast)
        imageView.setOnClickListener {
            // 이미지 클릭 시 실행할 코드
            showToast("이미지를 클릭했습니다.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
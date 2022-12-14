package jp.techacademy.chiharu.akiba.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        }
    override fun onClick(v: View) {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if(hour>=2 && hour<=9)
                    textView.text = "おはよう"

                if(hour>=10 && hour<=17)
                    textView.text = "こんにちは"

                if(hour>=18)
                    textView.text = "こんばんは"

                if(hour>=0 && hour<=1)
                    textView.text = "こんばんは"
            },
            13, 0, true)
        timePickerDialog.show()
    }

}
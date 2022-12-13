package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener(){
            var num1 = n1.text.toString()
            val nu1 = num1.toDouble()
            var num2 = n2.text.toString()
            val nu2 = num2.toDouble()
            var sum: Double = 0.0
            sum = nu1 + nu2
            total.setText(sum.toString())
            mark.setText("+")
        }
        minus.setOnClickListener(){
            var num1 = n1.text.toString()
            val nu1 = num1.toDouble()
            var num2 = n2.text.toString()
            val nu2 = num2.toDouble()
            var sum: Double = 0.0
            sum = nu1 - nu2
            total.setText(sum.toString())
            mark.setText("-")
        }
        mutiply.setOnClickListener(){
            var num1 = n1.text.toString()
            val nu1 = num1.toDouble()
            var num2 = n2.text.toString()
            val nu2 = num2.toDouble()
            var sum: Double = 0.0
            sum = nu1 * nu2
            total.setText(sum.toString())
            mark.setText("*")
        }
        divider.setOnClickListener(){
            var num1 = n1.text.toString()
            val nu1 = num1.toDouble()
            var num2 = n2.text.toString()
            val nu2 = num2.toDouble()
            var sum: Double = 0.0
            if(nu2 <= 0){
                Toast.makeText(applicationContext,"Do not Num2 is zero or Null ",Toast.LENGTH_SHORT).show()
                n2.setText(" ")
            }
            else{
                sum = nu1 / nu2
                total.setText(sum.toString())
                mark.setText("/")
            }
        }
        modulo.setOnClickListener() {
            var num1 = n1.text.toString()
            val nu1 = num1.toDouble()
            var num2 = n2.text.toString()
            val nu2 = num2.toDouble()
            var sum: Double = 0.0
            sum = nu1 % nu2
            total.setText(sum.toString())
            mark.setText("%")
        }
        clear.setOnClickListener(){
            n1.setText("")
            n2.setText("")
            mark.setText("")
            total.setText("")
        }

    }
}
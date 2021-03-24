package com.example.a111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1:Int = 0
        var ch = 0
        var pl = ""

        var sum = 0

        zero.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("0")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(0)
                T.setText(str)
            }
        }

        one.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("1")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(1)
                T.setText(str)
            }
        }

        two.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("2")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(2)
                T.setText(str)
            }
        }

        three.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("3")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(3)
                T.setText(str)
            }
        }

        four.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
               T.setText("4")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(4)
                T.setText(str)
            }
        }

        five.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("5")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(5)
                T.setText(str)
            }
        }

        six.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
               T.setText("6")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(6)
                T.setText(str)
            }
        }

        seven.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
               T.setText("7")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(7)
                T.setText(str)
            }
        }

        eight.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("8")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(8)
                T.setText(str)
            }
        }

        nine.setOnClickListener {
            if(T.text.toString() == "0" || ch == 1) {
                T.setText("9")
                ch = 0
            }
            else{
                var str = T.text.toString().plus(9)
                T.setText(str)
            }
        }

        C.setOnClickListener {
            T.setText("0")
        }

        del.setOnClickListener {
            if(T.text.toString().length <= 1) {
                T.setText("0")

            }
            else if(T.text.isNotEmpty()){
                T.text = T.text.dropLast(1)

            }
        }

        plus.setOnClickListener {
            num1 = T.text.toString().toInt()
            ch = 1
            pl = "plus"
        }

        minus.setOnClickListener {
            num1 = T.text.toString().toInt()
            ch = 1
            pl = "minus"
        }

        mul.setOnClickListener {
            num1 = T.text.toString().toInt()
            ch = 1
            pl = "mul"
        }

        div.setOnClickListener {
            num1 = T.text.toString().toInt()
            ch = 1
            pl = "div"
        }

        mod.setOnClickListener {
            num1 = T.text.toString().toInt()
            ch = 1
            pl = "mod"
        }


        qual.setOnClickListener {
            if(pl == "plus") {
                sum = num1 + T.text.toString().toInt()
                T.setText(sum.toString())
            }
            else if (pl == "minus"){
                sum = num1 - T.text.toString().toInt()
                T.setText(sum.toString())

            }
            else if (pl == "mul"){
                sum = num1 * T.text.toString().toInt()
                T.setText(sum.toString())
            }
            else if (pl == "div"){
                sum = num1 / T.text.toString().toInt()
                T.setText(sum.toString())
            }
            else if (pl == "mod"){

                var mod = 0
                sum = num1 % T.text.toString().toInt()

                T.setText(sum.toString())
            }

        }
    }
}
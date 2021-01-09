package com.example.calculator

import android.os.Bundle
import android.os.Vibrator
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var showMoreButton: Boolean = false
    private var calBool: Boolean = false
    private var opeSuper = mapOf('+' to 1, '-' to 1, '×' to 2, '÷' to 2, '%' to 2, '(' to 3, ')' to 3)
    private var opeList = "+-×÷%"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMore(showMoreButton)
        button_01.setOnClickListener(this)
        button_02.setOnClickListener(this)
        button_03.setOnClickListener(this)
        button_04.setOnClickListener(this)
        button_05.setOnClickListener(this)
        button_06.setOnClickListener(this)
        button_07.setOnClickListener(this)
        button_08.setOnClickListener(this)
        button_09.setOnClickListener(this)
        button_10.setOnClickListener(this)
        button_11.setOnClickListener(this)
        button_12.setOnClickListener(this)
        button_13.setOnClickListener(this)
        button_14.setOnClickListener(this)
        button_15.setOnClickListener(this)
        button_16.setOnClickListener(this)
        button_17.setOnClickListener(this)
        button_18.setOnClickListener(this)
        button_19.setOnClickListener(this)
        button_20.setOnClickListener(this)
        button_21.setOnClickListener(this)
        button_22.setOnClickListener(this)
        button_23.setOnClickListener(this)
        button_more.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var text_display_content = display_content.text.toString()
        display_content.textSize = 45F
        display_sum.textSize = 35F
        display_content.setTextColor(0xff000000.toInt())
        display_sum.setTextColor(0xff6E6E6E.toInt())

        if(calBool) {
            var num = display_sum.text.toString().substring(2, display_sum.text.toString().length)
            if(num[0] == '-') {
                text_display_content = "(0$num)"
            } else {
                text_display_content = "$num"
            }
        }

        when (v?.id) {
            R.id.button_01 -> {
                if(calBool) {
                    display_content.text = "0"
                    calBool = false
                } else if(text_display_content != "0") {
                    display_content.text = (text_display_content + "0")
                }
            }
            R.id.button_02 -> {
                if(calBool) {
                    display_content.text = "1"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "1")
                }
            }
            R.id.button_03 -> {
                if(calBool) {
                    display_content.text = "2"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "2")
                }
            }
            R.id.button_04 -> {
                if(calBool) {
                    display_content.text = "3"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "3")
                }
            }
            R.id.button_05 -> {
                if(calBool) {
                    display_content.text = "4"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "4")
                }
            }
            R.id.button_06 -> {
                if(calBool) {
                    display_content.text = "5"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "5")
                }
            }
            R.id.button_07 -> {
                if(calBool) {
                    display_content.text = "6"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "6")
                }
            }
            R.id.button_08 -> {
                if(calBool) {
                    display_content.text = "7"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "7")
                }
            }
            R.id.button_09 -> {
                if(calBool) {
                    display_content.text = "8"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "8")
                }
            }
            R.id.button_10 -> {
                if(calBool) {
                    display_content.text = "9"
                    calBool = false
                } else {
                    display_content.text = (text_display_content + "9")
                }
            }

            R.id.button_11 -> {
                if(calBool) {
                    display_content.text = "."
                    calBool = false
                } else {
                    display_content.text = (text_display_content + ".")
                }
            }

            R.id.button_12 -> {
                calBool = true
            }

            R.id.button_13 -> {
                if(text_display_content == "") {
                    display_content.setText("0+")
                } else if(opeList.indexOf(text_display_content.last()) != -1) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1) + "+")
                } else {
                    display_content.setText(text_display_content + "+")
                    calBool = false
                }
            }
            R.id.button_14 -> {
                if(text_display_content == "") {
                    display_content.setText("0-")
                } else if(opeList.indexOf(text_display_content.last()) != -1) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1) + "-")
                } else {
                    display_content.setText(text_display_content + "-")
                    calBool = false
                }
            }
            R.id.button_15 -> {
                if(text_display_content == "") {
                    display_content.setText("0×")
                } else if(opeList.indexOf(text_display_content.last()) != -1) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1) + "×")
                } else {
                    display_content.setText(text_display_content + "×")
                    calBool = false
                }
            }
            R.id.button_16 -> {
                if(text_display_content == "") {
                    display_content.setText("0÷")
                } else if(opeList.indexOf(text_display_content.last()) != -1) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1) + "÷")
                } else {
                    display_content.setText(text_display_content + "÷")
                    calBool = false
                }
            }
            R.id.button_17 -> {
                if(text_display_content == "") {
                    display_content.setText("0%")
                } else if(opeList.indexOf(text_display_content.last()) != -1) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1) + "%")
                } else {
                    display_content.setText(text_display_content + "%")
                    calBool = false
                }
            }

            R.id.button_18 -> {
                if(text_display_content.length > 1 && !calBool) {
                    display_content.setText(text_display_content.substring(0, text_display_content.length-1))
                } else {
                    display_content.setText("")
                    display_sum.text = "0"
                    calBool = false
                }
            }
            R.id.button_19 -> {
                display_content.setText("")
                display_sum.text = "0"
                calBool = false
            }

            R.id.button_more -> {
                showMoreButton = !showMoreButton
                showMore(showMoreButton)
            }

            R.id.button_20 -> {
                display_content.setText(text_display_content + "(")
                calBool = false
            }
            R.id.button_21 -> {
                display_content.setText(text_display_content + ")")
                calBool = false
            }
            R.id.button_22 -> {
                if(text_display_content == "") {
                    display_content.setText("π")
                } else {
                    when(text_display_content.lastOrNull()) {
                        '+', '-', '×', '÷', '%', '(' -> display_content.setText(text_display_content + "π")
                        else -> display_content.setText(text_display_content + "×π")
                    }
                }
                calBool = false
            }
            R.id.button_23 -> {
                if(text_display_content == "") {
                    display_content.setText("e")
                } else {
                    when(text_display_content.lastOrNull()) {
                        '+', '-', '×', '÷', '%', '(' -> display_content.setText(text_display_content + "e")
                        else -> display_content.setText(text_display_content + "×e")
                    }
                }
                calBool = false
            }
        }
        if(display_content.text.toString() != "") {
            if (calBool) {
                display_content.textSize = 25F
                display_sum.textSize = 45F
                display_content.setTextColor(0xff6E6E6E.toInt())
                display_sum.setTextColor(0xff000000.toInt())
                display_sum.setText("= " + calculate(inStack(display_content.text.toString())))
            } else {
                display_sum.setText(calculate(inStack(display_content.text.toString())))
            }
        }

        if(calBool) {
            button_19.text = "AC"
        } else {
            button_19.text = "C"
        }
    }


    fun inStack(calText: String): Stack<String> {
        var calText1 = calText
        var calString = Stack<String>()
        var tempNum = String()
        var opeStack = Stack<Char>()

        var isError : Boolean
        isError = false
        // 错误监控
        var calErrorString = Stack<String>()
        calErrorString.push(".")

        while("+-×÷%()".indexOf(calText1.last()) != -1 && calText1.isNotEmpty()) {
            calText1 = calText.substring(0, calText1.length-1)
        }
        for(c in calText1) {
            when(c) {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' -> {
                    tempNum += c.toString()
                }
                '+', '-', '×', '÷', '%' -> {
                    if(tempNum != "") {
                        if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                            isError = true
                        } else {
                            calString.push(tempNum)
                        }
                        tempNum = ""
                    }
                    while(!opeStack.isEmpty()
                            && opeStack.peek() != '('
                            && opeSuper[c]!! <= opeSuper[opeStack.peek()]!!
                    ) {
                        calString.push(opeStack.pop().toString())
                    }
                    opeStack.push(c)
                }
                '(' -> {
                    if(tempNum != "") {
                        if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                            isError = true
                        } else {
                            calString.push(tempNum)
                        }
                        tempNum = ""
                    }
                    opeStack.push(c)
                }
                ')' -> {
                    if(tempNum != "") {
                        if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                            isError = true
                        } else {
                            calString.push(tempNum)
                        }
                        tempNum = ""
                    }
                    while(!opeStack.isEmpty()) {
                        if(opeStack.peek() == '(') {
                            opeStack.pop()
                            break
                        } else {
                            calString.push(opeStack.pop().toString())
                        }
                    }
                }
                'e' -> {
                    if(tempNum != "") {
                        if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                            isError = true
                        } else {
                            calString.push(tempNum)
                        }
                        tempNum = ""
                    }
                    calString.push("2.718281828459")
                }
                'π' -> {
                    if(tempNum != "") {
                        if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                            isError = true
                        } else {
                            calString.push(tempNum)
                        }
                        tempNum = ""
                    }
                    calString.push("3.1415926535898")
                }
            }
        }
        if(tempNum != "") {
            if(tempNum[0] == '.' || tempNum.indexOfFirst { it == '.' } != tempNum.indexOfLast { it == '.' }) {
                isError = true
            } else {
                calString.push(tempNum)
            }
            tempNum = ""
        }
        Log.d("Error", isError.toString())
        while(!opeStack.isEmpty()) {
            Log.d("notEmpty", opeStack.toString())
            calString.push(opeStack.pop().toString())
        }
        if(isError) {
            Log.d("Error", calErrorString.toString())
            return calErrorString
        }
        return calString
    }

    private fun calculate(calStack: Stack<String>): String {
        Log.d("calStack", calStack.toString())
        if(calStack.count() == 0) return "0"
        var i = 0
        while(i < calStack.count()) {
            when(calStack[i]) {
                "+" -> {
                    calStack.add(i-2, ((calStack[i-2].toDouble()) + (calStack[i-1].toDouble())).toString())
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    i -= 2
                }
                "-" -> {
                    calStack.add(i-2, ((calStack[i-2].toDouble()) - (calStack[i-1].toDouble())).toString())
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    i -= 2
                }
                "×" ->  {
                    calStack.add(i-2, ((calStack[i-2].toDouble()) * (calStack[i-1].toDouble())).toString())
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    i -= 2
                }
                "÷" ->  {
                    calStack.add(i-2, ((calStack[i-2].toDouble()) / (calStack[i-1].toDouble())).toString())
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    i -= 2
                }
                "%" ->  {
                    calStack.add(i-2, ((calStack[i-2].toDouble()) % (calStack[i-1].toDouble())).toString())
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    calStack.removeAt(i-1)
                    i -= 2
                }
                else -> i++
            }
        }
        Log.d("sum", calStack[0].toLongOrNull().toString())
        if(calStack[0].toDoubleOrNull() == null) return "输入有误哦"
        if(calStack[0].length > 12) {
            return calStack[0].substring(0, 11)
        }
        return calStack[0]
    }

    private fun showMore(showMoreButton:Boolean) {
        button_20.visibility = (if(!showMoreButton) View.GONE else View.VISIBLE)
        button_21.visibility = if(!showMoreButton) View.GONE else View.VISIBLE
        button_22.apply {
            visibility = if(!showMoreButton) View.GONE else View.VISIBLE
        }
        button_23.apply {
            visibility = if(!showMoreButton) View.GONE else View.VISIBLE
        }
        button_24.apply {
            visibility = if(!showMoreButton) View.GONE else View.VISIBLE
        }
    }
}

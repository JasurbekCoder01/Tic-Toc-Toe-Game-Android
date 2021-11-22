package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var bt1:Button
    lateinit var bt2:Button
    lateinit var bt3:Button
    lateinit var bt4:Button
    lateinit var bt5:Button
    lateinit var bt6:Button
    lateinit var bt7:Button
    lateinit var bt8:Button
    lateinit var bt9:Button
    lateinit var btn: Button
    lateinit var txt: TextView
    lateinit var bt: Button
    lateinit var text: TextView
    var j: Boolean = false
    private  var x: Int = 0
    var o: Int = 0
    var t: Int = 0
    var g: Int = 0
    var sk = "X"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txt = findViewById(R.id.text)
        bt1 = findViewById(R.id.button1)
        bt2 = findViewById(R.id.button2)
        bt3 = findViewById(R.id.button3)
        bt4 = findViewById(R.id.button4)
        bt5 = findViewById(R.id.button5)
        bt6 = findViewById(R.id.button6)
        bt7 = findViewById(R.id.button7)
        bt8 = findViewById(R.id.button8)
        bt9 = findViewById(R.id.button9)
        btn = findViewById(R.id.newbtn)
        bt = findViewById(R.id.cont)
        text = findViewById(R.id.navtxt)

        bt1.setOnClickListener {
            golib()

           if(bt1.text.toString().isEmpty())
           {
               bt1.text = sk
               react()

               if(sk == "X") {
                   sk = "O"

               }
               else{
                   sk = "X"
               }
           }
            teng()
        }
        bt2.setOnClickListener {
            golib()

            if(bt2.text.toString().isEmpty())
            {
                bt2.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt3.setOnClickListener {
            golib()

            if(bt3.text.toString().isEmpty())
            {
                bt3.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()

        }
        bt4.setOnClickListener {
            golib()
            if(bt4.text.toString().isEmpty())
            {
                bt4.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt5.setOnClickListener {
            golib()

            if(bt5.text.toString().isEmpty())
            {
                bt5.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt6.setOnClickListener {
            golib()

            if(bt6.text.toString().isEmpty())
            {
                bt6.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt7.setOnClickListener {
            golib()

            if(bt7.text.toString().isEmpty())
            {
                bt7.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt8.setOnClickListener {
            golib()

            if(bt8.text.toString().isEmpty())
            {
                bt8.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else{
                    sk = "X"
                }
            }
            teng()
        }
        bt9.setOnClickListener {
            golib()

            if(bt9.text.toString().isEmpty())
            {

                bt9.text = sk
                react()

                if(sk == "X") {
                    sk = "O"
                }
                else {
                    sk = "X"
                }
            }
            teng()
        }

        btn.setOnClickListener {
            newGame()
        }

        bt.setOnClickListener {
            cont()
        }



    }

    @SuppressLint("SetTextI18n")
    private fun teng(){
        if (bt1.text.isNotEmpty() && bt2.text.isNotEmpty() && bt3.text.isNotEmpty() && bt4.text.isNotEmpty()
            && bt5.text.isNotEmpty() && bt6.text.isNotEmpty() && bt7.text.isNotEmpty() && bt8.text.isNotEmpty()
            && bt9.text.isNotEmpty() && g == 0)
        {
            t += 1
            cars("G'olib aniqlanmadi...!")
            cont()
            txt.text = "X = $x   T = $t   O = $o"

        }
    }
    @SuppressLint("SetTextI18n")
    private fun golib(){
        val mediaPlayer1 = MediaPlayer.create(this, R.raw.bos )

        text.visibility = View.VISIBLE
        if(sk == "X")
            text.text = "O ni bosish navbati."
        else
            text.text = "X ni bosish navbati."


        if(g == 1)
        {
            g = 0
            cont()
        }
        else
            mediaPlayer1.start()

    }
    private fun react(){
        if((bt1.text == bt2.text) && (bt2.text == bt3.text) && bt1.text.isNotEmpty())
        {
            bt1.setTextColor(Color.GREEN)
            bt2.setTextColor(Color.GREEN)
            bt3.setTextColor(Color.GREEN)
            cars(bt1.text.toString())
        }
        else
            if(bt1.text == bt4.text && bt4.text == bt7.text && bt1.text.isNotEmpty())
            {
                bt1.setTextColor(Color.GREEN)
                bt4.setTextColor(Color.GREEN)
                bt7.setTextColor(Color.GREEN)
                cars(bt1.text.toString())
            }
            else
                if(bt4.text == bt5.text && bt4.text == bt6.text && bt4.text.isNotEmpty())
                {
                    bt5.setTextColor(Color.GREEN)
                    bt4.setTextColor(Color.GREEN)
                    bt6.setTextColor(Color.GREEN)
                    cars(bt4.text.toString())
                }
                else
                    if(bt7.text == bt8.text && bt9.text == bt7.text && bt7.text.isNotEmpty())
                    {
                        bt8.setTextColor(Color.GREEN)
                        bt9.setTextColor(Color.GREEN)
                        bt7.setTextColor(Color.GREEN)
                        cars(bt7.text.toString())
                    }
        else
                if(bt1.text == bt5.text && bt5.text == bt9.text && bt1.text.isNotEmpty())
                {
                    bt1.setTextColor(Color.GREEN)
                    bt5.setTextColor(Color.GREEN)
                    bt9.setTextColor(Color.GREEN)
                    cars(bt1.text.toString())
                }
                else
                    if(bt2.text == bt5.text && bt5.text == bt8.text && bt2.text.isNotEmpty())
                    {
                        bt2.setTextColor(Color.GREEN)
                        bt5.setTextColor(Color.GREEN)
                        bt8.setTextColor(Color.GREEN)
                        cars(bt2.text.toString())
                    }
                    else
                        if(bt3.text == bt6.text && bt6.text == bt9.text && bt3.text.isNotEmpty())
                        {
                            bt3.setTextColor(Color.GREEN)
                            bt9.setTextColor(Color.GREEN)
                            bt6.setTextColor(Color.GREEN)
                            cars(bt3.text.toString())
                        }
                        else
                            if(bt3.text == bt5.text && bt5.text == bt7.text && bt3.text.isNotEmpty())
                            {
                                bt3.setTextColor(Color.GREEN)
                                bt5.setTextColor(Color.GREEN)
                                bt7.setTextColor(Color.GREEN)
                                cars(bt3.text.toString())
                            }
    }
    @SuppressLint("SetTextI18n")
    private fun cars(s: String){
        if (s == "X")
            x += 1
        else
            if(s == "O")
                o += 1
        txt.text = "X = $x   T = $t   O = $o"
        j = false
        g = 1
        sk = "X"
        text.visibility = View.GONE
        val mediaPlayer2 = MediaPlayer.create(this, R.raw.golibmusic )

        mediaPlayer2.start()
        Toast.makeText(this,"$s golib bo'ldi!...",Toast.LENGTH_LONG).show()

    }
    @SuppressLint("SetTextI18n")
    private fun newGame(){
        x = 0
        o = 0
        t = 0
        g = 0
        txt.text = "X = $x   T = $t   O = $o"
        cont()
    }
    private fun cont(){
        bt1.setTextColor(Color.BLACK)
        bt4.setTextColor(Color.BLACK)
        bt7.setTextColor(Color.BLACK)
        bt2.setTextColor(Color.BLACK)
        bt3.setTextColor(Color.BLACK)
        bt5.setTextColor(Color.BLACK)
        bt6.setTextColor(Color.BLACK)
        bt8.setTextColor(Color.BLACK)
        bt9.setTextColor(Color.BLACK)
        bt1.text = ""
        bt2.text = ""
        bt3.text = ""
        bt4.text = ""
        bt5.text = ""
        bt6.text = ""
        bt7.text = ""
        bt8.text = ""
        bt9.text = ""
    }
}


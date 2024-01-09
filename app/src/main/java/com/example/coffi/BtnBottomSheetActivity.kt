package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BtnBottomSheetActivity : AppCompatActivity() {


    //#1 Defining a BottomSheetBehavior instance
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btn_bottom_sheet)
        supportActionBar?.hide()

        val btn_back = findViewById<Button>(R.id.su_btn_back)

        btn_back.setOnClickListener {
            val _intentBack =
                Intent(this, MainActivity::class.java)

            startActivity(_intentBack)
        }


        val _btmsht = findViewById<ConstraintLayout>(R.id.bottomSheet)
        val buttonBottomSheetPersistent = findViewById<Button>(R.id.buttonBottomSheetPersistent)
        //#2 Initializing the BottomSheetBehavior
        bottomSheetBehavior = BottomSheetBehavior.from(_btmsht)

        //#3 Listening to State Changes of BottomSheet
        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                buttonBottomSheetPersistent.text = when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> "Close Login page"
                    BottomSheetBehavior.STATE_COLLAPSED -> "Open Login page"
                    else -> "Login page"
                }
            }
        })


        //#4 Changing the BottomSheet State on ButtonClick
        buttonBottomSheetPersistent.setOnClickListener {
            val state =
                if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED)
                    BottomSheetBehavior.STATE_COLLAPSED
                else
                    BottomSheetBehavior.STATE_EXPANDED
            bottomSheetBehavior.state = state
        }

        var inputusername = findViewById<EditText>(R.id.input_username)
        var inputpassword = findViewById<EditText>(R.id.input_password)
        var btnLogin = findViewById<Button>(R.id.btn_login)

        inputusername.setTextSize(25f)

        btnLogin.setOnClickListener {
            var isiusername = inputusername.text.toString()
            var isipassword = inputpassword.text.toString()

            if (isiusername != "" &&
                isipassword != ""
            ) {
                //A = lanjut ke pengecekan selanjutnya 9username - password match)
                if (isiusername.equals("jasmine") &&
                    isipassword.equals("123")) {
                    // password + username cocok
                    val _intentLogin =
                        Intent(this, MenuActivity::class.java)
                    startActivity(_intentLogin)

                } else {
                    //B = username dan password salah
                    Toast.makeText(
                        this,
                        "Username or Password Incorrect",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }


        }

    }

}
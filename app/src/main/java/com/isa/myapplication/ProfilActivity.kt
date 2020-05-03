package com.isa.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val bundle = intent.extras

        txtName.text = (bundle?.getCharSequence(MainActivity.NAMA))
        txtAddress.text = (bundle?.getCharSequence(MainActivity.ALAMAT))
        txtEmail.text = (bundle?.getCharSequence(MainActivity.EMAIL))
        txtTelp.text = (bundle?.getCharSequence(MainActivity.TELP))
    }
}

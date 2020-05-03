package com.isa.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val NAMA: String? = "Nama"
        val GENDER: String? = "GENDER"
        val ALAMAT: String? = "Alamat"
        val EMAIL: String? = "Email"
        val TELP: String? = "Telp"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {
            if (edtName.text.isEmpty() || edtAddress.text.isEmpty() || edtEmail.text.isEmpty() || edtTelp.text.isEmpty()) {
                toast("Kolom tidak boleh kosong", Toast.LENGTH_LONG)
                goValidation()
            } else if (edtName.text.isNotEmpty() || edtAddress.text.isNotEmpty() || edtEmail.text.isNotEmpty() || edtTelp.text.isNotEmpty()) {
                toast("Sukses", Toast.LENGTH_LONG)
                goToProfilActivity()
            }
        }
    }

    private fun goValidation() {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)
    }

    private fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, message,length).show()
    }

    private fun goToProfilActivity() {
        val intent = Intent(this, ProfilActivity::class.java)
        val bundle = Bundle()

        bundle.putString(NAMA, edtName.text.toString())
        bundle.putString(ALAMAT, edtAddress.text.toString())
        bundle.putString(EMAIL, edtEmail.text.toString())
        bundle.putString(TELP, edtTelp.text.toString())

        intent.putExtras(bundle)
        startActivity(intent)
    }
}


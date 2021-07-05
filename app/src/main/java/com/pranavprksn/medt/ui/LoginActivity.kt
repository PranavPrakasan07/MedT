package com.pranavprksn.medt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pranavprksn.medt.R
import com.pranavprksn.medt.databinding.ActivityLoginBinding
import com.pranavprksn.medt.util.toastMessage

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)

        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        toastMessage("Started")
    }

    override fun onSuccess() {
        toastMessage("Success")
    }

    override fun onFailure(message: String) {
        toastMessage("Failed!")
    }
}
package com.pranavprksn.medt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.pranavprksn.medt.R
import com.pranavprksn.medt.databinding.ActivityLoginBinding
import com.pranavprksn.medt.util.toastMessage

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.authListener = this

        setContentView(R.layout.activity_login)
    }

    override fun onStarted() {
        TODO("Not yet implemented")

        toastMessage("Started")
    }

    override fun onSuccess() {
        TODO("Not yet implemented")

        toastMessage("Success")
    }

    override fun onFailure(message: String) {
        TODO("Not yet implemented")

        toastMessage("Failed!")
    }
}
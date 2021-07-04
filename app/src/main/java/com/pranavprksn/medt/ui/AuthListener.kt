package com.pranavprksn.medt.ui

interface AuthListener {

    fun onStarted()

    fun onSuccess()

    fun onFailure(message : String)
}
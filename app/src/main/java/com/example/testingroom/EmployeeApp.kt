package com.example.testingroom

import android.app.Application
import com.example.testingroom.EmployeeDatabase

class EmployeeApp:Application() {

    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }

}
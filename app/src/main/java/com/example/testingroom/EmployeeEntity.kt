package com.example.testingroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Employee-table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name : String = "",
    @ColumnInfo(name = "Email-id")
    val email:String = ""

)

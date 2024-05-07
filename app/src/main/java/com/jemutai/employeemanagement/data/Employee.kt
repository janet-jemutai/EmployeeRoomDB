package com.jemutai.employeemanagement.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Employees")
data class Employee(
    @PrimaryKey(autoGenerate = true)
    var id :Int,
    @ColumnInfo(name = "name")
    var name : String,
    @ColumnInfo(name = "gender")
    var gender : String,
    @ColumnInfo(name = "email")
    var  email : String
)

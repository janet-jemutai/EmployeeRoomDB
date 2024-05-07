package com.jemutai.employeemanagement.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jemutai.employeemanagement.data.Employee

@Database(
    entities = [Employee::class],
    version = 1
)
abstract class EmployeeDatabase :RoomDatabase(){

    abstract fun  employeeDao():EmployeeDao
}
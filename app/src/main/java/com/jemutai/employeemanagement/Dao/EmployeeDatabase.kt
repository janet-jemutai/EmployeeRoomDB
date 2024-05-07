package com.jemutai.employeemanagement.Dao

import androidx.room.Database
import com.jemutai.employeemanagement.data.Employee

@Database(
    entities = [Employee::class],
    version = 1
)
abstract class EmployeeDatabase {

    abstract fun  employeeDao():EmployeeDao
}
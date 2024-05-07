package com.jemutai.employeemanagement.Dao

import com.jemutai.employeemanagement.data.Employee

abstract class EmployeeRepository (private  var  employeeDao :EmployeeDao){

    suspend fun  addEmployee(nEmployee: Employee){
        employeeDao.addEmployee(nEmployee)
    }

    suspend fun  updateEmployee(nEmployee: Employee){
        employeeDao.updateEmployee(nEmployee)
    }
    suspend fun  deleteEmployee(nEmployee: Employee){
        employeeDao.deleteEmployee(nEmployee)
    }


}
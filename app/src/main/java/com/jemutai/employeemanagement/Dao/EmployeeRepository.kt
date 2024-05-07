package com.jemutai.employeemanagement.Dao

import com.jemutai.employeemanagement.data.Employee
import kotlinx.coroutines.flow.Flow

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

    fun  getAlEmployees(): Flow<List<Employee>> = employeeDao.fetchAllEmployees()

    fun  getGetStudentById(id:Int): Flow<Employee> {
        return  employeeDao.fetchEmployee(id)
    }


}
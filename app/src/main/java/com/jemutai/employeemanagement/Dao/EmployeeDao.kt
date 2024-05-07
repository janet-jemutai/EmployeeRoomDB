package com.jemutai.employeemanagement.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jemutai.employeemanagement.data.Employee
import kotlinx.coroutines.flow.Flow

@Dao
abstract  class EmployeeDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract  suspend fun  addEmployee(employee: Employee)

    @Delete
    abstract  suspend fun  deleteEmployee(employee: Employee)

    @Update
    abstract  suspend fun  updateEmployee(employee: Employee)

    @Query("SELECT * FROM  EMPLOYEES")
    abstract  fun  fetchAllEmployees(): Flow<List<Employee>>

    @Query("SELECT * FROM EMPLOYEES  where id =id")
    abstract  fun  selectEmployee():Flow<Employee>


}
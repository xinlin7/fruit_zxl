package com.zxl.service;

import com.zxl.dto.EmployeeLoginDTO;
import com.zxl.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}

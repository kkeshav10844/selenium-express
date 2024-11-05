package com.seleniumexpress.adressapp.address_service.repo;

import com.seleniumexpress.adressapp.address_service.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo extends JpaRepository<AddressEntity,Integer> {

    @Query(nativeQuery = true,value = "SELECT ea.id, ea.lane1, ea.lane2,ea,state,ea.zip FROM seleniumexpressew.address ea join\n" +
            "seleniumexpressnew.employee employeeon e.id = ea.employee_id\n" +
            "where ea.employee_id=employeeId);
            findAddressByEmployeeId(@Param("employeeId") int employeeId);

}

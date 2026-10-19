package com.tca.mapper;

import com.tca.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface EmployeeMapper {
    void updateEmployee(
            Employee requestEmployee,
            @MappingTarget Employee existingEmployee

    );
}

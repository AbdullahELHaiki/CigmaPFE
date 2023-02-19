package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity ConvertDtoToEntity(StudentDTO dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public StudentDTO ConvertEntityToDto(StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public List<StudentEntity> ConvertDtosToEntities(List<StudentDTO> dtos){
        return dtos.stream()
                .map(dto -> ConvertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    public List<StudentDTO> ConvertEntitiesToDtos(List<StudentEntity> entities){
        return entities.stream()
                .map(entity -> ConvertEntityToDto(entity))
                .collect(Collectors.toList());
    }
}

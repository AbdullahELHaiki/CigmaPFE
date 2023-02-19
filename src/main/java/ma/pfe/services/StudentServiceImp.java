package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public StudentDTO create(StudentDTO dto) {
        return mapper.ConvertEntityToDto(
                repository.create(mapper.ConvertDtoToEntity(dto))
        );
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        return mapper.ConvertEntityToDto(
                repository.update(mapper.ConvertDtoToEntity(dto))
        );
    }

    @Override
    public boolean delete(long id) {
        return
                repository.delete(id);

    }

    @Override
    public List<StudentDTO> readAll() {
        return mapper.ConvertEntitiesToDtos(repository.readAll());
    }
}

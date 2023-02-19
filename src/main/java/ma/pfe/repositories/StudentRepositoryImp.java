package ma.pfe.repositories;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentRepositoryImp implements StudentRepository{
     @Autowired
     private StudentMapper mapper;

    @Override
    public StudentEntity create(StudentEntity entity) {
      return null;
    }

    @Override
    public StudentEntity update(StudentEntity dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }
}

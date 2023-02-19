package ma.pfe.controllers;

import ma.pfe.mappers.StudentMapper;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
    @Autowired
    private StudentMapper mapper;
    @Autowired
    private StudentServiceImp service;


}

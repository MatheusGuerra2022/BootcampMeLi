package com.meli.obterdiploma;


import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TesteExercicioUm {


    @Test
    public void testeUm(){
        IStudentDAO iStudentDAOMock = Mockito.mock(IStudentDAO.class);
        ObterDiplomaService service = new ObterDiplomaService(iStudentDAOMock);


    }
}

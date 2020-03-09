package LabAssiAsseProjectV03MV;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Exceptions.ValidatorException;
import Repository.XMLFileRepository.StudentXMLRepo;
import Service.XMLFileService.StudentXMLService;
import Validator.StudentValidator;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAddStudent() throws ValidatorException {
        StudentValidator vs=new StudentValidator();
        StudentXMLRepo strepo=new StudentXMLRepo(vs,"StudentiXML.xml");
        StudentXMLService stsrv=new StudentXMLService(strepo);
        String[] params = {"1", "Axinie", "931", "axiniuc@gmail.com", "prof"};

        stsrv.add(params);
        assertEquals(1, stsrv.getSize());
        assertEquals(931, stsrv.findOne("1").getGrupa());
    }
}

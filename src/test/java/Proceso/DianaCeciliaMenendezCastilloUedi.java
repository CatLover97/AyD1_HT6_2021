/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import Objetos.Horario;




public class DianaCeciliaMenendezCastilloUedi {
    
    @InjectMocks
    private AsignarHorario asignacion;
    
    @Mock
    private RegistroAcademico registro;
    
    @Mock 
    private Carrera carrera;
    
    /*
    Codigo ->100
    Anio -> 2021
    Carrera -> 09
    Descripcion -> Diurna
    */
    
    @Test
    public void testCodigoHorario() throws Exception{
        when(registro.getAnio()).thenReturn(2021);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro.cheequearCarnet()).thenReturn(true);
        
        asignacion =new AsignarHorario();
        assertEquals(100, asignacion.generarHorario(carrera,registro).getCodigoHorario());
    }
    
    @Test
    public void testDescripcion() throws Exception{
        when(registro.getAnio()).thenReturn(2021);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro.cheequearCarnet()).thenReturn(true);
        
        asignacion =new AsignarHorario();
        assertEquals("Diurna", asignacion.generarHorario(carrera,registro).getDescripcion());
    
    }
    
}
package com.example.banco;

import com.example.banco.Controladores.ClienteController;
import com.example.banco.Modelos.Cliente;
import com.example.banco.Modelos.Movimientos;
import com.example.banco.Modelos.Persona;
import com.example.banco.Repositorios.ClienteRepositorio;
import com.example.banco.Repositorios.MovimientoRepositorio;
import com.example.banco.Servicios.ClienteServicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancoApplicationTests {

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        
        cli=new Cliente();
        Persona per=new Persona();
        cli.setContraseña("1234");
        cli.setEstado("True");
        cli.setIdCliente(1);
        per.setDireccion("larenas");
        per.setEdad(23);
        per.setGenero("Masculino");
        per.setIdPersona(1L);
        per.setIdentificacion(1001776283);
        per.setNombre("Marco Troya");
        per.setTelefono(24565765);
        cli.setPersona(per);
        cliente.add(cli);
    }
    
    @Mock
    private ClienteController clienteController;
    
    @InjectMocks
    private ClienteServicio clienteServicio;
    
    private Cliente cli;
    private ArrayList<Cliente> cliente=new ArrayList<>();
    
    //Test para buscar clientes
    @Test
    public void findAll() {
        System.err.println("Test Cliente");
      when(clienteController.ObtenerCliente()).thenReturn((cliente));
       clienteController.ObtenerCliente();
       for(Cliente cli: cliente){
           System.err.println("Persona "+cli.getPersona().getNombre());
       }
       }
    
    //test para Buscar cliente por ID   
   @Test
    public void BuscaCliente(){
           System.err.println("Busco Cliente con codigo 3");
           when(clienteController.ObtenerClienteId(3));
           for (Cliente cli : cliente) {
               System.err.println("Cliente encontrado es "+cli.getPersona().getNombre());
                              
           }
    }
      
    
    
	
        
       
        

}

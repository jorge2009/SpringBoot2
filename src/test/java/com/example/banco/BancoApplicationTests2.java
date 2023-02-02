package com.example.banco;

import com.example.banco.Controladores.ClienteController;
import com.example.banco.Controladores.CuentaController;
import com.example.banco.Modelos.Cliente;
import com.example.banco.Modelos.Cuenta;
import com.example.banco.Modelos.Movimientos;
import com.example.banco.Modelos.Persona;
import com.example.banco.Repositorios.ClienteRepositorio;
import com.example.banco.Repositorios.MovimientoRepositorio;
import com.example.banco.Servicios.ClienteServicio;
import com.example.banco.Servicios.CuentaServicio;
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
class BancoApplicationTests2 {

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        
       
        Persona per=new Persona();
        per.setDireccion("larenas");
        per.setEdad(23);
        per.setGenero("Masculino");
        per.setIdPersona(1L);
        per.setIdentificacion(1001776283);
        per.setNombre("Marco Troya");
        per.setTelefono(24565765);
        Cliente cliente=new Cliente();
        cliente.setPersona(per);
        cliente.setContraseña("1234");
        cliente.setEstado("True");
        cliente.setIdCliente(1);
        Cuenta cuenta=new Cuenta();
        cuenta.setEstado("True");
        cuenta.setIdCuenta(14);
        cuenta.setNumero_cuenta(2345422);
        cuenta.setSaldo_inicial(34.56);
        cuenta.setTipo_cuenta("Ahorros");
        cuenta.setCliente(cliente);
        Listacuenta.add(cuenta);
    }
    
    @Mock
    private CuentaController cuentaController;
    
    @InjectMocks
    private CuentaServicio cuentaServicio;
    
    private Cuenta cue;
    private Cliente cli;
    private ArrayList<Cuenta> Listacuenta=new ArrayList<>();
    
    
    @Test
    public void findAll() {
        System.err.println("Test Cuenta");
      when(cuentaController.ObtenerCuenta()).thenReturn((Listacuenta));
       cuentaController.ObtenerCuenta();
       for(Cuenta cue: Listacuenta){
           System.err.println("Numero Cuenta "+cue.getNumero_cuenta());
       }
       }
    
       
    
    
    
	
        
       
        

}

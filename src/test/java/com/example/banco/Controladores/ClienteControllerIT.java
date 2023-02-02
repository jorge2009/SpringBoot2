/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.banco.Controladores;

import com.example.banco.Modelos.Cliente;
import com.example.banco.Modelos.Persona;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Jorge
 */
public class ClienteControllerIT {
    
    public ClienteControllerIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    Cliente cli=new Cliente();
    @AfterAll
    public static void tearDownClass() {
        Cliente cli=new Cliente();
         cli.setIdCliente(1);
        cli.setContraseña("1234");
        cli.setEstado("True");
        Persona persona=new Persona();
        persona.setIdPersona(1L);
        persona.setNombre("Jorge");
        cli.setPersona(persona);  
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        
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
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ObtenerCliente method, of class ClienteController.
     */
    @Test
    public void testObtenerCliente() {
        System.out.println("ObtenerCliente");
        ClienteController instance = new ClienteController();
       
        ArrayList<Cliente> expResult = null;
                      
        ArrayList<Cliente> result = instance.ObtenerCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarCliente method, of class ClienteController.
     */
    @Test
    public void testGuardarCliente() {
        System.out.println("GuardarCliente");
        Cliente cliente = null;
        Persona persona=new Persona();
        persona.setIdPersona(1L);
        persona.setDireccion("larenas");
        cliente.setPersona(persona);
        ClienteController instance = new ClienteController();
        Cliente expResult = null;
        Cliente result = instance.GuardarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ObtenerClienteId method, of class ClienteController.
     */
    @Test
    public void testObtenerClienteId() {
        System.out.println("ObtenerClienteId");
        Integer id = null;
        ClienteController instance = new ClienteController();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.ObtenerClienteId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ObtnerListaCliente method, of class ClienteController.
     */
    @Test
    public void testObtnerListaCliente() {
        System.out.println("ObtnerListaCliente");
        String estado = "";
        ClienteController instance = new ClienteController();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.ObtnerListaCliente(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarPorId method, of class ClienteController.
     */
    @Test
    public void testEliminarPorId() {
        System.out.println("EliminarPorId");
        Integer id = null;
        ClienteController instance = new ClienteController();
        String expResult = "";
        String result = instance.EliminarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

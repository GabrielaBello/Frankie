/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *Atributos de una receta.
 * @author Gabriela Pérez Bello
 */
public class Receta {
    
    private String nombre;
    private String descripcion;
    private int numeroPorciones;
    private int duracion;
    private List<Ingrediente> ingredientes;
    private List<Paso> pasos;
    private Dificultad dificultad;
    private Usuario usuario;
    
    public Receta deserializar(String json){
        Receta receta = new Receta();
        try{
            receta = new Gson().fromJson(json, Receta.class);
        }catch(Exception ex){
            System.err.print("Ocurrió un error" + ex.getMessage());
        }
        return receta;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return numeroPorciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.numeroPorciones = porciones;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the ingredientes
     */
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the pasos
     */
    public List<Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}

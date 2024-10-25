
package poo1;
import java.util.Scanner;


public class Persona {
    String nombre, apellido;
boolean estudiante;
int anioNac, cI;

//contructor de una persona
public Persona (String nombre,String apellido,boolean estudiante,int anioNac,int cI){
this.nombre= nombre;
this.apellido= apellido;
this.estudiante= estudiante;
this.anioNac= anioNac;
this.cI=cI;
}
//getters
public String getNombre(){
    return this.nombre;

}
public String getApellido(){
    return this.apellido;}
public boolean estudiante(){
    return this.estudiante;}

}

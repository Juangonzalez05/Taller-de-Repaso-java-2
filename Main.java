/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez

*/
package main;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
    
     int menu;
     do{
         menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Informacion de la Universidad"
                                                              + "\n2 - Facultades"
                                                              + "\n3 - Profesores de las Escuelas"
                                                              + "\n4 - Salir"));
         switch (menu){
             case 1:
                 Universidad p1 = new Universidad("Tecnologico De Antioquia"," Cl. 78b #72 A-220, Medellín, Antioquia",2813329," 40.000 Metros cubicos"," Publica");
                p1.mostrarDatos();
                
                break;
             case 2:
                  menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Facultad de Ingenieria"
                                                              + "\n2 - Facultad de Educacion"
                                                              ));
                 
                  
                  
                  switch(menu){
                  case 1: 
                        menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Ver informacion de la Facultad"
                                                              + "\n2 - Ver escuelas de la Facultad"
                                                              ));
                     switch(menu){ 
                         case 1:
                         Facultad p2 = new Facultad("Ingenieria",305,2812520,"Ramiro Gonzalez Rincon");
                         p2.mostrarFacultad();
                         break;
                         case 2:
                         Escuela escuelita = new Escuela(202,3402070,"Alberto de Jesus");
                         escuelita.mostrarEscuela();
                         break;
                     }
                 
                  case 2:
                        menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Ver informacion de la Facultad"
                                                              + "\n2 - Ver escuelas de la Facultad"
                                                              ));
                  switch(menu){
                        case 1: 
                        Facultad p3 = new Facultad("Educacion",110,6022994,"Diana Monsalve Rico");
                        p3.mostrarFacultad();
                        break;
                        case 2:
                        Escuela escuelita = new Escuela(210,4402089,"Rogelio Alonso Cardona");
                        escuelita.mostrarEscuela();
                        break;
                  }
                   break;
                 }
             case 3:
                  menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Escuelas de Ingenieria"
                                                              + "\n2 - Escuelas de Educacion"
                                                              ));
                  switch(menu){
                      
                      case 1:
                      menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Ingenieria de Software"
                                                              + "\n2 - Ingenieria Electronica"
                                                              ));
                          switch(menu){
                              case 1:
                              Profesor profe = new Profesor("Alfredo Perez","Lina Gutierrez","Jose Albeiro","uhapoddo@yopmail.com","macefov535@lidte.com","archit@pvtnetflix.com");
                                  profe.mostrarProfesor();
                              break;
                              case 2:
                                  Profesor profe2 = new Profesor("Valentina Carmona","Andrea Perez","Katerine Hernandez","yvumufeg-8129@yopmail.com","rerdodiyda@nedoz.com","jhackettn_j649b@hexud.com");
                                  profe2.mostrarProfesor();
                              break;
                          }
                          
                          
                          
                          break;
                          
                          
                      case 2:
                        menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                                                              "\n1 - Trabajo Social"
                                                              + "\n2 - Pedagogia"
                                                              ));   
                              switch(menu){
                                  case 1:
                                 Profesor profe3 = new Profesor("Carolina Restrepo","Mario Flores","Humberto Franco","lebommalera-5023@yopmail.com","rerdodiyda@nedoz.com","hernan@owlymail.com");
                                 profe3.mostrarProfesor();
                                      break;
                                      
                                  case 2:
                                      Profesor profe4 = new Profesor("Viviana Moreno","Silvia Bermudez","Juan Esteban Gonzalez","fiddajyli-4732@yopmail.com","macefov535@lidte.com","juan@owlymail.com");
                                 profe4.mostrarProfesor();
                                      break;
                              }
                          
                          
                          
                          break;
                      
                      
                  }
                 
                  
                  
                  break;
         }
                                                             
        }while(menu !=4);
    }
    
}

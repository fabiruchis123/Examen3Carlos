/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicketList;

import Ticket.TicketModel;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class TicketList {
    
 private ArrayList<TicketModel> lista;
    
    
 public void Agregar(TicketModel ticket){
    
     lista.add(ticket);
     
 }
 
 public void EliminacionPos(int pos){
     
     lista.remove(pos);
     
 }
 
 public void EliminacionValor(TicketModel ticket){
     
     lista.remove(ticket);
     
 }
 
 public TicketModel Busqueda(enum tipobuscado){
     
     for(TicketModel tickets : lista){ 
         
         if (tickets.getTipoEnum()== tipobuscado) {
             return TicketModel;
         }
         
     }
 }
    
}

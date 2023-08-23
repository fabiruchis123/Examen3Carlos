/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author Student
 */

public class TicketModel {
     
    private int numero ;
    private TipoEnum TipoEnum;

    public int getNumero() {
        return numero;
    }

    public TipoEnum getTipoEnum() {
        return TipoEnum;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoEnum(TipoEnum TipoEnum) {
        this.TipoEnum = TipoEnum;
    }

    public TicketModel(int numero, TipoEnum TipoEnum) {
        this.numero = numero;
        this.TipoEnum = TipoEnum;
    }
    
    
}

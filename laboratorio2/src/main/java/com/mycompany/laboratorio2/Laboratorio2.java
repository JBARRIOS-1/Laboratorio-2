    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

    package com.mycompany.laboratorio2;

    /**
     *
     * @author umg
     */
    public class Laboratorio2 {

        public static void main(String[] args) {
            
            Usermaintenance.cargarUsuarios();
        
            if(!Usermaintenance.usuarios.contains("Jvasquez")){

            Usermaintenance.usuarios.add("Jvasquez");
            Usermaintenance.passwords.add("Umariano24");
            Usermaintenance.estados.add("Active");
            Usermaintenance.roles.add("Admin");
            } else {
            int index = Usermaintenance.usuarios.indexOf("Jvasquez");
            Usermaintenance.roles.set(index, "Admin");
            Usermaintenance.estados.set(index, "Active");
            }

            login lg = new login();
            lg.setVisible(true);
        }
    }
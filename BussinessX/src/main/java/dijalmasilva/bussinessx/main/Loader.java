/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.main;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.bussinessx.entidades.Material;
import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.enums.TypeStatus;
import dijalmasilva.bussinessx.enums.UserType;
import dijalmasilva.bussinessx.interfaces.DaoBloco;
import dijalmasilva.bussinessx.interfaces.DaoMaterial;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;
import dijalmasilva.bussinessx.jpa.DaoBlocoImpl;
import dijalmasilva.bussinessx.jpa.DaoMaterialImpl;
import dijalmasilva.bussinessx.jpa.DaoUsuarioImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {

        DaoUsuario du = new DaoUsuarioImpl();
        DaoMaterial dm = new DaoMaterialImpl();
        DaoBloco db = new DaoBlocoImpl();
//        Bloco b = new Bloco("Bloco de Matemática");
//        Bloco b2 = new Bloco("Bloco Eng. Civil");
//        db.salvar(b);
//        db.salvar(b2);
        Bloco buscar = db.buscarPorId(151);
        buscar.setNome("Bloco de História");
        boolean atualizar = db.atualizar(151, buscar);
        JOptionPane.showMessageDialog(null, atualizar);
        System.out.println(buscar);
//        Bloco b = new Bloco("Bloco Eng. Civil");
//        db.salvar(b);
//        Material material = new Material("Lápis", 35, TypeStatus.DISPONIVEL);
//        for (int i =0; i < material.getQuantidade(); i++){
//            dm.salvar(material);
//            material.setTombamento(0);
//        }
//        Usuario u2 = new Usuario("admin@gmail.com", "Admin", "xschg123", "foto".getBytes(), UserType.ADMINISTRADOR, "122133");
//        du.salvar(u2);
        
//        DaoFeriado df = new DaoFeriadoImpl();
//        Usuario u3 = new Usuario("monitor@gmail.com", "Monitor", "dijalma123", "foto".getBytes(), UserType.MONITOR, "123143");
//        Usuario u4 = new Usuario(53L, "professor@gmail.com", "Professor", "dijalma123", "foto".getBytes(), UserType.PROFESSOR, "123113");
//        du.remover(u4);
//        Usuario find = du.buscar(51L);
//        System.out.println("Usuario:" + find.getEmail());
//        List<Usuario> user = du.todos();
//        if (!user.isEmpty()) {
//            user.stream().forEach((Usuario usuario) -> {
//                System.out.println("Usuario: " + usuario.getNome());
//            });
//        } else {
//            System.out.println("Não tem")x;
//        }
//        Feriado f = new Feriado("Proclamação da República", LocalDate.of(2016, Month.NOVEMBER, 15));
//        Feriado f2 = new Feriado("Natal", LocalDate.of(2016, Month.DECEMBER, 25));
//        df.salvar(f);
//        df.salvar(f2);
//        List<Feriado> todos = df.todos();
//        if (!todos.isEmpty()) {
//            for (Feriado f : todos) {
//                System.out.println("Feriado: " + f.getNome());
//            }
//        }
//        System.out.println("Feriado: " + buscar.getNome());

    }
}

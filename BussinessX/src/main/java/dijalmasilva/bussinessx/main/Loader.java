/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.main;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.bussinessx.entidades.Evento;
import dijalmasilva.bussinessx.entidades.Sala;
import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.interfaces.DaoBloco;
import dijalmasilva.bussinessx.interfaces.DaoEvento;
import dijalmasilva.bussinessx.interfaces.DaoMaterial;
import dijalmasilva.bussinessx.interfaces.DaoSala;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;
import dijalmasilva.bussinessx.jpa.DaoBlocoImpl;
import dijalmasilva.bussinessx.jpa.DaoEventoImpl;
import dijalmasilva.bussinessx.jpa.DaoMaterialImpl;
import dijalmasilva.bussinessx.jpa.DaoSalaImpl;
import dijalmasilva.bussinessx.jpa.DaoUsuarioImpl;
import java.time.LocalDate;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {

        DaoUsuario du = new DaoUsuarioImpl();
        DaoMaterial dm = new DaoMaterialImpl();
        DaoBloco db = new DaoBlocoImpl();
        DaoEvento dv = new DaoEventoImpl();
        Usuario u = du.buscar(401L);
        DaoSala ds = new DaoSalaImpl();
        Sala sala = ds.buscar(301);
        Evento e = new Evento("Evento 1", "Descricao aqui", 20, u, LocalDate.now(), LocalDate.now(), sala);
        dv.salvar(e);
//        Bloco bloco = new Bloco("Bloco ADS");
//        db.salvar(bloco);
//        Bloco b = db.buscarPorNome("Bloco ADS");
//        System.out.println(b);
//        DaoSala ds = new DaoSalaImpl();
//        Sala s = new Sala("Sala 01", b, 40, TypeSala.COMUM);
//        ds.salvar(s);
//        Bloco b = new Bloco("Bloco de Matemática");
//        Bloco b2 = new Bloco("Bloco Eng. Civil");
//        db.salvar(b);
//        db.salvar(b2);
//        Bloco buscar = db.buscarPorId(151);
//        buscar.setNome("Bloco de História");
//        boolean atualizar = db.atualizar(151, buscar);
//        JOptionPane.showMessageDialog(null, atualizar);
//        System.out.println(buscar);
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

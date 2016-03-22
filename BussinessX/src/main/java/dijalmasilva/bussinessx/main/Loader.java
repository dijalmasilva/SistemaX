/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.main;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;
import dijalmasilva.bussinessx.jpa.DaoUsuarioImpl;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {

        DaoUsuario du = new DaoUsuarioImpl();
        Usuario find = du.buscarByNome("Pipoca Man");
        if (find != null) {
            System.out.println("Find: " + find.getMatricula());
        }
//        DaoFeriado df = new DaoFeriadoImpl();
//        Usuario u2 = new Usuario("aluno@gmail.com", "Aluno", "dijalma123", "foto".getBytes(), UserType.ALUNO, "122133");
//        Usuario u3 = new Usuario("monitor@gmail.com", "Monitor", "dijalma123", "foto".getBytes(), UserType.MONITOR, "123143");
//        Usuario u4 = new Usuario(53L, "professor@gmail.com", "Professor", "dijalma123", "foto".getBytes(), UserType.PROFESSOR, "123113");
//        du.salvar(u2);
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

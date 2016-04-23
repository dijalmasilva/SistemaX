/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.csv.OpenCsv;
import dijalmasilva.bussinessx.entidades.Feriado;
import dijalmasilva.integrationx.gerenciadores.GerenciaFeriado;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping(value = "/home/managerFeriado")
public class ManageFeriadoController {

    @RequestMapping("")
    public String managerFeriado(HttpServletRequest req) {
        return "gerenciadorFeriado";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String novoFeriado(String title, Date start, Date end, HttpServletRequest req) {
        Feriado feriado = new Feriado(title, "" + start, "" + end, null);
        boolean salvou = new GerenciaFeriado().salvar(feriado);
        if (salvou) {
            req.setAttribute("result", "Feriado adicionado com sucesso!");
        } else {
            req.setAttribute("result", "Não foi possível adicionar esse feriado!");
        }

        return managerFeriado(req);
    }

    @RequestMapping(value = {"/getEventos.json"})
    public @ResponseBody
    List<Feriado> GetEventos() {

        List<Feriado> feriados = new ArrayList<Feriado>();

        List<Feriado> ListaDeFeriaods = new GerenciaFeriado().todos();
        for (Feriado feriado : ListaDeFeriaods) {
            feriados.add(feriado);
        }
        return feriados;
    }

    @RequestMapping(value = {"/import"}, method = RequestMethod.POST)
    public String importarFeriado(MultipartFile arquivoCsv, boolean sobrescrever, HttpServletRequest req) throws SQLException {
        GerenciaFeriado gf = new GerenciaFeriado();
        if (!arquivoCsv.isEmpty()) {
            try {
                byte[] b = arquivoCsv.getBytes();
                String caminho = req.getServletContext().getRealPath("/") + arquivoCsv.getOriginalFilename();
                System.out.println(caminho);
                BufferedOutputStream stream
                        = new BufferedOutputStream(new FileOutputStream(new File(caminho)));
                stream.write(b);
                stream.close();
                OpenCsv openCsv = new OpenCsv();
                List<Feriado> lerCSV = openCsv.lerCSV(new File(caminho));

                if (sobrescrever) {
                    for (Feriado csv : lerCSV) {
                        System.out.println(csv);
                        gf.remover(csv);
                    }
                    for (Feriado csv : lerCSV) {
                        gf.salvar(csv);
                    }
                } else {

                    for (Feriado csv : lerCSV) {
                        gf.salvar(csv);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return managerFeriado(req);
    }
}

package euc.ifba.edu.br.ppj.web;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {


    @GetMapping
    public String listarUsuarios(Model model) {
        List<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
        model.addAttribute("usuarios", usuarios);
        return "usuario-list";
    }

    @GetMapping("/novo")
    public String exibirFormUsuario(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "usuario-form";
    }

    
}
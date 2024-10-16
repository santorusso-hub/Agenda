package ao.nosp.Agenda.service;


import ao.nosp.Agenda.ResourceNotFoundException;
import ao.nosp.Agenda.impl.AgendaImpl;
import ao.nosp.Agenda.model.Agenda;
import ao.nosp.Agenda.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgendaService implements AgendaImpl{

    @Override
    public Agenda findAllContactos() {
        //if(initialize()==null){
            return  initialize();
        //}else{
           // throw new ResourceNotFoundException("Error");
        //}


    }

    public Agenda initialize() {
        List<Contato> contatos=new ArrayList<>();
        Agenda agenda=new Agenda();
        contatos.add(new Contato("Santo Andre", "940111372", "santondre@gmail.com", "Cassequel"));
        contatos.add(new Contato("Maria Silva", "940222111", "maria.silva@example.com", "Luanda Sul"));
        contatos.add(new Contato("João Pereira", "940333222", "joao.pereira@example.com", "Talatona"));
        contatos.add(new Contato("Ana Costa", "940444333", "ana.costa@example.com", "Maianga"));
        contatos.add(new Contato("Carlos Fernandes", "940555444", "carlos.fernandes@example.com", "Viana"));
        contatos.add(new Contato("Luisa Gomes", "940666555", "luisa.gomes@example.com", "Benfica"));
        contatos.add(new Contato("Pedro Sousa", "940777666", "pedro.sousa@example.com", "Kilamba"));
        contatos.add(new Contato("Sofia Martins", "940888777", "sofia.martins@example.com", "Cazenga"));
        contatos.add(new Contato("Ricardo Alves", "940999888", "ricardo.alves@example.com", "Rangel"));
        contatos.add(new Contato("Beatriz Santos", "941111999", "beatriz.santos@example.com", "Ingombota"));
        contatos.add(new Contato("Miguel Rocha", "941222000", "miguel.rocha@example.com", "Maculusso"));
        contatos.add(new Contato("Gabriela Lima", "941333111", "gabriela.lima@example.com", "Prenda"));
        contatos.add(new Contato("Tiago Mendes", "941444222", "tiago.mendes@example.com", "Mutamba"));
        contatos.add(new Contato("Patricia Carvalho", "941555333", "patricia.carvalho@example.com", "Miramar"));
        contatos.add(new Contato("Fábio Oliveira", "941666444", "fabio.oliveira@example.com", "Alvalade"));
        contatos.add(new Contato("Carolina Nunes", "941777555", "carolina.nunes@example.com", "Patrice Lumumba"));
        contatos.add(new Contato("Leonardo Freitas", "941888666", "leonardo.freitas@example.com", "Morro Bento"));
        contatos.add(new Contato("Mariana Ribeiro", "941999777", "mariana.ribeiro@example.com", "Bairro Popular"));
        contatos.add(new Contato("Daniel Matos", "942111888", "daniel.matos@example.com", "Golfe"));
        contatos.add(new Contato("Helena Pinto", "942222999", "helena.pinto@example.com", "Vila Alice"));
        agenda.setContatos(contatos);
        return agenda;
    }
}

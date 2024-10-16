package ao.nosp.Agenda.controller;

import ao.nosp.Agenda.impl.AgendaImpl;
import ao.nosp.Agenda.model.Agenda;
import ao.nosp.Agenda.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AgendaController {


    @Autowired
    AgendaImpl agendaImpl;

    @GetMapping(value = "/agenda/getAllContactos",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody  Agenda  getAllContacto() {
        var result = agendaImpl.findAllContactos();
        return result;
    }
}

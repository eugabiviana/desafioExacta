package com.exacta.desafio.gasto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/gastos")
public class GastoController {

    @Autowired
    private GastoRepository gastoRepository;
    @Autowired
    private GastoService gastoService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(gastoService.getAll());
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<GastoResponse> getById(@PathVariable Long id){
        GastoResponse gastoResponse = gastoService.getById(id);
        return ResponseEntity.ok().body(gastoResponse);
    }

    @PostMapping
    public ResponseEntity<GastoResponse> post(@RequestBody GastoRequest gastoRequest){
        Gasto gasto = gastoRequest.toGasto();
        GastoResponse gastoResponse = gastoService.post(gasto);

        return ResponseEntity.status(HttpStatus.CREATED).body(gastoResponse);
    }

}

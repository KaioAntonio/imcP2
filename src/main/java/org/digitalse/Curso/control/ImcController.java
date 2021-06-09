package org.digitalse.Curso.control;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.digitalse.Curso.responses.ImcResponse;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/imc")
public class ImcController {

    @GetMapping("/calcular")
    public ResponseEntity<ImcResponse> calcular(@RequestParam float peso, @RequestParam float altura) {
        altura = altura / 100;

        float imc = peso / (altura * altura);
        ImcResponse response;
        if (imc < 18.5) {
            response = new ImcResponse(imc, "Abaixo do Peso", "Elevado");
        } else if (imc < 25) {
            response = new ImcResponse(imc, "Peso Ideal", "Inexistente");
        } else if (imc < 30) {
            response = new ImcResponse(imc, "Excesso de Peso", "Elevado");
        } else if (imc < 35) {
            response = new ImcResponse(imc, "Obesidade Grau 1", "Muito Elevado");
        } else if (imc < 40) {
            response = new ImcResponse(imc, "Obesidade Grau 2", "Muitíssimo Elevado");
        } else {
            response = new ImcResponse(imc, "Obesidade Grau 3", "Obesidade Mórbida");
        }

        return ResponseEntity.status(200).body(response);
    }
}

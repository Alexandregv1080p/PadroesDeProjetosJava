package org.example.Facade;

import org.example.Facade.subsistema_cep.CepApi;
import org.example.Facade.subsistema_crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}

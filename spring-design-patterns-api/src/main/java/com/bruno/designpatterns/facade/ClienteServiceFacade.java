
package com.bruno.designpatterns.facade;

import com.bruno.designpatterns.model.entity.Cliente;
import com.bruno.designpatterns.repository.ClienteRepository;
import com.bruno.designpatterns.singleton.LoggerSingleton;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceFacade {

    private final ClienteRepository repository;
    private final LoggerSingleton logger = LoggerSingleton.getInstance();

    public ClienteServiceFacade(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        logger.log("Listando todos os clientes");
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        logger.log("Buscando cliente ID: " + id);
        return repository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        logger.log("Salvando cliente: " + cliente.getNome());
        return repository.save(cliente);
    }

    public void deletar(Long id) {
        logger.log("Deletando cliente ID: " + id);
        repository.deleteById(id);
    }
}

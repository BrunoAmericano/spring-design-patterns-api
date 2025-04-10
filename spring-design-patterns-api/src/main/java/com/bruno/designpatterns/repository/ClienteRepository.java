
package com.bruno.designpatterns.repository;

import com.bruno.designpatterns.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}

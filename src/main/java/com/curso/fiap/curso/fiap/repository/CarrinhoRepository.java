package com.curso.fiap.curso.fiap.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.fiap.curso.fiap.model.entity.Carrinho;
import com.curso.fiap.curso.fiap.model.entity.Usuario;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

  List<Carrinho> findByUsuario(Usuario usuario);

}

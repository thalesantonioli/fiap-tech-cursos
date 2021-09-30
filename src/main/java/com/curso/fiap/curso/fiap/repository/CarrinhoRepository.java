package com.curso.fiap.curso.fiap.repository;

import com.curso.fiap.curso.fiap.entity.Carrinho;
import com.curso.fiap.curso.fiap.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>{

    List<Carrinho> findByUsuario(Usuario usuario);

}

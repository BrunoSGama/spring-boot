package br.com.home.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.home.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}

package com.lschulze.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lschulze.forum.DTO.TopicoDto;
import com.lschulze.forum.model.Curso;
import com.lschulze.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
}

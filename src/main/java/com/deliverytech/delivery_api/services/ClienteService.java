package com.deliverytech.delivery_api.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery_api.dto.ClienteResponseDTO;
import com.deliverytech.delivery_api.dto.ClienteResquetDTO;
import com.deliverytech.delivery_api.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deliverytech.delivery_api.dto.response.ClienteResponseDTO;


public class ClienteService {


    ClienteResponseDTO cadastrar(ClienteResquetDTO dto);

    ClienteResponseDTO buscarPorId(Long id);

    ClienteResponseDTO atualizar(Long id, ClienteResquetDTO dto);

    ClienteResponseDTO inativar(Long id);

    List<ClienteResponseDTO> listarTodos();

    List<ClienteResponseDTO> buscarPorNome(String nome);
}
